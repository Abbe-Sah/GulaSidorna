package ApplicationFiles;

public class Authentication {
    private final static String password = "teamtwo";
    public static String userRole = "USER";
    static boolean isAdmin = false;

    public static void login(String inputPassword) {
        if (inputPassword.equals(password)) {
            isAdmin = true;
            userRole = "ADMIN";
            System.out.println("You are logged in as " + userRole);
        } else {
            isAdmin = false;
            userRole = "USER";
            System.out.println("Wrong Password");
        }
    }

}
