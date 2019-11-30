package t2.gevorderdecursusttwo.les08_databases.users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserApp {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("java-gevorderd");

    public static void main(String[] args) {
        makeUser("Ben", "Parker", 58, "Queens", 6790);

    }

    public static void makeUser(String userFirstName, String userLastName, int userAge, String streetAdress, int zipcode) {

        User user = userCreation(userFirstName, userLastName, userAge);
        Adress adress = userAdress(streetAdress, zipcode);

        user.setAdress(adress);
        adress.setUser(user);

        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            // Save the customer object
            entityManager.persist(user);//pas eerst deze
            entityManager.persist(adress);//later -> foreignkey restriction

            entityTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityTransaction.rollback();
        } finally {
            entityManager.close();
        }
    }

    private static Adress userAdress(String streetAdress, int zipcode) {
        Adress adress = new Adress();
        adress.setStreet(streetAdress);
        adress.setZipCode(zipcode);
        return adress;
    }

    private static User userCreation(String userFirstName, String userLastName, int userAge) {
        User user = new User();
        user.setFirstName(userFirstName);
        user.setLastName(userLastName);
        user.setAge(userAge);
        return user;
    }


}
