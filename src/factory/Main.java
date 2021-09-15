package factory;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static final String SOURCE_FILE_PATH = "C:\\Users\\mmish\\Desktop\\Java\\Design Patterns\\src\\factory\\shapes";
    public static final String DEST_FILE_PATH = "C:\\Users\\mmish\\Desktop\\Java\\Design Patterns\\src\\factory\\perimeters";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File(SOURCE_FILE_PATH));
        PrintWriter writer = new PrintWriter(new FileWriter(new File(DEST_FILE_PATH)));

        while (scanner.hasNext()) {
            Shape shape = ShapeFactory.makeShape(scanner);
            if (shape == null) {
                break;
            }
            //System.out.println("The perimeter is: " + shape.getPerimeter());
            writer.println("The perimeter is: " + shape.getPerimeter());
        }

        writer.close();
        scanner.close();
    }
}
