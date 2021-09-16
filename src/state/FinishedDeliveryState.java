package state;

import java.time.LocalDateTime;

public class FinishedDeliveryState implements State {
    @Override
    public void updateState(PizzaOrder pizzaOrder) {
        System.out.println("Thanks! Enjoy your meal!");
        pizzaOrder.setFinished(true);
    }
}
