package ForLoopLab;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        int countToys = 0;
        double priceForToys = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                sum += i * 5 - 1;
            } else {
                countToys++;
                priceForToys = priceToy * countToys;
            }

        }

        sum = sum + priceForToys;
        double diff = Math.abs(sum - priceWashingMachine);

        if (sum >= priceWashingMachine){
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }

    }
}
