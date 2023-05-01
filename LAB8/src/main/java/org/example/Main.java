package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.util.List;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            var artists = new ArtistDAO();
            artists.create("Pink Floyd");
            artists.create("Michael Jackson");

            var genres = new GenreDAO();
            genres.create("Rock");
            genres.create("Funk");
            genres.create("Soul");
            genres.create("Pop");

            Database.getConnection().commit();

            var albums = new AlbumDAO();
            albums.create(1979, "The Wall", "Pink Floyd", "Rock");
            albums.create(1982, "Thriller", "Michael Jackson", "Funk,Soul,Pop");

            System.out.println("Albums by Pink Floyd:");
            List<String> pinkFloydAlbums = albums.findByArtist("Pink Floyd");
            for (String album : pinkFloydAlbums) {
                System.out.println(album);
            }

            System.out.println("\nAll albums in the database:");
            List<String> allAlbums = albums.findAll();
            for (String album : allAlbums) {
                System.out.println(album);
            }

            Database.getConnection().close();
        } catch (SQLException e) {
            System.err.println(e);
            Database.rollback();
        }
    }
}

//    CREATE TABLE artists (
//        id INTEGER PRIMARY KEY AUTO_INCREMENT,
//        name VARCHAR(255) NOT NULL
//);
//
//        CREATE TABLE genres (
//        id INTEGER PRIMARY KEY AUTO_INCREMENT,
//        name VARCHAR(255) NOT NULL
//        );
//        CREATE TABLE albums (
//        id INTEGER PRIMARY KEY AUTO_INCREMENT,
//        release_year INTEGER NOT NULL,
//        title VARCHAR(255) NOT NULL,
//        artist_id INTEGER NOT NULL,
//        FOREIGN KEY (artist_id) REFERENCES artists(id)
//        );
//        CREATE TABLE album_genres (
//        album_id INTEGER NOT NULL,e
//        genre_id INTEGER NOT NULL,
//        PRIMARY KEY (album_id, genre_id),
//        FOREIGN KEY (album_id) REFERENCES albums(id),
//        FOREIGN KEY (genre_id) REFERENCES genres(id)
//        );