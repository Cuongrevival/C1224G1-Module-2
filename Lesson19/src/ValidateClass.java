import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter class name: ");
       String className = sc.nextLine();
       String regex = "^[C|AP]\\d{4}[G|HIK]";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(className);
       if (matcher.matches()) {
           System.out.println("Your class is valid");
       }
       else {
           System.out.println("Your class is not valid");
       }
    }
}
