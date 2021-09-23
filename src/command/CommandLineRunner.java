package command;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CommandLineRunner {

    public static void run(UniversitySystem receiver) {
        Scanner scanner = new Scanner(System.in);
        Invoker invoker = new Invoker(receiver);

        String line;
        while ((line = scanner.nextLine()) != null) {
            if (line.equals("exit")) {
                break;
            }
            String[] tokens = line.split("\\s+");
            invoker.execute(Arrays.asList(tokens));
        }
    }
}
