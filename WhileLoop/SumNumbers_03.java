package WhileLoop;

import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetNumber = Integer.parseInt(scanner.nextLine());

        int sumNumbers = 0;

        while (sumNumbers < targetNumber){
            int num = Integer.parseInt(scanner.nextLine());
            sumNumbers += num;
        }
        System.out.println(sumNumbers);
    }
}
