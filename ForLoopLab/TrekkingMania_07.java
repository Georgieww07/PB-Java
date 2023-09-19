package ForLoopLab;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int climbersGroup = Integer.parseInt(scanner.nextLine());

        int peopleInMusala = 0;
        int peopleInMonblan = 0;
        int peopleInKilimandjaro = 0;
        int peopleInK2 = 0;
        int peopleInEverest = 0;

        int allPeople = 0;

        for (int i = 1; i <= climbersGroup; i++) {

            int peopleInGroup = Integer.parseInt(scanner.nextLine());

            allPeople = allPeople + peopleInGroup;

            if (peopleInGroup <= 5) {
                peopleInMusala += peopleInGroup;

            } else if (peopleInGroup <= 12) {
                peopleInMonblan += peopleInGroup;

            } else if (peopleInGroup <= 25) {
                peopleInKilimandjaro += peopleInGroup;

            } else if (peopleInGroup <= 40) {
                peopleInK2 += peopleInGroup;

            } else {
                peopleInEverest += peopleInGroup;

            }

        }

        double percentageMusala = (peopleInMusala * 1.0 / allPeople) * 100;
        double percentageMonblan = (peopleInMonblan * 1.0 / allPeople) * 100;
        double percentageKilimandjaro = (peopleInKilimandjaro * 1.0 / allPeople) * 100;
        double percentageK2 = (peopleInK2 * 1.0 / allPeople) * 100;
        double percentageEverest = (peopleInEverest * 1.0 / allPeople) * 100;

        System.out.printf("%.2f%%\n", percentageMusala);
        System.out.printf("%.2f%%\n", percentageMonblan);
        System.out.printf("%.2f%%\n", percentageKilimandjaro);
        System.out.printf("%.2f%%\n", percentageK2);
        System.out.printf("%.2f%%", percentageEverest);
    }
}
