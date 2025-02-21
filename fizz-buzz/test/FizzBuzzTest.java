import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FizzBuzzTest {
  @Test
    void testFizzBuzzTranslate() {
      int number = 26;
      String fizzBuzz = "Two Six";
      String result = FizzBuzz.checkFizzBuzz(number);
      assertEquals(fizzBuzz, result);
  }
  @Test
  void testFizzBuzzTranslate2() {
    int number = 2;
    String fizzBuzz = "Two";
    String result = FizzBuzz.checkFizzBuzz(number);
    assertEquals(fizzBuzz, result);
  }
  @Test
  void testFizzBuzzTranslate3() {
    int number = 34;
    String fizzBuzz = "Fizz";
    String result = FizzBuzz.checkFizzBuzz(number);
    assertEquals(fizzBuzz, result);
  }
  @Test
  void testFizzBuzzTranslate4() {
    int number = 100;
    String fizzBuzz = "";
    String result = FizzBuzz.checkFizzBuzz(number);
    assertEquals(fizzBuzz, result);
  }
}