package PreExam;

import java.util.Scanner;

public class CatDiet_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int percentFats = Integer.parseInt(scanner.nextLine());
        int percentProteins = Integer.parseInt(scanner.nextLine());
        int percentCarbohydrates = Integer.parseInt(scanner.nextLine());
        int allCalories = Integer.parseInt(scanner.nextLine());
        int percentWater = Integer.parseInt(scanner.nextLine());

        double weightFats = percentFats * 1.00 / 100 * allCalories / 9;
        double weightProteins = percentProteins * 1.00 / 100 * allCalories / 4;
        double weightCarbohydrates = percentCarbohydrates * 1.00 / 100 * allCalories / 4;

        double weightFood = weightFats + weightProteins + weightCarbohydrates;

        double calories1GramFood = allCalories / weightFood;

        double waterPercentIn1GramFood = (percentWater * 1.00 / 100 * calories1GramFood);

        double finalCaloriesIn1GramFood = calories1GramFood - waterPercentIn1GramFood;


        System.out.printf("%.4f", finalCaloriesIn1GramFood);
    }
}
