package MoreComplexChecks;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());

        double percentage = 0;

        switch (town) {
            case "Sofia":
                if (sells >= 0 && sells <= 500) {
                    percentage = 0.05;
                } else if (sells > 500 && sells <= 1000) {
                    percentage = 0.07;
                } else if (sells > 1000 && sells <= 10000) {
                    percentage = 0.08;
                } else if (sells > 10000) {
                    percentage = 0.12;
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (sells >= 0 && sells <= 500) {
                    percentage = 0.045;
                } else if (sells > 500 && sells <= 1000) {
                    percentage = 0.075;
                } else if (sells > 1000 && sells <= 10000) {
                    percentage = 0.10;
                } else if (sells > 10000) {
                    percentage = 0.13;
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (sells >= 0 && sells <= 500) {
                    percentage = 0.055;
                } else if (sells > 500 && sells <= 1000) {
                    percentage = 0.08;
                } else if (sells > 1000 && sells <= 10000) {
                    percentage = 0.12;
                } else if (sells > 10000) {
                    percentage = 0.145;
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }

        if (percentage != 0) {
            double finalCommissions = percentage * sells;
            System.out.printf("%.2f", finalCommissions);
        }
    }
}
