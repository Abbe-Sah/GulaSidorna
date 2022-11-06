package ApplicationFiles;

import java.util.Scanner;

public class testingClass{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Profile profile = new Profile();

        // Add dummy profiles to list
       profile.addDummyProfilesToList();
       profile.printProfileList();


        //For login and check if admin
//        Authentication.login("teamtwo");
//        System.out.println(Authentication.isAdmin);



        // Test how to add data to the list.
//        while (true){
//            System.out.println("Name");
//            String name = scanner.next();
//            System.out.println("Lastname");
//            String lastName = scanner.next();
//            System.out.println("Age");
//            int age = scanner.nextInt();
//            System.out.println("PhoneNumber");
//            int phoneNumber = scanner.nextInt();
//            System.out.println("Street name");
//            String streetName = scanner.next();
//            System.out.println("Street number");
//            int streetNumber = scanner.nextInt();
//            System.out.println("Apartment number");
//            int apartmentNumber = scanner.nextInt();
//            System.out.println("zipCode");
//            int zipCode = scanner.nextInt();
//            System.out.println("City");
//            String city = scanner.next();
//            ProfileInfo profileInfo = new ProfileInfo(name,lastName,age,phoneNumber,streetName,streetNumber,apartmentNumber,zipCode,city);
//
//            profile.addProfile(profileInfo);





            //Update Profile function example
            System.out.println("What user index do you want to update");
            int updateNumber = scanner.nextInt();
            profile.updateProfile(updateNumber);



            //Remove Profile function
//            System.out.println("What user index do you want to remove");
//            int removeNumber = scanner.nextInt();
//            profile.removeProfile(removeNumber);

        }

    }

