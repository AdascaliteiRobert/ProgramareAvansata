package org.example.repository;

import org.example.PersistenceUnitManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.List;

public abstract class AbstractRepository<T> {
    protected final EntityManager entityManager;
    private final Class<T> entityClass;

    public AbstractRepository(EntityManagerFactory emf, Class<T> entityClass) {
        entityManager = PersistenceUnitManager.getInstance().getEntityManagerFactory().createEntityManager();
        this.entityClass = entityClass;
    }

    public void create(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    public T findById(Long id) {
        return entityManager.find(entityClass, id);
    }

    public void update(T entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    public void delete(T entity) {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    public List<T> findByName(String pattern) {
        TypedQuery<T> query = entityManager.createNamedQuery(entityClass.getSimpleName() + ".findByName", entityClass);
        query.setParameter("name", "%" + pattern + "%");
        return query.getResultList();
    }
}