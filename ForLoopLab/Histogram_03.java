package ForLoopLab;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countNumbers1 = 0;
        int countNumbers2 = 0;
        int countNumbers3 = 0;
        int countNumbers4 = 0;
        int countNumbers5 = 0;


        double percentage1 = 0.0;
        double percentage2 = 0.0;
        double percentage3 = 0.0;
        double percentage4 = 0.0;
        double percentage5 = 0.0;

        for (int i = 1; i <= n; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber < 200){
                countNumbers1 += 1;
                percentage1 = countNumbers1 * 1.00 / n * 100;

            }else if (currentNumber < 400){
                countNumbers2 += 1;
                percentage2 = countNumbers2 * 1.00 / n * 100;

            }else if (currentNumber < 600){
                countNumbers3 += 1;
                percentage3 = countNumbers3 * 1.00 / n * 100;

            }else if (currentNumber < 800){
                countNumbers4 += 1;
                percentage4 = countNumbers4 * 1.00 / n * 100;

            }else {
                countNumbers5 += 1;
                percentage5 = countNumbers5 * 1.00 / n * 100;

            }

        }
        System.out.printf("%.2f%%\n", percentage1);
        System.out.printf("%.2f%%\n", percentage2);
        System.out.printf("%.2f%%\n", percentage3);
        System.out.printf("%.2f%%\n", percentage4);
        System.out.printf("%.2f%%", percentage5);
    }
}
