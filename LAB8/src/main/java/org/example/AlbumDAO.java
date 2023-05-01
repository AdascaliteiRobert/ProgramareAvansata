package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.sql.Statement;

public class AlbumDAO {

    public void create(int releaseYear, String title, String artistName, String genreNames) throws SQLException {
        Connection con = Database.getConnection();
        Integer artistId = new ArtistDAO().findByName(artistName);
        if (artistId == null) {
            throw new IllegalArgumentException("Artist not found: " + artistName);
        }
        String[] genres = genreNames.split(",");
        List<Integer> genreIds = new ArrayList<>();
        for (String genre : genres) {
            Integer genreId = new GenreDAO().findByName(genre);
            if (genreId == null) {
                throw new IllegalArgumentException("Genre not found: " + genre);
            }
            genreIds.add(genreId);
        }
        try (PreparedStatement pstmt = con.prepareStatement(
                "insert into albums (release_year, title, artist_id) values (?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setInt(1, releaseYear);
            pstmt.setString(2, title);
            pstmt.setInt(3, artistId);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Inserting album failed, no rows affected.");
            }
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int albumId = generatedKeys.getInt(1);
                    try (PreparedStatement pstmt2 = con.prepareStatement(
                            "insert into album_genres (album_id, genre_id) values (?, ?)")) {
                        for (int genreId : genreIds) {
                            pstmt2.setInt(1, albumId);
                            pstmt2.setInt(2, genreId);
                            pstmt2.executeUpdate();
                        }
                    }
                } else {
                    throw new SQLException("Inserting album failed, no ID obtained.");
                }
            }
        }
    }

    public List<String> findByArtist(String artistName) throws SQLException {
        Connection con = Database.getConnection();
        Integer artistId = new ArtistDAO().findByName(artistName);
        if (artistId == null) {
            throw new IllegalArgumentException("Artist not found: " + artistName);
        }
        try (PreparedStatement pstmt = con.prepareStatement(
                "select title from albums where artist_id=?")) {
            pstmt.setInt(1, artistId);
            try (ResultSet rs = pstmt.executeQuery()) {
                List<String> albums = new ArrayList<>();
                while (rs.next()) {
                    albums.add(rs.getString(1));
                }
                return albums;
            }
        }
    }

    public List<String> findAll() throws SQLException {
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement(
                "select title from albums")) {
            try (ResultSet rs = pstmt.executeQuery()) {
                List<String> albums = new ArrayList<>();
                while (rs.next()) {
                    albums.add(rs.getString(1));
                }
                return albums;
            }
        }
    }
}