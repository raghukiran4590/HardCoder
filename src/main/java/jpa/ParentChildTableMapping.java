package jpa;

public class ParentChildTableMapping {

/*    @Entity
    public class Department {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @OneToMany(mappedBy = "department")
        private List<Employee> employees;

        // getters and setters
    }

    @Entity
    public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @ManyToOne
        @JoinColumn(name = "department_id")
        private Department department;

        // getters and setters
    }*/

    public static void main(String[] args) {
        System.out.println("One-to-Many & Many-to-One JPA Mapping Demo");
    }
}
