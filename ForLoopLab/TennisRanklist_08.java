package ForLoopLab;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int allPoints = startingPoints;
        int wins = 0;


        for (int i = 1; i <= tournaments; i++) {

            String tournamentStage = scanner.nextLine();

            switch (tournamentStage) {
                case "W":
                    wins++;
                    allPoints += 2000;
                    break;
                case "F":
                    allPoints += 1200;
                    break;
                case "SF":
                    allPoints += 720;
                    break;
            }

        }

        double averagePoints = Math.floor((allPoints - startingPoints) * 1.0 / tournaments);
        double percentageWins = (wins * 1.0 / tournaments) * 100;

        System.out.println("Final points: " + allPoints);
        System.out.printf("Average points: %.0f\n", averagePoints);
        System.out.printf("%.2f%%", percentageWins);
    }
}
