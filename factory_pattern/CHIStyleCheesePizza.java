public class CHIStyleCheesePizza extends Pizza {

    public CHIStyleCheesePizza() {
        name = "Chicago Deep Dish Style Cheese Pizza";
        dough = "Extra thick crust";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded Mozarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}