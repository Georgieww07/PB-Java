package FirstStepsInProgrammingLab;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fee = Integer.parseInt(scanner.nextLine());

        double sneakers = fee - (0.4 * fee);
        double kit = sneakers - (0.20 * sneakers);
        double ball = 0.25 * kit;
        double accessories = 0.2 * ball;

        double finalSum = sneakers + kit + ball + accessories + fee;

        System.out.println(finalSum);
    }
}
