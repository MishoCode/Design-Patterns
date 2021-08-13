package decorator;

public class Tea extends AbstractBeverage {

    public Tea(double price) {
        super(price);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
