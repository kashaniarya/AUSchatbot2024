package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String start = "Hello! Do you want to hear about a newly available shift?";
        System.out.println(start);

        ChatBotStateMachine stateMachine = new ChatBotStateMachine();


        while (true) {
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            String stateMachineOutput = stateMachine.processInput(userInput);
            System.out.println(stateMachineOutput);
        }
    }


}