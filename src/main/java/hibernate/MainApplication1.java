package hibernate;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;

public class MainApplication1 {

    public static void main(String[] args) {


/*            // Create a SessionFactory
            SessionFactory factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Student.class)
                    .buildSessionFactory();

            // Create a session
            Session session = factory.getCurrentSession();

            try {
                // Create a new student object
                Student newStudent = new Student("John Doe", 22);

                // Start a transaction
                session.beginTransaction();

                // Save the student object
                session.save(newStudent);

                // Commit the transaction
                session.getTransaction().commit();

                // Retrieve the student
                session = factory.getCurrentSession();
                session.beginTransaction();
                Student retrievedStudent = session.get(Student.class, newStudent.getId());
                session.getTransaction().commit();

                System.out.println("Retrieved Student: " + retrievedStudent);

                // Update the student
                session = factory.getCurrentSession();
                session.beginTransaction();
                retrievedStudent.setAge(23);
                session.update(retrievedStudent);
                session.getTransaction().commit();

                // Delete the student
                session = factory.getCurrentSession();
                session.beginTransaction();
                session.delete(retrievedStudent);
                session.getTransaction().commit();

            } finally {
                factory.close();
            }

 */
        System.out.println("Example Hibernate Session");
        }
    }
