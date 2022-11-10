package ApplicationFiles;

import java.util.Scanner;

public class MenuProfileInput {
    Scanner scanner = new Scanner(System.in);
    Profile profile = new Profile();

    public void newProfilePrint() {
        int addMoreNumbers = 1;
        String phoneNumber = "";
        StringBuilder str = new StringBuilder();

        System.out.println("Please type in your name:");
        String name = scanner.next();
        System.out.println("Type in your last name:");
        String lastName = scanner.next();
        System.out.println("Type in your age:");
        int age = scanner.nextInt();
        while (addMoreNumbers == 1){
            System.out.println("Type in your phone-number:");
            String subPhoneNumber = scanner.next();
            System.out.println("Do you want to add more phone number to this user?");
            System.out.println("1 = YES ---- 0 = NO");
            str.append(subPhoneNumber + ", ");
            phoneNumber = str.toString();
            addMoreNumbers = scanner.nextInt();
        }
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
