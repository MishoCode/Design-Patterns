package decorator;

public abstract class BeverageDecorator implements Beverage {

    protected Beverage decoratedBeverage;

    public BeverageDecorator(Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }

    public abstract double getPrice();
}
