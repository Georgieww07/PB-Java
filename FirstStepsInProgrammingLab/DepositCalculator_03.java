package FirstStepsInProgrammingLab;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int depositTerm = Integer.parseInt(scanner.nextLine());
        double lihvenPercantage = Double.parseDouble(scanner.nextLine());

        double sum =  depositSum  + depositTerm * ((depositSum * (lihvenPercantage / 100)) / 12);

        System.out.println(sum);
    }
}
