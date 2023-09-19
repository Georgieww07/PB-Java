package PreExam;

import java.util.Scanner;

public class SantasHoliday_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int days = Integer.parseInt(scanner.nextLine());
        String accommodation = scanner.nextLine();
        String rate = scanner.nextLine();

        days = days - 1;

        double priceHoliday = 0;


        switch (accommodation){
            case "room for one person":

                priceHoliday = days * 18;

                break;


            case "apartment":

                priceHoliday = days * 25;

                if (days < 10){
                    priceHoliday = priceHoliday * 0.7;
                }else if (days <= 15){
                    priceHoliday = priceHoliday * 0.65;
                }else {
                    priceHoliday = priceHoliday * 0.5;
                }

                break;


            case "president apartment":

                priceHoliday = days * 35;

                if (days < 10){
                    priceHoliday = priceHoliday * 0.9;
                }else if (days <= 15){
                    priceHoliday = priceHoliday * 0.85;
                }else {
                    priceHoliday = priceHoliday * 0.8;
                }

                break;
        }

        if (rate .equals("positive")){
            priceHoliday = priceHoliday + (priceHoliday * 0.25);
        }else if (rate.equals("negative")){
            priceHoliday = priceHoliday - (priceHoliday * 0.1);
        }

        System.out.printf("%.2f", priceHoliday);





















    }
}
