package FirstStepsInProgrammingLab;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());

        double sum = chicken * 10.35 + fish * 12.40 + vegetarian * 8.15;
        double dessert = 0.20 * sum;

        double finalPrice = sum + dessert + 2.50;

        System.out.println(finalPrice);
    }
}
