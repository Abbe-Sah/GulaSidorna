package ApplicationFiles;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchModule {

    Profile profile = new Profile();


    public void searchMenu(){      // This method list all the options for the search
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

                if (searchInput.equals("1")){
                    firstNameSearch(Profile.profileList);

                } else if (searchInput.equals("2")) {
                    lastNameSearch (Profile.profileList);

                } else if (searchInput.equals("3")) {
                    addressSearch (Profile.profileList);

                }else if (searchInput.equals("4")) {
                    freeSearch (Profile.profileList);

                }else if (searchInput.equals("5")) {
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
        fName =  fName.toLowerCase();
        System.out.println(fName);
        System.out.println("---------------------------------------------");



        boolean foundProfile = false;
        for(int i=0; i< Profile.profileList.size(); i++) {
            if (Profile.profileList.get(i).getFirstName().toLowerCase().startsWith(fName)) {

                System.out.println("Profile Number: " + i);
                System.out.println("First Name: " + Profile.profileList.get(i).getFirstName());
                System.out.println("Last Name: " + Profile.profileList.get(i).getLastName());
                System.out.println("Age: " + Profile.profileList.get(i).getAge());
                System.out.println("Phone: " + Profile.profileList.get(i).getPhoneNumber());
                System.out.println(Profile.profileList.get(i).getAddress());
                System.out.println("---------------------------------------------");

                foundProfile = true;
            }
        }
        if (!foundProfile) {
            System.out.println("Profile doesn't exist");
            System.out.println("---------------------------------------------");
        }else{
            if (Authentication.isAdmin) {
                profileOperation();
            }
        }
        return null;
    }

    public Profile lastNameSearch(ArrayList<ProfileInfo> profileList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the LAST NAME you would like to search for:");
        String lName = scanner.nextLine();
        lName =  lName.toLowerCase();
        System.out.println("---------------------------------------------");

        boolean foundProfile = false;
        for(int i=0; i< Profile.profileList.size(); i++) {
            if (Profile.profileList.get(i).getLastName().toLowerCase().startsWith(lName)) {

                System.out.println("Profile Number: " + i);
                System.out.println("First Name: " + Profile.profileList.get(i).getFirstName());
                System.out.println("Last Name: " + Profile.profileList.get(i).getLastName());
                System.out.println("Age: " + Profile.profileList.get(i).getAge());
                System.out.println("Phone: " + Profile.profileList.get(i).getPhoneNumber());
                System.out.println(Profile.profileList.get(i).getAddress());
                System.out.println("---------------------------------------------");

                foundProfile = true;
            }
        }
        if (!foundProfile) {
            System.out.println("Profile doesn't exist");
            System.out.println("---------------------------------------------");
        }else{
            if (Authentication.isAdmin) {
                System.out.println(Authentication.isAdmin);
                profileOperation();
            }
        }
        return null;
    }

    public Profile addressSearch(ArrayList<ProfileInfo> profileList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter STREET NAME you would like to search for:");
        String address = scanner.nextLine();
        address =  address.toLowerCase();
        System.out.println("---------------------------------------------");

        boolean foundProfile = false;
        for(int i=0; i< Profile.profileList.size(); i++) {

            if (Profile.profileList.get(i).getStreetName().toLowerCase().startsWith(address)) {

                System.out.println("Profile Number: " + i);
                System.out.println("First Name: " + Profile.profileList.get(i).getFirstName());
                System.out.println("Last Name: " + Profile.profileList.get(i).getLastName());
                System.out.println("Age: " + Profile.profileList.get(i).getAge());
                System.out.println("Phone: " + Profile.profileList.get(i).getPhoneNumber());
                System.out.println(Profile.profileList.get(i).getAddress());
                System.out.println("---------------------------------------------");

                foundProfile = true;
            }
        }
        if (!foundProfile) {
            System.out.println("Profile doesn't exist");
            System.out.println("---------------------------------------------");
        }else{
            if (Authentication.isAdmin) {
                System.out.println(Authentication.isAdmin);
                profileOperation();
            }
        }
        return null;
    }

    public Profile freeSearch(ArrayList<ProfileInfo> profileList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any thing to search for:");
        String freeSearch = scanner.nextLine();
        freeSearch =  freeSearch.toLowerCase();
        System.out.println("---------------------------------------------");

        boolean foundProfile = false;
        for(int i=0; i< Profile.profileList.size(); i++) {

            if (Profile.profileList.get(i).getFirstName().toLowerCase().startsWith(freeSearch) || Profile.profileList.get(i).getLastName().toLowerCase().startsWith(freeSearch)
                    || Profile.profileList.get(i).getAddress().toLowerCase().contains(freeSearch) ||
                    Profile.profileList.get(i).getPhoneNumber().contains(freeSearch)
            ) {

                System.out.println("Profile Number: " + i);
                System.out.println("First Name: " + Profile.profileList.get(i).getFirstName());
                System.out.println("Last Name: " + Profile.profileList.get(i).getLastName());
                System.out.println("Age: " + Profile.profileList.get(i).getAge());
                System.out.println("Phone: " + Profile.profileList.get(i).getPhoneNumber());
                System.out.println(Profile.profileList.get(i).getAddress());
                System.out.println("---------------------------------------------");

                foundProfile = true;
            }
        }
        if (!foundProfile) {
            System.out.println("Profile doesn't exist");
            System.out.println("---------------------------------------------");
        }else{
            if (Authentication.isAdmin) {
                System.out.println(Authentication.isAdmin);
                profileOperation();
            }
        }
        return null;
    }

    public void profileOperation () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose 1 for update:");
        System.out.println("Or 2 for delete");
        System.out.println("Or any key to exit:");
        System.out.println("---------------------------------------------");
        String choiceInput = scanner.nextLine();


        if (choiceInput.equals("1")) {
            System.out.println("Choose Profile index number:");
            System.out.println("---------------------------------------------");
            Integer ChoiceIndex = scanner.nextInt();
           profile.updateProfile(ChoiceIndex);
        } else if (choiceInput.equals("2")) {
            System.out.println("Choose Profile index number:");
            System.out.println("---------------------------------------------");
            Integer ChoiceIndex = scanner.nextInt();
           profile.removeProfile(ChoiceIndex);
        }else{
            searchMenu();
        }
    }

}
