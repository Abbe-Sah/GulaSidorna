package ApplicationFiles;

import java.util.Scanner;

public class Authentication {
    private static String password = "teamtwo";
    static boolean isAdmin = false;
    public static void login(String inputPassword){
        if(inputPassword.contains(password) && inputPassword.length() == password.length()){
            isAdmin = true;
            System.out.println("You are logged in");
        }
        else {
            isAdmin = false;
            System.out.println("Wrong Password");
        }
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
