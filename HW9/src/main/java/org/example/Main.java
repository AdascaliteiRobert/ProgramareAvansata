package org.example;

import org.example.entity.Album;
import org.example.entity.Artist;
import org.example.entity.Song;
import org.example.repository.AlbumRepository;
import org.example.repository.ArtistRepository;
import org.example.repository.SongRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Artist");
        ArtistRepository artistRepository = new ArtistRepository(emf);
        AlbumRepository albumRepository = new AlbumRepository(emf);
        SongRepository songRepository = new SongRepository(emf);

//        Artist artist=new Artist("Lady Gaga");
//        artistRepository.create(artist);
//        Album album=new Album("Born This Way", artist, 2011, "Electro House");
//        albumRepository.create(album);
//        Song song = new Song("Judas", album);
//        songRepository.create(song);
//
//        System.out.println("findById pentru artist: " + artistRepository.findById(1L));
//        System.out.println("findByName pentru artist dupa pattern: " + artistRepository.findByName("ga"));
//        System.out.println("findArtistAlbums pentru artist: " + artistRepository.findArtistsAlbums(1L));
//
//
//
//        System.out.println("findByName pt album dupa pattern: " + albumRepository.findByName("Way"));
//        System.out.println("findById pentru album: " + albumRepository.findById(1L));
//        System.out.println("findAlbumsSong: " + albumRepository.findAlbumsSongs(1L));
//
//        System.out.println("findById pentru song: " + songRepository.findById(1L));
//        System.out.println("findByName pentru song: " + songRepository.findByName("as"));

        TestJPA testJPA = new TestJPA();
        testJPA.test();
    }
}


//<?xml version="1.0" encoding="UTF-8"?>
//<persistence version="2.1" xmlns="http://xmlns.jcp.org/xml/ns/persistence"
//        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//        xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence
//        http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd">
//<persistence-unit name="org.hibernate.tutorial.jpa" transaction-type="RESOURCE_LOCAL">
//<class>org.example.Albums</class>
//<properties>
//<property name="hibernate.connection.driver_class" value="com.mysql.cj.jdbc.Driver"/>
//<property name="hibernate.connection.url" value="jdbc:mysql://localhost:3306/albums?useUnicode=true&amp;useJDBCCompliantTimezoneShift=true&amp;useLegacyDatetimeCode=false&amp;serverTimezone=UTC"/>
//<property name="hibernate.connection.username" value="root"/>
//<property name="hibernate.connection.password" value="robert2002"/>
//<property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect"/>
//<property name="hibernate.connection.CharSet" value="utf8"/>
//<property name="hibernate.connection.characterEncoding" value="utf8"/>
//<property name="hibernate.connection.useUnicode" value="true"/>
//<property name="hibernate.show_sql" value="true"/>
//<property name="hibernate.hbm2ddl.auto" value="update"/>
//</properties>
//</persistence-unit>
//</persistence>