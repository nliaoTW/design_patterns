public class CHIPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CHIStyleCheesePizza();
        }
//        else if (item.equals("veggie")) {
//            return new CHIStyleVeggiePizza();
//        }
//        else if (item.equals("clam")) {
//            return new CHIStyleClamPizza();
//        }
//        else if (item.equals("pepperoni")) {
//            return new CHIStylePepperoniPizza();
//        }
        else return null;
    }
}