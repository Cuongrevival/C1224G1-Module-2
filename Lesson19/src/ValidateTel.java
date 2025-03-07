import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateTel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Tel no:");
        String TelNo = sc.nextLine();
        String regex = "^(\\([0-9]{2}\\))-\\(0[0-9]{9}\\)$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(TelNo);
        if (m.matches()) {
            System.out.println(m.group());
        }
        else {
            System.out.println("Invalid Tel No");
        }
    }
}
