package FirstStepsInProgrammingLab;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double obem = (length * width * height);
        double obemInLitres = obem / 1000;

        double waterNeeded = obemInLitres * (1 - (percentage / 100));

        System.out.println(waterNeeded);
    }
}
