package ApplicationFiles;

public class MenuMessageOptions implements ApplicationMessages {

    @Override
    public void print() {
        System.out.println("""
                -------------------------------------
                Welcome to the Yellow Pages,""" + " " + Authentication.userRole + "!" + """
                \nPlease pick one of the options below:""");
        System.out.print("""
                1. Search for profile
                2. Add a new profile
                3. Login as admin
                4. Quit
                -------------------------------------
                """);
    }
}
