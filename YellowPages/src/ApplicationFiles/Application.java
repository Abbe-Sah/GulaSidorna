package ApplicationFiles;

public class Application {

    public static void main(String[] args) {
        Profile profile = new Profile();


        // Add dummy profiles to list
        profile.addDummyProfilesToList();

        Menu menu = new Menu();
        menu.runMenu();
    }
}
