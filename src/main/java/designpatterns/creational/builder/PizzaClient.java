package designpatterns.creational.builder;

import java.util.Arrays;

/*
create pizza class with attributes
create pizzabuilder class with attributes
in main class, create pizza using pizzabuilder object constructor and build the pizza object
*/

public class PizzaClient {

    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder("Pan", "Red")
                        .addToppings(Arrays.asList("Pineapple", "Jalepeno", "Mushroom", "Chicken"))
                        .build();
        System.out.println(pizza.getDough());
        System.out.println(pizza.getSauce());
        System.out.println(pizza.getToppings());
    }
}
