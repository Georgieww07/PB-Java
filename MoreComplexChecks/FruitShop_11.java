package MoreComplexChecks;

import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;
        /*banana	apple	orange	grapefruit	kiwi	pineapple	grapes
        2.50	1.20	0.85	1.45	2.70	5.50	3.85*/


        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    price = 2.50;
                } else if (fruit.equals("apple")) {
                    price = 1.20;
                } else if (fruit.equals("orange")) {
                    price = 0.85;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.45;
                } else if (fruit.equals("kiwi")) {
                    price = 2.70;
                } else if (fruit.equals("pineapple")) {
                    price = 5.50;
                } else if (fruit.equals("grapes")) {
                    price = 3.85;
                } else {
                    System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    price = 2.70;
                } else if (fruit.equals("apple")) {
                    price = 1.25;
                } else if (fruit.equals("orange")) {
                    price = 0.90;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.60;
                } else if (fruit.equals("kiwi")) {
                    price = 3.00;
                } else if (fruit.equals("pineapple")) {
                    price = 5.60;
                } else if (fruit.equals("grapes")) {
                    price = 4.20;
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }

        if (price != 0) {
            double finalPrice = quantity * price;
            System.out.printf("%.2f", finalPrice);
        }
    }
}
