package hibernate.inheritance;

public class SingleTableInheritance {
/*
    @Entity
    @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
    @DiscriminatorColumn(name = "book_type", discriminatorType = DiscriminatorType.STRING)
    public abstract class Book {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        // Common attributes and methods
    }

    @Entity
    @DiscriminatorValue("fiction")
    public class FictionBook extends Book {
        private String genre;
        // Fiction-specific attributes and methods
    }

    @Entity
    @DiscriminatorValue("non_fiction")
    public class NonFictionBook extends Book {
        private String topic;
        // Non-fiction-specific attributes and methods
    }*/

    public static void main(String[] args) {
        System.out.println("Single Table Inheritance");
    }
}
