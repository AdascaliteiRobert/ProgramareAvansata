package org.example;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * The type Albums repository.
 */
public class AlbumsRepository {

    private EntityManager entityManager;

    /**
     * Instantiates a new Albums repository.
     *
     * @param entityManager the entity manager
     */
    public AlbumsRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Create.
     *
     * @param album the album
     */
    public void create(Albums album) {
        entityManager.getTransaction().begin();
        entityManager.persist(album);
        entityManager.getTransaction().commit();
    }

    /**
     * Find by id albums.
     *
     * @param id the id
     * @return the albums
     */
    public Albums findById(int id) {
        TypedQuery<Albums> query = entityManager.createNamedQuery("Albums.findById", Albums.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    /**
     * Find by name list.
     *
     * @param name the name
     * @return the list
     */
    public List<Albums> findByName(String name) {
        TypedQuery<Albums> query = entityManager.createNamedQuery(
                        "Albums.findByName", Albums.class);
        query.setParameter("title", "%" + name+ "%");
        return query.getResultList();
    }

    /**
     * Close.
     */
    public void close() {
        entityManager.close();
    }
}
