package ChecksLab;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double timeWithoutResistance = distance * timeInSeconds;
        double slowDownTimes = Math.floor(distance / 15) * 12.5;
        double finalTime = timeWithoutResistance + slowDownTimes;

        double diff = finalTime - record;

        if (finalTime < record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);

        }

    }
}
