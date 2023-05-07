package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // Obtain a reference to the EntityManager
        Singleton singleton = Singleton.getInstance();
        EntityManagerFactory entityManagerFactory = singleton.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Create a new instance of the LAB9.AlbumsRepository, passing in the EntityManager
        AlbumsRepository repository = new AlbumsRepository(entityManager);

        // Create a new album
        Albums album = new Albums();
        album.setId(72131);
        album.setTitle("Aaaalaaaaa");
        album.setRelease_year(2043);
        album.setArtist_id(5);

        // Persist the album
        //repository.create(album);

        // Find the album by its ID
         //Albums foundAlbum2 = repository.findById(43);
      //  System.out.println("Found album by id: " + foundAlbum2);
        System.out.println(repository.findByName("Aa"));
        System.out.println("ANA");
        // Close the EntityManager and EntityManagerFactory
        repository.close();
        entityManager.close();
        entityManagerFactory.close();
    }
}