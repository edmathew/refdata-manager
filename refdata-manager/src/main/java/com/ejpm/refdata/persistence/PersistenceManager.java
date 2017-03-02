
package com.ejpm.refdata.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author edgar.mateus
 */
public enum PersistenceManager {
    
    REFERENCE_DATA;
    
    private final EntityManagerFactory emFactory;
    
    private PersistenceManager(){
        emFactory = Persistence.createEntityManagerFactory("refdata-persistence");
    }

    public EntityManager getEntityManager(){
        return emFactory.createEntityManager();
    }
    
    public void close(){
        emFactory.close();
    }
    
}
