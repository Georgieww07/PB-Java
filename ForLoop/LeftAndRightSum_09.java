package ForLoop;

import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            leftSum += num;

        }

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            rightSum += num;

        }

        if(leftSum == rightSum){
            System.out.println("Yes, sum = " + leftSum);
        }else{
            int diff = Math.abs(rightSum - leftSum);
            System.out.println("No, diff = " + diff);
        }
    }
}
