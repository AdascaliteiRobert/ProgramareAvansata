package org.example.repository;

import org.example.PersistenceUnitManager;
import org.example.entity.Album;
import org.example.entity.Artist;
import org.example.entity.Song;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.List;


public class AlbumRepository extends AbstractRepository<Album> {
    public AlbumRepository(EntityManagerFactory emf) {
        super(emf, Album.class);
    }

    public List<Song> findAlbumsSongs(Long albumId) {
        TypedQuery<Song> query = entityManager.createQuery(
                "SELECT s FROM Song s WHERE s.idAlbum.id = :albumId", Song.class);
        query.setParameter("albumId", albumId);
        return query.getResultList();
    }
}