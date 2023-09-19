package MoreComplexChecksLab;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                /*Цената зависи от сезона:
     •	Цената за наем на кораба през пролетта е  3000 лв.
     •	Цената за наем на кораба през лятото и есента е  4200 лв.
     •	Цената за наем на кораба през зимата е  2600 лв.
                В зависимост от броя си групата ползва отстъпка:
     •	Ако групата е до 6 човека включително  –  отстъпка от 10%.
     •	Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
     •	Ако групата е от 12 нагоре  –  отстъпка от 25%.*/


        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanCount = Integer.parseInt(scanner.nextLine());

        double totalSum = 0.0;

        switch(season){
            case "Spring":

                totalSum = 3000;

                if(fishermanCount <= 6){
                    totalSum = totalSum * 0.9;
                }else if(fishermanCount <= 11){
                    totalSum = totalSum * 0.85;
                }else{
                    totalSum = totalSum * 0.75;
                }

                if(fishermanCount % 2 == 0){
                    totalSum = totalSum * 0.95;
                }

                break;

            case "Summer":

                totalSum = 4200;

                if(fishermanCount <= 6){
                    totalSum = totalSum * 0.9;
                }else if(fishermanCount <= 11){
                    totalSum = totalSum * 0.85;
                }else{
                    totalSum = totalSum * 0.75;
                }

                if(fishermanCount % 2 == 0){
                    totalSum = totalSum * 0.95;
                }


                break;

            case "Autumn":

                totalSum = 4200;

                if(fishermanCount <= 6){
                    totalSum = totalSum * 0.9;
                }else if(fishermanCount <= 11){
                    totalSum = totalSum * 0.85;
                }else{
                    totalSum = totalSum * 0.75;
                }

                break;

            case "Winter":

                totalSum = 2600;

                if(fishermanCount <= 6){
                    totalSum = totalSum * 0.9;
                }else if(fishermanCount <= 11){
                    totalSum = totalSum * 0.85;
                }else{
                    totalSum = totalSum * 0.75;
                }

                if(fishermanCount % 2 == 0){
                    totalSum = totalSum * 0.95;
                }


                break;

        }

        double diff = Math.abs(budget - totalSum);

        if(budget >= totalSum){
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }

    }
}
