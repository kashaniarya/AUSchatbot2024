package org.example;

public class ChatBotStateMachine {
    private BotState currentState;

    public ChatBotStateMachine() {
        currentState = BotState.START;
    }

    public String processInput(String userInput) {

        switch (currentState) {
            case START:
                userInput = userInput.strip().toLowerCase();
                if (userInput.equals("yes")) {
                    currentState = BotState.STATE1;
                    return "Great! Here are the details.";
                }
                else if (userInput.equals("no")) {

                }
                else {
                    return "Sorry I didn't understand.";
                }
            case STATE1:
                //currentState = BotState.ASK_AGE;
                return "How old are you?";
//            case ASK_AGE:
//                // Handle age-related logic, ask further questions, etc.
//                currentState = BotState.END;
//                return "Thank you for chatting!";
//            case END:
//                // End state, reset or handle as needed
//                currentState = BotState.START;
//                return "Restarting the conversation. What's your name?";
            default:
                return "Invalid state";
        }
    }
}
