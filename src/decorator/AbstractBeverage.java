package decorator;

public abstract class AbstractBeverage implements Beverage {

    protected double price;

    public AbstractBeverage(double price) {
        this.price = price;
    }

    public abstract double getPrice();
}
