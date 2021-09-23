package command;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UniversitySystem receiver =
                new UniversitySystem("Pernik university of applied sciences");
        CommandLineRunner.run(receiver);
    }
}
