package WhileLoop;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String studentName = scanner.nextLine();
        int schoolClass = 0;
        double sumGrades = 0;


        double grade = Double.parseDouble(scanner.nextLine());
        while (grade >= 4) {
            schoolClass += 1;
            sumGrades += grade;


            if (schoolClass == 12) {
                double averageGrade = sumGrades / schoolClass;
                System.out.printf("%s graduated. Average grade: %.2f", studentName, averageGrade);
                break;
            }

            grade = Double.parseDouble(scanner.nextLine());

        }

        if (grade < 4) {
            System.out.printf("%s has been excluded at %d grade", studentName, schoolClass + 1);
        }
    }
}
