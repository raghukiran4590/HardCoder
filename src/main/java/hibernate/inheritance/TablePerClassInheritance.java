package hibernate.inheritance;

public class TablePerClassInheritance {
/*

    @Entity
    @Inheritance(strategy = InheritanceType.JOINED)
    public abstract class Book {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        // Common attributes and methods
    }

    @Entity
    public class FictionBook extends Book {
        private String genre;
        // Fiction-specific attributes and methods
    }

    @Entity
    public class NonFictionBook extends Book {
        private String topic;
        // Non-fiction-specific attributes and methods
    }
*/

    public static void main(String[] args) {
        System.out.println("Table per Class Hierarchy Inheritance");
    }
}
