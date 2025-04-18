package hibernate;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;

public class GetLoadMethods {

     /*   private static final SessionFactory sessionFactory;

        static {
            try {
                // Create the SessionFactory
                sessionFactory = new Configuration().configure().buildSessionFactory();
            } catch (Throwable ex) {
                throw new ExceptionInInitializerError(ex);
            }
        }*/

        public static void main(String[] args) {
            // Example usage of get() method
            /*Session session1 = sessionFactory.openSession();
            session1.beginTransaction();
            Book book1 = (Book) session1.get(Book.class, 1L); // Assuming book with id 1 exists
            System.out.println("Book retrieved using get(): " + book1);
            session1.getTransaction().commit();
            session1.close();

            // Example usage of load() method
            Session session2 = sessionFactory.openSession();
            session2.beginTransaction();
            Book book2 = (Book) session2.load(Book.class, 2L); // Assuming book with id 2 exists
            System.out.println("Book retrieved using load(): " + book2); // No database query executed yet
            session2.getTransaction().commit(); // Database query executed here, if necessary
            System.out.println("Book retrieved using load() after transaction commit: " + book2);
            session2.close();*/

            System.out.println("Example usage of Get and Load methods in Hibernate");
        }
    }
