package thuchanh2;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        if(isFizz(number) && isBuzz(number))
            return "FizzBuzz";

        if(isFizz(number))
            return "Fizz";

        if(isBuzz(number))
            return "Buzz";

        return number + "";
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
