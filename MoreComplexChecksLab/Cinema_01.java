package MoreComplexChecksLab;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String broadcast = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int areaOfHall = rows * columns;
        double ticketPrice = 0;

        switch(broadcast){
            case "Premiere":
                ticketPrice = 12.00;
                break;
            case "Normal":
                ticketPrice = 7.50;
                break;
            case "Discount":
                ticketPrice = 5.00;
                break;
        }

        double income = areaOfHall * ticketPrice;
        System.out.printf("%.2f leva.", income);
    }
}
