package ForLoop;

import java.util.Scanner;

public class NumbersFrom1ToNStep3_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int step = 1; step <= n; step += 3){
            System.out.println(step);
        }
    }
}
