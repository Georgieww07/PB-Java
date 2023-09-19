package PreExam;

import java.util.Scanner;

public class Workout_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int days = Integer.parseInt(scanner.nextLine());
        double kmFirstDay = Double.parseDouble(scanner.nextLine());


        double sumKmPerDay = kmFirstDay;
        double sumKm = kmFirstDay;

        for (int i = 1; i <= days; i++) {

            int percentIncrease = Integer.parseInt(scanner.nextLine());

            sumKmPerDay = (percentIncrease * 1.00 / 100 * sumKmPerDay) + sumKmPerDay;

            sumKm += sumKmPerDay;

        }

        if (sumKm >= 1000){
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(sumKm - 1000));
        }else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - sumKm));
        }
    }
}
