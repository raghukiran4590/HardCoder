package hibernate;

public class OneToMany {
/*

    // 2. @OneToMany:
    @Entity
    public class Department {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        //This makes the employees collection to load lazily or eagerly
        @OneToMany(mappedBy = "department", fetch = fetchType.LAZY/EAGER)
        private List<Employee> employees = new ArrayList<>();

        // Getters and setters
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

        // Getters and setters
    }
*/

    public static void main(String[] args) {
        System.out.println("Hibernate @OneToMany mapping");
    }
}
