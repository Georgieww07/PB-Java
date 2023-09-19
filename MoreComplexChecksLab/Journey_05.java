package MoreComplexChecksLab;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String typeHoliday = "";
        double sum = 0.0;

        switch(season){
            case "summer":
                typeHoliday = "Camp";

                if(budget <= 100){
                    destination = "Bulgaria";
                    sum = budget * 0.30;
                }else if(budget <= 1000){
                    destination = "Balkans";
                    sum = budget * 0.40;
                }else{
                    destination = "Europe";
                    sum = budget * 0.90;
                }
                break;


            case "winter":
                typeHoliday = "Hotel";

                if(budget <= 100){
                    destination = "Bulgaria";
                    sum = budget * 0.70;
                }else if(budget <= 1000){
                    destination = "Balkans";
                    sum = budget * 0.80;
                }else{
                    destination = "Europe";
                    sum = budget * 0.90;
                }
                break;
        }
        if(destination.equals("Europe")){
            typeHoliday = "Hotel";
        }

        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", typeHoliday, sum);
    }
}
