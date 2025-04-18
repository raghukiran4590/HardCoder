package hibernate.inheritance;

public class TablePerSubclassInheritance {
/*

    @Entity
    @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
    public abstract class Book {
        @Id
        @GeneratedValue(strategy = GenerationType.TABLE)
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
        System.out.println("Table per Subclass Inheritance in Hibernate");
    }
}
