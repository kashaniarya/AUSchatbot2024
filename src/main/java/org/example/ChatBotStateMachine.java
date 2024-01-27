package org.example;

import java.util.HashMap;
import java.util.Map;

class ChatBotStateMachine {
    private BotState currentState;
    private Map<BotState, Map<String, BotState>> transitions;

    public ChatBotStateMachine() {
        currentState = BotState.START;
        initializeTransitions();
    }

    private void initializeTransitions() {
        transitions = new HashMap<>();

        // Define transitions for START state
        Map<String, BotState> startTransitions = new HashMap<>();
        startTransitions.put("yes", BotState.STATE1);
        startTransitions.put("no", null); // Represents an exit
        transitions.put(BotState.START, startTransitions);

        // Define transitions for STATE1 state
        Map<String, BotState> state1Transitions = new HashMap<>();
        state1Transitions.put("1", null); // Represents an exit
        state1Transitions.put("2", null); // Represents an exit
        state1Transitions.put("3", null); // Represents an exit
        transitions.put(BotState.STATE1, state1Transitions);
    }

    public String processInput(String userInput) {
        // Strip & lowercase user input
        userInput = userInput.strip().toLowerCase();

        // Get possible transitions for the current state
        Map<String, BotState> possibleTransitions = transitions.get(currentState);

        // Check if the user input corresponds to a valid transition
        if (possibleTransitions != null && possibleTransitions.containsKey(userInput)) {
            currentState = possibleTransitions.get(userInput);

            if (currentState == null) {
                // Represents an exit
                System.out.println("Bye.");
                System.exit(0);
            }

            // Handle state-specific logic here if needed

            return getStateOutput();
        } else {
            System.out.println("Sorry, I didn't understand. Please try again.");
            return getStateOutput();
        }
    }

    private String getStateOutput() {
        // Customize output based on the current state if needed
        switch (currentState) {
            case START:
                return "Do you want to hear about a newly available shift?";
            case STATE1:
                return "Here are the details. Pick 1, 2, or 3.";
            default:
                return "Invalid input. Try again.";
        }
    }
}