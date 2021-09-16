package state;

public class PizzaOrder {
    private State currentState;
    private String orderId;
    boolean finished = false;
    //double price;

    public PizzaOrder(State currentState, String orderId) {
        setCurrentState(currentState);
        this.orderId = orderId;
    }

    public State getCurrentState() {
        return currentState;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        if (currentState == null) {
            this.currentState = new OrderPizzaState();
        }
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public void update() {
        if (!finished) {
            currentState.updateState(this);
        } else {
            System.out.println("The delivery has already been finished." +
                    " Would you like to order again?");
        }
    }
}
