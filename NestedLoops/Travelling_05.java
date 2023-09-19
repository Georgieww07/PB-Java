package NestedLoops;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")){
            double neededMoney = Double.parseDouble(scanner.nextLine());

            double availableMoney = 0;

            while (availableMoney < neededMoney){
                double currentMoney = Double.parseDouble(scanner.nextLine());

                availableMoney += currentMoney;

            }
                System.out.println("Going to " + destination + "!");

            destination = scanner.nextLine();
        }
    }
}
