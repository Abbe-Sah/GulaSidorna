package ApplicationFiles;

import java.util.Scanner;

public class testingClass{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Profile profile = new Profile();

        Authentication.login("teamtfsadfwo");
        System.out.println(Authentication.isAdmin);

        while (true){
            System.out.println("Name");
            String name = scanner.next();
            System.out.println("Last name");
            String lastName = scanner.next();
            System.out.println("Age");
            int age = scanner.nextInt();
            System.out.println("PhoneNumber");
            int phoneNumber = scanner.nextInt();
            System.out.println("Street name");
            String streetName = scanner.next();
            System.out.println("Street number");
            int streetNumber = scanner.nextInt();
            System.out.println("Apart number");
            int apartmentNumber = scanner.nextInt();
            System.out.println("zipCode");
            int zipCode = scanner.nextInt();
            System.out.println("City");
            String city = scanner.next();
            ProfileInfo profileInfo = new ProfileInfo(name,lastName,age,phoneNumber,streetName,streetNumber,apartmentNumber,zipCode,city);

            profile.addProfile(profileInfo);
            profile.printProfileList();



        }

    }
}
