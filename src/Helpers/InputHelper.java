package Helpers;

import java.util.Scanner;

public class InputHelper {
    public static int inputInt(String msg) {
        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        // scanner.close();
        return value;
    }
    public static double inputDouble(String msg) {
        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        // scanner.close();
        return value;
    }
}
