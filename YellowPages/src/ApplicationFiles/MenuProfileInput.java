package ApplicationFiles;

import java.util.Scanner;

public class MenuProfileInput {
    Scanner scanner = new Scanner(System.in);
    Profile profile = new Profile();

    public void newProfilePrint() {
        System.out.println("Please type in your name:");
        String name = scanner.next();
        System.out.println("Type in your last name:");
        String lastName = scanner.next();
        System.out.println("Type in your age:");
        int age = scanner.nextInt();
        System.out.println("Type in your phone-number:");
        String phoneNumber = scanner.next();
        System.out.println("Type in your street name:");
        String streetName = scanner.next();
        System.out.println("Type in your street number:");
        int streetNumber = scanner.nextInt();
        System.out.println("Type in your apartment number:");
        int apartmentNumber = scanner.nextInt();
        System.out.println("Type in your zipcode:");
        int zipCode = scanner.nextInt();
        System.out.println("Type in the name of your city:");
        String city = scanner.next();
        ProfileInfo profileInfo = new ProfileInfo(name, lastName, age, phoneNumber,
                streetName, streetNumber, apartmentNumber, zipCode, city);
        profile.addProfile(profileInfo);
    }
}
