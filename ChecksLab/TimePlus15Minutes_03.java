package ChecksLab;

import java.util.Scanner;

public class TimePlus15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int hoursInMinutes = hours * 60;

        int totalTimeInMinutes = hoursInMinutes + minutes + 15;

        int totalHours = totalTimeInMinutes / 60;
        int totalMinutes = totalTimeInMinutes % 60;

        if (totalHours >= 24){
            totalHours = 0;
        }

        System.out.printf("%d:%02d", totalHours, totalMinutes);


    }
}
