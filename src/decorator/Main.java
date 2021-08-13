package decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee(2.2);
        System.out.println(coffee1.getPrice()); // 2.2

        Beverage coffeeWithMilk = new BeverageWithMilkDecorator(new Coffee(2.2));
        System.out.println(coffeeWithMilk.getPrice()); // 3.2

        Beverage teaWithMilkAndExtraSugar =
                new BeverageWithExtraSugarDecorator(
                        new BeverageWithMilkDecorator(
                                new Tea(1.5)));
        System.out.println(teaWithMilkAndExtraSugar.getPrice()); // 3.0
    }
}
