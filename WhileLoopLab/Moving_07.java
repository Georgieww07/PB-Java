package WhileLoopLab;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthFreeSpace = Integer.parseInt(scanner.nextLine());
        int lengthFreeSpace = Integer.parseInt(scanner.nextLine());
        int heightFreeSpace = Integer.parseInt(scanner.nextLine());

        int freeSpace = widthFreeSpace * lengthFreeSpace * heightFreeSpace;

        String command = scanner.nextLine();
        while (!command.equals("Done")){

            int currentBoxes = Integer.parseInt(command);

            freeSpace -= currentBoxes;

            if (freeSpace <= 0){
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
                break;
            }

            command = scanner.nextLine();

        }

        if (freeSpace > 0){
            System.out.printf("%d Cubic meters left.", freeSpace);
        }
    }
}
