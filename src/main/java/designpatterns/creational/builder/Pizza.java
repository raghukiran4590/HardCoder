package designpatterns.creational.builder;

import java.util.List;

public class Pizza {

    private String dough;
    private String sauce;
    private List<String> toppings;

    public String getDough() {
        return dough;
    }


    public String getSauce() {
        return sauce;
    }


    public List<String> getToppings() {
        return toppings;
    }


    public Pizza(PizzaBuilder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.toppings = builder.toppings;
    }
}
