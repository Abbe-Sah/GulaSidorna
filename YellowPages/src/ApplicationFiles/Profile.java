package ApplicationFiles;

import java.util.ArrayList;

public class Profile {


    private ArrayList<ProfileInfo> profileList = new ArrayList<>();


    public void addProfile(ProfileInfo profileInfo){
        profileList.add(profileInfo);
    }

    public void printProfileList() {

        profileList.stream().forEach(System.out::println);


//        for(ProfileInfo profiles : profileList){
//            System.out.println(profiles.getFirstName() + " " + profiles.getLastName() + " Age: " + profiles.getAge() + ", Phone: " + profiles.getPhoneNumber() + " " + profiles.getAddress());
//        }
    }

    public ArrayList<ProfileInfo> getProfileList() {
        return profileList;
    }


}
