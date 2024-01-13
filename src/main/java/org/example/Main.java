package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Hello! Do you want to continue? ");

        // Create a Scanner object to read input from the terminal
        Scanner scanner = new Scanner(System.in);
        // Read  from the user
        String userInput = scanner.nextLine();

        String[] answer1 = new String[]{"yes", "Yes", "YES", "no", "yeah", "Yeah", "YEAH"};
        String[] answer2 = new String[]{"No", "NO", "nah", "Nah", "NAH"};

        boolean invalidLoop = true;

        while (invalidLoop == true) {
            //invalidLoop = firstQuestion(invalidLoop);
        }


    }

//    private static boolean firstQuestion(boolean invalidLoop) {
//        // or here
//        String[] acceptableInput = answer1 + answer2;
//
//        for (String s : acceptableInput) {
//            if (userInput.contains("s")) {
//                invalidLoop = false;
//                break;
//            }
//        }
//
//        if (invalidLoop) {
//            System.out.println("Sorry I did not understand. Do you want to continue?");
//            return true;
//        }
//        else {
//            //
//        }



    }
}