package ApplicationFiles;

import java.util.Scanner;

public class Menu {
        Scanner scanner = new Scanner(System.in);

        PrintedSpacing spacing = new PrintedSpacing();
        MenuMessageOptions messageOptions = new MenuMessageOptions();
        LoginPrint loginPrint = new LoginPrint();
        MenuProfileInput menuProfileInput = new MenuProfileInput();
        SearchModule searchModule = new SearchModule();
        
        boolean quit = false;
        
        public void runMenu(){
        do {

            messageOptions.print();
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> {
                    System.out.println("Searching...");
                    searchModule.searchMenu();
                    spacing.print();
                }
                case "2" -> {
                    menuProfileInput.newProfilePrint();
                    Profile.addedToList();
                    spacing.print();
                }
                case "3" -> {
                    loginPrint.print();
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
