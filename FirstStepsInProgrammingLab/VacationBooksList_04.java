package FirstStepsInProgrammingLab;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesReadPerHour = Integer.parseInt(scanner.nextLine());
        int daysToRead = Integer.parseInt(scanner.nextLine());

        int hours = pages / pagesReadPerHour;
        int finalHours = hours / daysToRead;

        System.out.println(finalHours);
    }
}
