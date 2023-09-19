package FirstStepsInProgrammingLab;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int naylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int hoursForWork = Integer.parseInt(scanner.nextLine());

        double sumMaterials = (naylon + 2) * 1.50 + (paint + (0.1 * paint)) * 14.50 + razreditel * 5 + 0.4;
        double workersSum = hoursForWork * (0.3 * sumMaterials);
        double finalSum = sumMaterials + workersSum;

        System.out.println(finalSum);

    }
}
