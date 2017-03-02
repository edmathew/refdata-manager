
import com.ejpm.refdata.persistence.PersistenceManager;
import com.ejpm.refdata.persistence.dto.RefDataDictionaryDTO;
import javax.persistence.EntityManager;


/**
 *
 * @author edgar.mateus
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Reference Data Management");
        EntityManager em = PersistenceManager.REFERENCE_DATA.getEntityManager();
        RefDataDictionaryDTO dict = new RefDataDictionaryDTO();
        dict.setId("1");
        dict.setEntityName("Balele");
        em.persist(dict);
        em.getTransaction().commit();
        System.out.println("DONE");
    }

}
