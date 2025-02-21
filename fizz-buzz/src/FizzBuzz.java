public class FizzBuzz {
    public static String checkFizzBuzz(int number) {
        String readNumber1 = "";
        String readNumber2 = "";
        if (number > 0 && number < 100) {
            boolean isFizz = number % 3 == 0;
            boolean isBuzz = number % 5 == 0;
            if (isFizz && isBuzz) {
                return "FizzBuzz";
            } else if (isFizz) {
                return "Fizz";
            } else if (isBuzz) {
                return "Buzz";
            } else {
                if (String.valueOf(number).contains("3")) {
                    return "Fizz";
                } else if (String.valueOf(number).contains("5")) {
                    return "Buzz";
                } else {
                    readNumber1 = getString(number / 10, readNumber1);
                    readNumber2 = getString(number % 10, readNumber2);
                }
            }
        }
        if (String.valueOf(number).length() == 2) {
            return readNumber1 + " " + readNumber2;
        }
        return readNumber2;
    }

    private static String getString(int number, String readNumber2) {
        switch (String.valueOf(number)) {
            case "1":
                readNumber2 = "One";
                break;
            case "2":
                readNumber2 = "Two";
                break;
            case "4":
                readNumber2 = "Four";
                break;
            case "6":
                readNumber2 = "Six";
                break;
            case "7":
                readNumber2 = "Seven";
                break;
            case "8":
                readNumber2 = "Eight";
                break;
            case "9":
                readNumber2 = "Nine";
                break;
            default:
                break;
        }
        return readNumber2;
    }
}


