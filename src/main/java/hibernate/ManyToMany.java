package hibernate;

//import javax.persistence.*;
//import java.util.Set;

public class ManyToMany {
/*

    // 4. @ManyToMany:
    @Entity
    public class Author {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;

        @ManyToMany(mappedBy = "authors")
        private Set<Book> books;

        // Getters and setters
    }

    @Entity
    public class Book {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;

        @ManyToMany
        @JoinTable(
                name = "book_author",
                joinColumns = @JoinColumn(name = "book_id"),
                inverseJoinColumns = @JoinColumn(name = "author_id"))
        private Set<Author> authors;

        // Getters and setters
    }
*/

    public static void main(String[] args) {
        System.out.println("Hibernate @ManyToMany mapping");
    }
}
