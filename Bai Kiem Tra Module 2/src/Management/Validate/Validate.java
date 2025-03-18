package Management.Validate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String PHONE_EXISTS = "^090\\d{7}$|091\\d{7}";
    static Pattern pattern = Pattern.compile(PHONE_EXISTS);

    public static boolean isValidateFormatOfDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean isValidatePhone(String phone, List<String> existsPhone) {
        Matcher m = pattern.matcher(PHONE_EXISTS);
        if (m.matches()) {
            if (existsPhone.contains(phone)) {
                System.err.println("Số điện thoại bị trùng lặp");
                return false;
            }
        }
        return true;
    }

    public static boolean isValidName(String name) {
        if (name.length() >= 4 && name.length() <= 50) {
            return true;
        }
        System.err.println("Yêu cầu nhập tên sinh viên từ 4 đến 50 ký tự");
        return false;
    }
}
