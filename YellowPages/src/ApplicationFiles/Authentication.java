package ApplicationFiles;

import java.util.Scanner;

public class Authentication {
    private static String password = "teamtwo";
    public static String userRole = "USER";
    static boolean isAdmin = false;
    public static void login(String inputPassword){
        if(inputPassword.contains(password) && inputPassword.length() == password.length()){
            isAdmin = true;
            userRole = "ADMIN";
            System.out.println("You are logged in as " + userRole);
        }
        else {
            isAdmin = false;
            userRole = "USER";
            System.out.println("Wrong Password");
        }
    }

    public boolean isAdmin() {
        return isAdmin;
    }

}
