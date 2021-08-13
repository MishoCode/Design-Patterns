package decorator;

public class Coffee extends AbstractBeverage {

    public Coffee(double price) {
        super(price);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
