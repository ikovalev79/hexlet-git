package koval.test2;

import java.util.Arrays;
import static koval.test2.Methods.take;

public class MethodsTest {
  
  public static void testTake() {
    //BEGIN (write your solution here)
    int[] numbers = {1, 2, 3};
    int[] numbers1 = {1};
    int[] numbers2 = {1,2};
    int[] emptyNumbers = {};
    
    assert Arrays.equals(take(numbers, 1), numbers1) : "метод не работает для параметров (numbers, 1)";
    assert Arrays.equals(take(numbers, 2), numbers2) : "метод не работает для параметров (numbers, 2)";
    assert Arrays.equals(take(numbers, 3), numbers) : "метод не работает для параметров (numbers, 3)";
    assert Arrays.equals(take(numbers, 0), emptyNumbers) : "метод не работает для параметров (numbers, 0)";
    assert Arrays.equals(take(numbers, 9), numbers) : "метод не работает для параметров (numbers, 9)";
    assert Arrays.equals(take(emptyNumbers, 2), emptyNumbers) : "метод не работает для параметров (emptyNumbers, 2)";
    
    
    //assert Arrays.equals(take(emptyNumbers, 0), emptyNumbers) : "метод не работает для параметров (numbers, 0)";
    //END
  }

  public static void main(String[] args) {
    testTake();

  }

}