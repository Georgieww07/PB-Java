package MoreComplexChecksLab;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0.0;
        String evenOdd = "";

        switch(operator){
            case "+":
                result = numberOne + numberTwo;

                if(result % 2 == 0){
                    evenOdd = "even";
                }else{
                    evenOdd = "odd";
                }

                System.out.printf("%d %s %d = %.0f - %s", numberOne, operator, numberTwo, result, evenOdd);
                break;


            case "-":
                result = numberOne - numberTwo;

                if(result % 2 == 0){
                    evenOdd = "even";
                }else{
                    evenOdd = "odd";
                }

                System.out.printf("%d %s %d = %.0f - %s", numberOne, operator, numberTwo, result, evenOdd);
                break;


            case "*":
                result = numberOne * numberTwo;

                if(result % 2 == 0){
                    evenOdd = "even";
                }else{
                    evenOdd = "odd";
                }

                System.out.printf("%d %s %d = %.0f - %s", numberOne, operator, numberTwo, result, evenOdd);
                break;


            case "/":
                result = numberOne * 1.00 / numberTwo;

                if(numberTwo == 0){
                    System.out.printf("Cannot divide %d by zero", numberOne);
                }else{
                    System.out.printf("%d / %d = %.2f", numberOne, numberTwo, result);
                }

                break;


            case "%":

                if(numberTwo == 0){
                    System.out.printf("Cannot divide %d by zero", numberOne);
                }else{
                    result = numberOne % numberTwo;
                    System.out.printf("%d %s %d = %.0f", numberOne, operator, numberTwo, result);
                }
                break;
        }


    }
}
