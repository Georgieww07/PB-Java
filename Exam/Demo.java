package PreExam;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double sumMinedGold = 0;
        double averageMinedGold = 0;

        int countLocations = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= countLocations; i++) {

            double expectedGoldPerDay = Double.parseDouble(scanner.nextLine());
            int daysToMine = Integer.parseInt(scanner.nextLine());

            for (int currentDay = 1; currentDay <= daysToMine; currentDay++) {

                double currentMinedGold = Double.parseDouble(scanner.nextLine());

                sumMinedGold += currentMinedGold;



            }
             averageMinedGold = sumMinedGold / daysToMine;

            if (averageMinedGold >= expectedGoldPerDay){
                System.out.printf("Good job! Average gold per day: %.2f.\n", averageMinedGold);
                sumMinedGold = 0;
            }else {
                System.out.printf("You need %.2f gold.", expectedGoldPerDay - averageMinedGold);
                sumMinedGold = 0;
            }
            
        }
    }
}
