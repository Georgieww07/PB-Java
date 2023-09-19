package WhileLoopLab;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int countDaysSpend = 0;
        int countAllDays = 0;

        while (availableMoney < neededMoney){

            if (countDaysSpend == 5){
                break;
            }

            countAllDays++;

            String inputCommand = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());

            switch (inputCommand){
                case "spend":

                    countDaysSpend++;
                    availableMoney -= sum;

                    break;

                case "save":

                    countDaysSpend = 0;
                    availableMoney += sum;

                    break;
            }

            if (availableMoney < 0){
                availableMoney = 0;
            }
        }
        if (countDaysSpend == 5){
            System.out.println("You can't save the money.");
            System.out.println(countAllDays);
        }else {
            System.out.printf("You saved the money for %d days.", countAllDays);
        }

    }
}
