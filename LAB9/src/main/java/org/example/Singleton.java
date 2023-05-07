package org.example;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * The type Singleton.
 */
public class Singleton {

    private static Singleton instance = null;
    private EntityManagerFactory entityManagerFactory;

    private Singleton() {
        entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Gets entity manager factory.
     *
     * @return the entity manager factory
     */
    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

}