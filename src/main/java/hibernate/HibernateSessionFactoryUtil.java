package hibernate;

//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
/*
        private static final SessionFactory sessionFactory = buildSessionFactory();

        private static SessionFactory buildSessionFactory() {
            try {
                // Create the SessionFactory from hibernate.cfg.xml
                return new Configuration().configure().buildSessionFactory();
            } catch (Throwable ex) {
                // Make sure you log the exception to track the error
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }

        public static SessionFactory getSessionFactory() {
            return sessionFactory;
        }

        public static void shutdown() {
            // Close caches and connection pools
            getSessionFactory().close();
        }*/

    public static void main(String[] args) {
        System.out.println("Hibernate Util class for session factory");
    }
}
