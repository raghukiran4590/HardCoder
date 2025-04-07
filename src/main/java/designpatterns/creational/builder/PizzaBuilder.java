package designpatterns.creational.builder;

import java.util.List;

public class PizzaBuilder {
    String dough;
    String sauce;
    List<String> toppings;

    public PizzaBuilder(String dough, String sauce) {
        this.dough = dough;
        this.sauce = sauce;
    }

    public PizzaBuilder addToppings(List<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }

}
