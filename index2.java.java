import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! I'm a simple chatbot. How can I help you today?");
        System.out.println("You can ask me about the weather or just say hello.");

        while (true) {
            System.out.print("You: ");
            String userMessage = scanner.nextLine();

            // Convert user input to lowercase for case-insensitive matching
            userMessage = userMessage.toLowerCase();

            if (userMessage.contains("hello") || userMessage.contains("hi")) {
                System.out.println("Bot: Hello there! How can I assist you?");
            } else if (userMessage.contains("weather")) {
                System.out.println("Bot: The weather is sunny and warm today.");
            } else if (userMessage.contains("bye")) {
                System.out.println("Bot: Goodbye! Have a great day!");
                break; // Exit the chat loop
            } else {
                System.out.println("Bot: I'm sorry, I don't understand that. Please ask something else.");
            }
        }

        scanner.close();
    }
}
