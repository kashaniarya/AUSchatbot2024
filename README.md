# ChatBot State Machine

## Overview
This Java program implements a simple chatbot using a state machine to manage different states of the conversation. 
The chatbot interacts with the user by processing input and transitioning between states.

## Usage
1. The program starts with a greeting message: "Hello! Do you want to hear about a newly available shift?"
2. Type "yes" to proceed or "no" to exit.
3. If you choose "yes," the chatbot will provide details and ask you to pick 1, 2, or 3.
4. Enter your choice, and the chatbot will respond accordingly.

## Structure
- `Main.java`: The main class that contains the program's entry point.
- `ChatBotStateMachine.java`: Implements the chatbot state machine, handling input processing and state transitions.
- `BotState.java`: Enumerates the different states the chatbot can be in.

## State Transitions
The program uses a `Map` to define state transitions based on user input. The transitions are initialized in the `initializeTransitions` method of the `ChatBotStateMachine` class.

## Customization
Customize the program by adding state-specific logic or modifying the state transitions to suit your requirements.

---
