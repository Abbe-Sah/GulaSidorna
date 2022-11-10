package ApplicationFiles;

import java.util.ArrayList;
import java.util.Scanner;

public class Profile {
    Scanner scanner = new Scanner(System.in);

    public static ArrayList<ProfileInfo> profileList = new ArrayList<>();


    public void addProfile(ProfileInfo profileInfo) {
        profileList.add(profileInfo);
    }


    public void removeProfile(int inputNumber) {
        profileList.remove(inputNumber);
        System.out.println("################");
        System.out.println("REMOVED PROFILE");
        System.out.println("################");
    }

    public void updateProfile(int profileIndex) {
        System.out.println("Update Name on userID:" + profileIndex + " from "
                + profileList.get(profileIndex).getFirstName() + " to:");
        String name = scanner.next();
        System.out.println("Update Lastname on userID:" + profileIndex + " from "
                + profileList.get(profileIndex).getLastName() + " to:");
        String lastName = scanner.next();
        System.out.println("Update Age on userID:" + profileIndex + " from "
                + profileList.get(profileIndex).getAge() + " to:");
        int age = scanner.nextInt();
        int addMoreNumbers = 1;
        String phoneNumber = " ";
        while (addMoreNumbers == 1){
            System.out.println("Update PhoneNumber on userID:" + profileIndex + " from "
                    + profileList.get(profileIndex).getPhoneNumber() + " to:");
            String subPhoneNumber = scanner.next();
            System.out.println("Do you want to add more phone number to this user?");
            System.out.println("1 = YES ---- 0 = NO");
            phoneNumber  = phoneNumber.concat(subPhoneNumber + ", ");
            addMoreNumbers = scanner.nextInt();
        }
        System.out.println("Update Street name on userID:" + profileIndex + " from "
                + profileList.get(profileIndex).getStreetName() + " to:");
        String streetName = scanner.next();
        System.out.println("Update Street number on userID:" + profileIndex + " from "
                + profileList.get(profileIndex).getStreetNumber() + " to:");
        int streetNumber = scanner.nextInt();
        System.out.println("Update Apartment number on userID:" + profileIndex + " from "
                + profileList.get(profileIndex).getApartmentNumber() + " to:");
        int apartmentNumber = scanner.nextInt();
        System.out.println("Update  ZipCode on userID:" + profileIndex + " from "
                + profileList.get(profileIndex).getZipCode() + " to:");
        int zipCode = scanner.nextInt();
        System.out.println("Update  City on userID:" + profileIndex + " from "
                + profileList.get(profileIndex).getCity() + " to:");
        String city = scanner.next();
        ProfileInfo profileInfo = new ProfileInfo(name, lastName, age, phoneNumber,
                streetName, streetNumber, apartmentNumber, zipCode, city);
        profileList.set(profileIndex, profileInfo);
        System.out.println("################");
        System.out.println("UPDATED USER " + profileIndex);
        System.out.println("################");


    }

    public static void addedToList() {
        System.out.println("##############################################");
        System.out.println("Added " + profileList.get(profileList.size() - 1).getFirstName() + " to the list.");
        System.out.println("##############################################");
    }

    // This is for just for populate the list with some people.
    public void addDummyProfilesToList() {
        ProfileInfo dummyOne = new ProfileInfo("Max", "Svensson", 34,
                "0705545554", "Författarvägen", 45,
                4, 78465, "Östersund");
        profileList.add(dummyOne);
        ProfileInfo dummyTwo = new ProfileInfo("Kalle", "Bengtsson", 25,
                "0799665615", "Sommarvägen", 7,
                1, 87456, "Stockholm");
        profileList.add(dummyTwo);
        ProfileInfo dummyThree = new ProfileInfo("Malin", "Olfosson", 43,
                "0785445985", "BrommaVägen", 4,
                6, 72455, "Stockholm");
        profileList.add(dummyThree);
        ProfileInfo dummyFour = new ProfileInfo("Abbe", "Saha", 40,
                "0702544576", "Alegatan", 5,
                35, 87422, "Göteborg");
        profileList.add(dummyFour);
        ProfileInfo dummyFive = new ProfileInfo("Ahmed", "AlKafri", 41,
                "0705545514", "Södra Karlvägen", 45,
                2, 70245, "Boden");
        profileList.add(dummyFive);
        ProfileInfo dummySix = new ProfileInfo("Jakob", "Rolandsson", 37,
                "0706403397", "Villvägen", 4,
                3, 80214, "Umeå");
        profileList.add(dummySix);
        ProfileInfo dummySeven = new ProfileInfo("Lisa", "Haraldsson", 25,
                "0785548645", "Borrsvängen", 8,
                3, 80214, "Umeå");
        profileList.add(dummySeven);
        ProfileInfo dummyEight = new ProfileInfo("Angelina", "Dunsjö", 19,
                "0784545451", "Rimogvägen", 2,
                9, 95445, "Sundsvall");
        profileList.add(dummyEight);
        ProfileInfo dummyNine = new ProfileInfo("Elina", "Elija", 19,
                "0752857657", "Bodsjögränd", 23,
                1, 85644, "Uppsala");
        profileList.add(dummyNine);
        ProfileInfo dummyTen = new ProfileInfo("Kalle", "Pirmoradi", 19,
                "0764587575", "Hisingsvägen", 93,
                1, 90414, "Göteborg");
        profileList.add(dummyTen);

    }


}
