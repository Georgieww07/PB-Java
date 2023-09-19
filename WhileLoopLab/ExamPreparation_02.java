package WhileLoopLab;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());
        int failTimes = 0;
        int sumGrades = 0;
        int gradeCount = 0;
        String lastProblem = "";

        String input = scanner.nextLine();
        while (!input.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());

            lastProblem = input;

            sumGrades += grade;
            gradeCount++;

            if (grade <= 4) {
                failTimes++;
            }

            if (failTimes == badGrades) {
                System.out.printf("You need a break, %d poor grades.", badGrades);
                break;
            }
            input = scanner.nextLine();
        }



        if (input.equals("Enough")) {
            double averageScore = sumGrades * 1.00 / gradeCount;
            System.out.printf("Average score: %.2f\n", averageScore);
            System.out.printf("Number of problems: %d\n", gradeCount);
            System.out.printf("Last problem: %s", lastProblem);

        }
    }
}
