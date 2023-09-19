package ChecksLab;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddiesCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int lorriesCount = Integer.parseInt(scanner.nextLine());

        int toysSum = puzzleCount + dollsCount + teddiesCount + minionsCount + lorriesCount;
        double toysPrice = puzzleCount * 2.60 + dollsCount * 3 + teddiesCount * 4.10 + minionsCount * 8.20 + lorriesCount * 2;

        if (toysSum >= 50){
            toysPrice = toysPrice * 0.75;
        }

        toysPrice = toysPrice * 0.9;

        double diff = Math.abs(toysPrice - tripPrice);

        if(toysPrice >= tripPrice){
            System.out.printf("Yes! %.2f lv left.", diff);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }

    }
}
