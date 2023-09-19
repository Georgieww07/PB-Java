package PreExam;

import java.util.Scanner;

public class FootballKit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double priceTshirt = Double.parseDouble(scanner.nextLine());
        double neededSum = Double.parseDouble(scanner.nextLine());

        double priceShorts = 0.75 * priceTshirt;
        double priceSocks = 0.20 * priceShorts;
        double priceBoots = (priceShorts + priceTshirt) * 2;

        double sum = priceTshirt + priceShorts + priceSocks + priceBoots;
        double finalSum = 0.85 * sum;

        if (finalSum >= neededSum){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", finalSum);
        }else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", neededSum - finalSum);
        }
    }
}
