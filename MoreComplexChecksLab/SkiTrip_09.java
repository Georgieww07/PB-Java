package MoreComplexChecksLab;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysForRelax = Integer.parseInt(scanner.nextLine());
        String typeOfAccommodation = scanner.nextLine();
        String rate = scanner.nextLine();

        double priceHoliday = 0;
        daysForRelax = daysForRelax - 1;

        switch(typeOfAccommodation){
            case "room for one person":
                priceHoliday = daysForRelax * 18;
                break;

            case "apartment":
                priceHoliday = daysForRelax * 25;

                if(daysForRelax < 9){
                    priceHoliday = priceHoliday * 0.7;
                }else if(daysForRelax > 14){
                    priceHoliday = priceHoliday * 0.5;
                }else {
                    priceHoliday = priceHoliday * 0.65;
                }

                break;

            case "president apartment":
                priceHoliday = daysForRelax * 35;

                if(daysForRelax < 9){
                    priceHoliday = priceHoliday * 0.9;
                }else if(daysForRelax > 14){
                    priceHoliday = priceHoliday * 0.8;
                }else {
                    priceHoliday = priceHoliday * 0.85;
                }

                break;
        }

        if(rate.equals("positive")){
            priceHoliday = priceHoliday + (priceHoliday * 0.25);
        }else if(rate.equals("negative")){
            priceHoliday = priceHoliday - (priceHoliday * 0.1);
        }

        System.out.printf("%.2f", priceHoliday);
    }
}
