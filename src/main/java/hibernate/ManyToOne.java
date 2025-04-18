package hibernate;

import java.util.ArrayList;
import java.util.List;

public class ManyToOne {

/*
    // 3. @ManyToOne:
    @Entity
    public class Order {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String orderNumber;

        @ManyToOne
        @JoinColumn(name = "customer_id")
        private Customer customer;

        // Getters and setters
    }

    @Entity
    public class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @OneToMany(mapping = "customer")
        private List<Order> orders = new ArrayList<>();

        // Getters and setters
    }
*/

    public static void main(String[] args) {
        System.out.println("Hibernate @ManyToOne mapping");
    }
}
