import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static void main(String[] args) {
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        Pattern pattern = Pattern.compile(regex);
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your email address: ");
            String email = sc.nextLine();

            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("Email is valid");
            } else {
                System.out.println("Email is not valid");
            }
        } while (true);
    }
}