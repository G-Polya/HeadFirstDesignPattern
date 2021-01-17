package Factory.SimpleFactory;

public class PepproniPizza extends Pizza {
    public PepproniPizza() {
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinar sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
