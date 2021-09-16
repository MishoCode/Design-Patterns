package state;

import java.time.LocalDateTime;

public class OrderPizzaState implements State {

    //private String restaurant;

    @Override
    public void updateState(PizzaOrder pizzaOrder) {
        System.out.println("The pizza was ordered at: " + LocalDateTime.now() +
                "! Your order number is: " + pizzaOrder.getOrderId());
        //Thread.sleep(5000);
        pizzaOrder.setCurrentState(new CookedPizzaState());
    }
}
