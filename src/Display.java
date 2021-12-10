import java.util.Scanner;

public abstract class Display {

    public String message;

    public abstract void render();
    public abstract void start();


    public void pressAnyKeyToContinue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press enter to continue...");
        scanner.nextLine();
    }

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String userInput = scanner.nextLine().toLowerCase();
        if (!validateUserInput(userInput)) {
            System.out.println("Please provide a valid input...");
            userInput = getUserInput();
        }
        return userInput;
    }

    public boolean validateUserInput(String input) {
        return true;
    }

}
