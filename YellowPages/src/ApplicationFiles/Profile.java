package ApplicationFiles;

import java.util.ArrayList;

public class Profile {

    private ArrayList<ProfileInfo> profileList = new ArrayList<>();


    public void addProfile(ProfileInfo profileInfo){
        profileList.add(profileInfo);
    }

    public void getProfileList() {
        for(ProfileInfo profiles : profileList){
            System.out.println(profiles.getFirstName() + " " + profiles.getLastName() + " " + profiles.getPhoneNumber() + " " + profiles.getAddress());
        }
    }

}
