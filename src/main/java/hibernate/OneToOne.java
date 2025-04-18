package hibernate;

public class OneToOne {
/*
    // 1. @OneToOne:
    @Entity
    public class Person {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @OneToOne(mappedBy = "person")
        private Address address;

        // Getters and setters
    }

    @Entity
    public class Address {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String street;
        private String city;

        @OneToOne
        @JoinColumn(name = "person_id")
        private Person person;

        // Getters and setters
    }*/

    public static void main(String[] args) {
        System.out.println("Hibernate @OneToOne to mapping");
    }
}
