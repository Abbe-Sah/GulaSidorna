package ApplicationFiles;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchModule {

    Profile profile = new Profile();
    private ArrayList<ProfileInfo> profileList = new ArrayList<>();

    public static void searchMenu (){      // This method list all the options for the search
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
            do{
                System.out.println("Please choose one of the following options");
                System.out.println(" 1. Search with FIRST NAME");
                System.out.println(" 2. Search with LAST NAME");
                System.out.println(" 3. Search with ADDRESS");
                System.out.println(" 4. FREE Search");
                System.out.println(" 5. Exit and return to main menu");
                System.out.println("-------------------------------------------------");

                String searchInput = scanner.nextLine();

                if (searchInput == "1"){
                    System.out.println("anything");


                } else if (searchInput == "2") {
                    System.out.println("anything");
                } else if (searchInput == "3") {
                    System.out.println("anything");
                }else if (searchInput == "4") {
                    System.out.println("anything");
                }else if (searchInput == "5") {
                    quit = true;
                } else{
                    System.out.println("Kindly choose one of the above options");
                }

            } while (!quit);
    }

    public Profile firstNameSearch(ArrayList<ProfileInfo> profileList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name you would like to search for:");
        String fName = scanner.nextLine();
        System.out.println("---------------------------------------------");

        for(ProfileInfo profiles : profileList){
            if(profiles.getFirstName().equals(fName)) {
                System.out.println(profileList.indexOf(profiles) + ": " + profiles.getFirstName() + " " + profiles.getLastName() + " Age: " + profiles.getAge() + ", Phone: " + profiles.getPhoneNumber() + " " + profiles.getAddress());
                return profile;
            }else {
                System.out.println("Profile doesn't exist");
                return null;
            }

        }
        return null;
    }

    public Profile lastNameSearch(ArrayList<ProfileInfo> profileList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the LAST NAME you would like to search for:");
        String lName = scanner.nextLine();
        System.out.println("---------------------------------------------");

        for(ProfileInfo profiles : profileList){
            if(profiles.getLastName().equals(lName)) {
                System.out.println(profileList.indexOf(profiles) + ": " + profiles.getFirstName() + " " + profiles.getLastName() + " Age: " + profiles.getAge() + ", Phone: " + profiles.getPhoneNumber() + " " + profiles.getAddress());
                return profile;
            }else {
                System.out.println("Profile doesn't exist");
                return null;
            }

        }
        return null;
    }

    public Profile addressSearch(ArrayList<ProfileInfo> profileList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ADDRESS you would like to search for:");
        String address = scanner.nextLine();
        System.out.println("---------------------------------------------");

        for (ProfileInfo profiles : profileList) {
            if (profiles.getCity().equals(address) || profiles.getStreetName().equals(address)) {
                System.out.println(profileList.indexOf(profiles) + ": " + profiles.getFirstName() + " " + profiles.getLastName() + " Age: " + profiles.getAge() + ", Phone: " + profiles.getPhoneNumber() + " " + profiles.getAddress());
                return profile;
            } else {
                System.out.println("Profile doesn't exist");
                return null;
            }

        }
        return null;
    }

    public Profile freeSearch(ArrayList<ProfileInfo> profileList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ADDRESS you would like to search for:");
        String freeSearch = scanner.nextLine();
        System.out.println("---------------------------------------------");

        for (ProfileInfo profiles : profileList) {
            if (profiles.getFirstName().equals(freeSearch) || profiles.getLastName().equals(freeSearch) || profiles.getCity().equals(freeSearch) || profiles.getStreetName().equals(freeSearch)) {
                System.out.println(profileList.indexOf(profiles) + ": " + profiles.getFirstName() + " " + profiles.getLastName() + " Age: " + profiles.getAge() + ", Phone: " + profiles.getPhoneNumber() + " " + profiles.getAddress());
                return profile;
            } else {
                System.out.println("Profile doesn't exist");
                return null;
            }

        }
        return null;
    }
}
