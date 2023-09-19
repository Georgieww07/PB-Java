package WhileLoop;

import java.util.Scanner;

public class Sequence2K_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int start = 1;
        while (start <= n) {
            System.out.println(start);
            start = start * 2 + 1;
        }
    }
}