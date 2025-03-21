package koval.test2;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class Test2 {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3};
    int[] numbers1 = {1};
    int[] numbers2 = {1,2};
    int[] emptyNumbers = {};
    
    if (Arrays.equals(numbers, numbers1)) {
      System.out.println("true");
    }
    else {
      System.out.println("false");
    }
    
    if (Arrays.equals(ArrayUtils.subarray(numbers, 0, 3), numbers)) {
      System.out.println("true");
    }
    else {
      System.out.println("false");
    }
    
    if (Arrays.equals(ArrayUtils.subarray(numbers, 0, 1), numbers1)) {
      System.out.println("true");
    }
    else {
      System.out.println("false");
    }
    
    System.out.println("hello".substring(1, 3));

  }

}