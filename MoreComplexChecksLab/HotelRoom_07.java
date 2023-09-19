package MoreComplexChecksLab;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int daysCount = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0.0;
        double priceApartment = 0.0;

        if(month.equals("May") || month.equals("October")){
            priceStudio = 50 * daysCount;
            priceApartment = 65 * daysCount;

            if(daysCount > 7 && daysCount < 14){
                priceStudio = priceStudio * 0.95;
            }else if(daysCount > 14){
                priceStudio = priceStudio * 0.70;
                priceApartment = priceApartment * 0.90;

            }

        }else if(month.equals("June") || month.equals("September")){
            priceStudio = 75.20 *daysCount;
            priceApartment = 68.70 * daysCount;

            if(daysCount > 14){
                priceStudio = priceStudio * 0.80;
                priceApartment = priceApartment * 0.90;
            }


        }else if(month.equals("July") || month.equals("August")){
            priceStudio = 76 * daysCount;
            priceApartment = 77 * daysCount;

            if(daysCount > 14){
                priceApartment = priceApartment * 0.90;
            }

        }

        System.out.printf("Apartment: %.2f lv.\n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);
    }
}
