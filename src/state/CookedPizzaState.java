package state;

import java.time.LocalDateTime;

public class CookedPizzaState implements State {
    @Override
    public void updateState(PizzaOrder pizzaOrder) {
        System.out.println("The pizza was cooked at: " + LocalDateTime.now());
        pizzaOrder.setCurrentState(new OutForDeliveryState());
    }
}
