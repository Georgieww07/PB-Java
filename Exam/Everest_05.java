package PreExam;

import java.util.Scanner;

public class Everest_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        int countDays = 1;

        int allMetres = 5364;



        while (!input.equals("END")){

            if (input.equals("Yes")){
                countDays += 1;
            }else if (input.equals("No")){

            }

            int currentMetresClimbed = Integer.parseInt(scanner.nextLine());


            if (countDays > 5){
                System.out.println("Failed!");
                System.out.printf("%d" , allMetres);
                break;
            }

            allMetres += currentMetresClimbed;


            if (allMetres >= 8848){
                System.out.printf("Goal reached for %d days!", countDays);
                break;
            }





            input = scanner.nextLine();
        }

        if (input.equals("END")){
            System.out.println("Failed!");
            System.out.printf("%d" , allMetres);

        }
    }
}
