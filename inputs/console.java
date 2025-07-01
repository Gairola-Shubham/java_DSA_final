package inputs;

public class console {
    public static void main(String[] args) {
        System.out.println("enter the user id");
        String userid = System.console().readLine();
        System.out.println("enter the password");
        char[] pwd = System.console().readPassword();
        System.out.println("userid: " + userid);
        System.out.println("Password: " + new String(pwd));

    }
}
