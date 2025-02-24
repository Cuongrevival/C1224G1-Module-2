
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<String> cars = new Stack<>();
        cars.push("BMW");
        cars.push("Audi");
        cars.push("Honda");
        System.out.println(cars);
        while (!cars.isEmpty()) {
            System.out.println(cars.pop());
            System.out.println(cars);
        }
    }
}
