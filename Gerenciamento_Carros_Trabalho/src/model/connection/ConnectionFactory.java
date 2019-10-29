package model.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author adils
 */
public class ConnectionFactory {
    
    private static EntityManagerFactory emf  = Persistence.createEntityManagerFactory("MeuPU");
    
    public EntityManager getConnection(){
        return emf.createEntityManager();
    }
}
