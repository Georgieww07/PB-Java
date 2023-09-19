package FirstStepsInProgramming;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sqMetres = Double.parseDouble(scanner.nextLine());
        double sum = sqMetres * 7.61;
        double discount = 0.18 * sum;
        double finalSum = sum - discount;

        System.out.printf("The final price is: %.2f lv.\n", finalSum);
        System.out.printf("The discount is: %.2f", discount);
    }
}
