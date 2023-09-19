package PreExam;

import java.util.Scanner;

public class Substitute_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        int count = 0;


        for (int firstDigitFirstNum = k; firstDigitFirstNum <= 8; firstDigitFirstNum++) {
            for (int secondDigitFirstNum = 9; secondDigitFirstNum >= l; secondDigitFirstNum--) {

                if (firstDigitFirstNum % 2 == 0 && secondDigitFirstNum % 2 != 0) {



                    for (int firstDigitSecondNum = m; firstDigitSecondNum <= 8; firstDigitSecondNum++) {
                        for (int secondDigitSecondNum = 9; secondDigitSecondNum >= n; secondDigitSecondNum--) {

                            if (firstDigitSecondNum % 2 == 0 && secondDigitSecondNum % 2 != 0) {



                                if (firstDigitFirstNum != firstDigitSecondNum || secondDigitFirstNum != secondDigitSecondNum){
                                    System.out.printf("%d%d - %d%d\n", firstDigitFirstNum, secondDigitFirstNum, firstDigitSecondNum, secondDigitSecondNum);
                                    count++;

                                    if (count >= 6){
                                        return;
                                    }


                                }else {

                                    System.out.println("Cannot change the same player.");
                                }
                            }

                        }
                    }
                }

            }


        }

    }
}
