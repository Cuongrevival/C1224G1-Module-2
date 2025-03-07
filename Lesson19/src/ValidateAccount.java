import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "^[_a-z0-9]{6,}$";
        Pattern pattern = Pattern.compile(regex);
        do {
            System.out.println("Enter your account: ");
            String account = sc.nextLine();
            Matcher matcher = pattern.matcher(account);
            if (matcher.find()) {
                System.out.println("Your account is valid");
            } else {
                System.out.println("Your account is not valid");
            }
        } while (true);
    }
}
