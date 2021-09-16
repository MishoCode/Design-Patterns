package state;

import java.time.LocalDateTime;

public class OutForDeliveryState implements State {
    @Override
    public void updateState(PizzaOrder pizzaOrder) {
        System.out.println("The pizza was delivered at: " + LocalDateTime.now() +
                "! Your order number is: " + pizzaOrder.getOrderId() +
                " We are in front of your door.");
        pizzaOrder.setCurrentState(new FinishedDeliveryState());
    }
}
