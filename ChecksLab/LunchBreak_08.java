package ChecksLab;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double timeForLunch = breakDuration * 1.0 / 8;
        double timeForBreak = breakDuration * 1.0 / 4;
        double timeLeft = breakDuration - (timeForLunch + timeForBreak);

        double freeTimeLeft = Math.ceil(timeLeft - durationEpisode);
        double timeNeeded = Math.ceil(durationEpisode - timeLeft);

        if (timeLeft >= durationEpisode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movieName, freeTimeLeft);
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movieName, timeNeeded);

        }

    }
}
