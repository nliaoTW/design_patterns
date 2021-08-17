public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chiStore = new CHIPizzaStore();
        PizzaStore caStore = new CAPizzaStore();

        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println("Mario ordered a " + nyPizza.getName() + "\n");

        Pizza chiPizza = chiStore.orderPizza("cheese");
        System.out.println("Luigi ordered a " + chiPizza.getName() + "\n");

        Pizza caPizza = caStore.orderPizza("cheese");
        System.out.println("Bart ordered a " + caPizza.getName() + "\n");
    }
}