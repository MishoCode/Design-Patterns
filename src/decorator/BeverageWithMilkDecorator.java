package decorator;

public class BeverageWithMilkDecorator extends BeverageDecorator {
    public static final double MILK_PRICE = 1.0;

    public BeverageWithMilkDecorator(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public double getPrice() {
        return decoratedBeverage.getPrice() + MILK_PRICE;
    }
}
