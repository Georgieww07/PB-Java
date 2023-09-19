package WhileLoopLab;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countBooks = 0;

        String favBook = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals(favBook)){

            if (!input.equals("No More Books")){
                countBooks++;
            }


            if (input.equals("No More Books")){
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.\n", countBooks);
                break;
            }


            input = scanner.nextLine();
        }
        if (input.equals(favBook)){
            System.out.printf("You checked %d books and found it.", countBooks);
        }

    }
}
