package FirstStepsInProgrammingLab;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int litresDetergant = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double pensSum = pens * 5.80;
        double markersSum = markers * 7.20;
        double litresDetergantSum = litresDetergant * 1.20;

        double sum = pensSum + markersSum + litresDetergantSum;
        double finalSum = sum - (sum * (discount / 100));

        System.out.println(finalSum);
    }
}
