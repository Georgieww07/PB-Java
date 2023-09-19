package FirstStepsInProgramming;

import java.util.Scanner;

public class InchesToCentimeters_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double centimeters = number * 2.54;

        System.out.println(centimeters);
    }
}
