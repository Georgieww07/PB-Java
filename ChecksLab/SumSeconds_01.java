package ChecksLab;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int timeSum = timeFirst + timeSecond + timeThird;

        int totalMinutes = timeSum / 60;
        int totalSeconds = timeSum % 60;

        System.out.printf("%d:%02d", totalMinutes, totalSeconds);
    }
}
