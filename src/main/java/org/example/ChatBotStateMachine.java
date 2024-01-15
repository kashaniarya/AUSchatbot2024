package org.example;

public class ChatBotStateMachine {
    private BotState currentState;

    public ChatBotStateMachine() {
        currentState = BotState.START;
    }

    public String processInput(String userInput) {

        switch (currentState) {
            case START:
                userInput = userInput.strip();
                userInput = userInput.toLowerCase();
                if (userInput.equals("yes")) {
                    currentState = BotState.STATE1;
                    return "Great! Here are the details. Pick 1, 2, or 3.";
                }
                else if (userInput.equals("no")) {
                    currentState = BotState.END;
                    System.out.println("bye");
                    System.exit(0);
                    return "Okay, bye.";
                }
                else {
                    return "Sorry I didn't understand. Please try again.";
                }
            case STATE1:
                currentState = BotState.END;
                System.out.println("done");
                System.exit(0);
                return "";
            default:
                return "Invalid input. Try again.";
        }
    }
}
