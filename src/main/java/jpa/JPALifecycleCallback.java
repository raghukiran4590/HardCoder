package jpa;

public class JPALifecycleCallback {

/*    @Entity
    @NamedQueries({
        @NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email")
    })
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String username;
        private String email;

        //When multiple transactions attempt to update the same entity concurrently, JPA checks the version attribute's value.
        //If the version value has changed since the entity was loaded into memory,
        //it indicates that another transaction has modified the entity concurrently. This situation is referred to as a version conflict.
        @Version
        private int version;

        @PrePersist
        public void prePersist() {
            // Custom logic before persisting the entity
            System.out.println("Preparing to persist user: " + username);
        }

        @PostPersist
        public void postPersist() {
            // Custom logic after persisting the entity
            System.out.println("User persisted: " + username);
        }

        // Other entity methods, getters, and setters
    }*/

    public static void main(String[] args) {
        System.out.println("JPA Lifecycle Callbacks");
    }
}
