package org.example;

public class ChatBotStateMachine {
    private BotState currentState;

    public ChatBotStateMachine() {
        currentState = BotState.START;
    }

    public String processInput(String userInput) {

        switch (currentState) {
            // Start STATE
            case START:
                // strip & lowercase user input
                userInput = userInput.strip();
                userInput = userInput.toLowerCase();

                // case 1 : if yes
                if (userInput.equals("yes")) {
                    currentState = BotState.STATE1;
                    return "Great! Here are the details. Pick 1, 2, or 3.";
                }
                // case 2 : if no
                else if (userInput.equals("no")) {
                    System.out.println("Bye.");
                    System.exit(0);
                    //return "";
                }
                // case 3 : if bad input
                else {
                    System.out.println("Sorry I didn't understand. Please try again.");
                    return "Do you want to hear about a newly available shift?";
                }

            // STATE 1 : Shift Details plus Question 1,2,3
            case STATE1:
                // strip user input
                userInput = userInput.strip();

                // case 1 : user input 1,2, or 3
                if (userInput.equals("1")) {
                    System.out.println("DONE1");
                    System.exit(0);
                }
                else if (userInput.equals("2")) {
                    System.out.println("DONE2");
                    System.exit(0);
                }
                else if (userInput.equals("3")) {
                    System.out.println("DONE3");
                    System.exit(0);
                }
                // case 2 : bad input
                else {
                    System.out.println("Sorry I didn't understand. Please try again.");
                    return "Here are the details. Pick 1, 2, or 3.";
                }
                //return "";

            // default State : dead state
            default:
                return "Invalid input. Try again.";
        }
    }
}
