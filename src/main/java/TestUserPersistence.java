import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUserPersistence {
    public static void main(String args[]) {
        EntityManager entityManager = Persistence
                .createEntityManagerFactory("user-unit")
                .createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        /* Persist a User entity */
        entityTransaction.begin();
        User user = new User("Alejandro", "alejandro@domain.com", "07684 584 588");
        entityManager.persist(user);
        entityTransaction.commit();
    }
}
