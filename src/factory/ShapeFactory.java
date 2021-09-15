package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ShapeFactory {

    public static Shape makeShape(Scanner scanner) throws IOException {
        String shape = scanner.next();

        if (shape.equalsIgnoreCase("Circle")) {
            int r = scanner.nextInt();
            return new Circle(r);
        } else if (shape.equalsIgnoreCase("Rectangle")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            return new Rectangle(a, b);
        } else if (shape.equalsIgnoreCase("Triangle")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            return new Triangle(a, b, c);
        } else {
            return null;
        }
    }
}
