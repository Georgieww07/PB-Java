package ForLoopLab;

import java.util.Scanner;

public class Oskars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int examiners = Integer.parseInt(scanner.nextLine());

        double allPoints = academyPoints;

        for (int i = 1; i <= examiners; i++) {

            String examinerName = scanner.nextLine();
            double examinerPoints = Double.parseDouble(scanner.nextLine());

            allPoints += (examinerName.length() * examinerPoints) / 2;

            if (allPoints > 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, allPoints);
                break;
            }

        }

        if (allPoints < 1250.5){
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - allPoints);
        }
    }
}
