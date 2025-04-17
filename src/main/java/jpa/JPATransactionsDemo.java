package jpa;

public class JPATransactionsDemo {

    public static void main(String[] args) {

        /*
        //Create(Persist) Operation
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        User user = new User();
        user.setName("John Doe");
        user.setEmail("john@example.com");

        entityManager.persist(user);

        entityManager.getTransaction().commit();
        entityManager.close();

        //Read(Retrieve) Operation
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        User user = entityManager.find(User.class, userId);
        entityManager.close();

        //Update(Merge) Operation
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        User user = entityManager.find(User.class, userId);
        if (user != null) {
            user.setName("Jane Doe");
            entityManager.merge(user);
        }

        entityManager.getTransaction().commit();
        entityManager.close();

        //Delete(Remove) Operation
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        User user = entityManager.find(User.class, userId);
        if (user != null) {
            entityManager.remove(user);
        }

        entityManager.getTransaction().commit();
        entityManager.close();
        */

        System.out.println("JPA CRUD Operations Demo");

    }

}
