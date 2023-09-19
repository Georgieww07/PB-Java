package WhileLoop;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double sum = 0;
        String input = scanner.nextLine();
        while (!input.equals("NoMoreMoney")){
            double sumInNumber = Double.parseDouble(input);

            if (sumInNumber < 0){
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f\n",sumInNumber);

            sum += sumInNumber;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
