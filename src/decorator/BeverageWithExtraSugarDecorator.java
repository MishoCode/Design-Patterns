package decorator;

public class BeverageWithExtraSugarDecorator extends BeverageDecorator {
    public static final double EXTRA_SUGAR_PRICE = 0.5;

    public BeverageWithExtraSugarDecorator(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public double getPrice() {
        return decoratedBeverage.getPrice() + EXTRA_SUGAR_PRICE;
    }
}
