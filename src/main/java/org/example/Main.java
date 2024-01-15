package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Start of Program
        String start = "Hello! Do you want to hear about a newly available shift?";
        System.out.println(start);

        // Initialize ChatBot StateMachine
        ChatBotStateMachine stateMachine = new ChatBotStateMachine();

        while (true) {
            // Read in User Input
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            // Process Input into Output
            String stateMachineOutput = stateMachine.processInput(userInput);
            System.out.println(stateMachineOutput);
        }
    }

}