package state;

public class Main {
    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new PizzaOrder(new OrderPizzaState(), "123-abc-W");
        pizzaOrder.update();
        pizzaOrder.update();
        pizzaOrder.update();
        pizzaOrder.update(); //the delivery is finished
        pizzaOrder.update(); //invitation for a new order
        pizzaOrder.update(); //invitation for a new order

        pizzaOrder.setFinished(false);
        pizzaOrder.setCurrentState(null);
        pizzaOrder.update();
        pizzaOrder.update();
    }
}
