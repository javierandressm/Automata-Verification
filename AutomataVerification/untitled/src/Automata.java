import java.util.Scanner;

public class Automata {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string using a and b: ");
        String input = scanner.nextLine();

        String state = "0137";

        System.out.println("\n--- Automaton Process ---");
        System.out.println("Start state: " + state);

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);
            String previousState = state;

            switch (state) {

                case "0137":
                    if (c == 'a') state = "247";
                    else if (c == 'b') state = "8";
                    else state = "dead";
                    break;

                case "247":
                    if (c == 'a') state = "7";
                    else if (c == 'b') state = "58";
                    else state = "dead";
                    break;

                case "7":
                    if (c == 'a') state = "7";
                    else if (c == 'b') state = "8";
                    else state = "dead";
                    break;

                case "8":
                    if (c == 'b') state = "8";
                    else state = "dead";
                    break;

                case "58":
                    if (c == 'b') state = "68";
                    else state = "dead";
                    break;

                case "68":
                    if (c == 'b') state = "8";
                    else state = "dead";
                    break;

                default:
                    state = "dead";
            }

            System.out.println(previousState + " -- " + c + " --> " + state);
        }

        System.out.println("\nFinal state: " + state);

        if (state.equals("247") || state.equals("8") || state.equals("58") || state.equals("68")) {
            System.out.println("Result: ACCEPTED");
        } else {
            System.out.println("Result: REJECTED");
        }

        scanner.close();
    }
}