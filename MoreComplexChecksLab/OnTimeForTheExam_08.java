package MoreComplexChecksLab;

import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /*•	"Late", ако студентът пристига по-късно от часа на изпита.
•	"On time", ако студентът пристига точно в часа на изпита или до 30 минути по-рано.
•	"Early", ако студентът пристига повече от 30 минути преди часа на изпита.*/


        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTotalMinutes = examHour * 60 + examMinutes;
        int arrivalTotalMinutes = arrivalHour * 60 + arrivalMinutes;

        int diffMinutes = Math.abs(examTotalMinutes - arrivalTotalMinutes);

       if(arrivalTotalMinutes > examTotalMinutes){
           System.out.println("Late");

           if(diffMinutes < 60){
               System.out.printf("%d minutes after the start", diffMinutes);
           }else{
               int hour = diffMinutes / 60;
               int minutes = diffMinutes % 60;

               System.out.printf("%d:%02d hours after the start", hour, minutes);
           }
       }else if(diffMinutes <= 30){
           System.out.println("On time");

           if(diffMinutes != 0){
               System.out.printf("%d minutes before the start", diffMinutes);
           }
       }else{
           System.out.println("Early");

           if(diffMinutes < 60){
               System.out.printf("%d minutes before the start", diffMinutes);
           }else{
               int hour = diffMinutes / 60;
               int minutes = diffMinutes % 60;

               System.out.printf("%d:%02d hours before the start", hour, minutes);
           }
       }

    }
}
