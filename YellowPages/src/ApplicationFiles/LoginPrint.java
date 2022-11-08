import java.util.Scanner;

public class LoginPrint implements ApplicationMessages{
    @Override
    public void print() {
        System.out.print("Password: ");
        Scanner scanner = new Scanner(System.in);
        String inputPassword = scanner.nextLine();
        System.out.println("Authenticating...");
        Authentication.login(inputPassword);
    }
}
