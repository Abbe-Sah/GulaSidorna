package ApplicationFiles;

import java.util.ArrayList;
import java.util.Scanner;

public class Profile {
    Scanner scanner = new Scanner(System.in);

    private final ArrayList<ProfileInfo> profileList = new ArrayList<>();


    public void addProfile(ProfileInfo profileInfo) {
        profileList.add(profileInfo);
    }

    public void printProfileList() {
        for (ProfileInfo profiles : profileList) {
            System.out.println(profileList.indexOf(profiles) + ": " + profiles.getFirstName() + " " + profiles.getLastName() + " Age: " + profiles.getAge() + ", Phone: " + profiles.getPhoneNumber() + profiles.getAddress());
        }
    }

    public ArrayList<ProfileInfo> getProfileList() {
        return profileList;
    }

    public void removeProfile(int inputNumber) {
        profileList.remove(inputNumber);
        System.out.println("Removed profile");
    }

    public void updateProfile(int profileIndex) {
        System.out.println("Update Name");
        String name = scanner.next();
        System.out.println("Update Lastname");
        String lastName = scanner.next();
        System.out.println("Update Age");
        int age = scanner.nextInt();
        System.out.println("Update PhoneNumber");
        String phoneNumber = scanner.next();
        System.out.println("Update Street name");
        String streetName = scanner.next();
        System.out.println("Update Street number");
        int streetNumber = scanner.nextInt();
        System.out.println("Update Apartment number");
        int apartmentNumber = scanner.nextInt();
        System.out.println("Update  ZipCode");
        int zipCode = scanner.nextInt();
        System.out.println("Update  City");
        String city = scanner.next();
        ProfileInfo profileInfo = new ProfileInfo(name, lastName, age, phoneNumber, streetName, streetNumber, apartmentNumber, zipCode, city);
        profileList.set(profileIndex, profileInfo);
        System.out.println("Updated profile at index " + profileIndex);


    }

    // This is for just for populate the list with some people.
    public void addDummyProfilesToList() {
        ProfileInfo dummyOne = new ProfileInfo("Kalle", "Svensson", 34,
                "0705545554", "Författarvägen", 45,
                4, 78465, "Östersund");
        profileList.add(dummyOne);
        ProfileInfo dummyTwo = new ProfileInfo("Max", "Bengtsson", 25,
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
        ProfileInfo dummyTen = new ProfileInfo("Elias", "Pirmoradi", 19,
                "0764587575", "Hisingsvägen", 93,
                1, 90414, "Göteborg");
        profileList.add(dummyTen);

    }


}
