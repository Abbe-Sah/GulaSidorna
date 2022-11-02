package ApplicationFiles;

import java.util.Scanner;

public class Menu {
        Scanner scanner = new Scanner(System.in);
        PrintedSpacing spacing = new PrintedSpacing();
        MenuMessageOptions messageOptions = new MenuMessageOptions();
        Profile profile = new Profile();
        
        boolean quit = false;
        
        public void runMenu(){
        do {

            messageOptions.print();
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> {
                    System.out.println("Searching...");
                    //Code
                    spacing.print();
                }
                case "2" -> {
                    profile.addDummyProfilesToList();
                    // Code: addProfile, removeProfile, updateProfile
                    System.out.println("Adding...");
                    //profile.printProfileList();
                    spacing.print();
                }
                case "3" -> {
                    System.out.print("Password: "); String inputPassword = scanner.nextLine();
                    System.out.println("Authenticating...");
                    Authentication.login(inputPassword);
                    spacing.print();
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
