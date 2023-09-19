package ChecksLab;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extrasCount = Integer.parseInt(scanner.nextLine());
        double priceForClothesPerPerson = Double.parseDouble(scanner.nextLine());

        double decor = 0.10 * budget;
        double clothesPrice = extrasCount * priceForClothesPerPerson;

        if (extrasCount > 150){
            clothesPrice = clothesPrice * 0.9;
        }
        double totalSum = decor + clothesPrice;

        double diff = Math.abs(totalSum - budget);

        if(totalSum > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);

        }


    }
}
