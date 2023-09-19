package ChecksLab;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int gpuCount = Integer.parseInt(scanner.nextLine());
        int cpuCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        int gpuPrice = gpuCount * 250;
        double cpuPrice = cpuCount * (gpuPrice * 0.35);
        double ramPrice = ramCount * (gpuPrice * 0.10);

        double totalSum = gpuPrice + cpuPrice + ramPrice;

        if (gpuCount > cpuCount){
            totalSum = totalSum * 0.85;   // totalSum = totalSum - (totalSum * 0.15)
        }

        double diff = Math.abs(budget - totalSum);

        if (budget >= totalSum){
            System.out.printf("You have %.2f leva left!", diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);

        }


    }
}
