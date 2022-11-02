package ApplicationFiles;

import java.util.ArrayList;

public class Profile {


    private ArrayList<ProfileInfo> profileList = new ArrayList<>();


    public void addProfile(ProfileInfo profileInfo){
        profileList.add(profileInfo);
    }

    public void printProfileList() {
        for(ProfileInfo profiles : profileList){
            System.out.println(profiles.getFirstName() + " " + profiles.getLastName() + " Age: " + profiles.getAge() + ", Phone: " + profiles.getPhoneNumber() + " " + profiles.getAddress());
        }
    }

    public ArrayList<ProfileInfo> getProfileList() {
        return profileList;
    }

    public void removeProfile(int inputNumber){
        profileList.remove(inputNumber);
        System.out.println("Removed profile");
    }

    public void updateProfile(int inputNumber, ProfileInfo profileInfo){
        profileList.set(inputNumber, profileInfo);
        System.out.println("Updated profile");
    }


}
