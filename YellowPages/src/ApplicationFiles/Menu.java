package ApplicationFiles;

import java.util.Scanner;

public class Menu {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        public void runMenu(){
        do {
            System.out.println("Welcome to the Yellow Pages, user! \nPlease pick one of the options below: \n");
            System.out.print("""
                1. Search for profile
                2. Add a new profile
                3. Login as admin
                4. Quit
                """);
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> {
                    System.out.println("Searching...");

                }
                case "2" -> {
                    System.out.println("Adding...");
                    
                }
                case "3" -> {
                    System.out.println("Authenticating...");

                }
                case "4" -> {
                    System.out.println("Quitting...");
                    quit = true;
                }
                default -> System.out.println("That's not an option!");
            }

        } while (!quit);
    }
}
