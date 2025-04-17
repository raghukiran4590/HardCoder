package jpa;

public class LazyEagerFetching {
/*

    @Entity
    public class Department {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
        private List<Employee> employees;

        // Getters and setters
    }

    @Entity
    public class Department {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
        private List<Employee> employees;

        // Getters and setters
*/

        public static void main(String[] args) {
            System.out.println("Lazy and Eager fetching in JPA");
        }
    }
