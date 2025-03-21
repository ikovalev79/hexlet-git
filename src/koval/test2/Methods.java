package koval.test2;

import org.apache.commons.lang3.ArrayUtils;

public class Methods {
    private static String implementation = "wrong4";

    private static int[] right(int[] numbers, int n) {
        return ArrayUtils.subarray(numbers, 0, n);
    }

    private static int[] wrong1(int[] numbers, int n) {
        return n <= numbers.length
            ? ArrayUtils.subarray(numbers, 0, n)
            : new int[] {};
    }

    private static int[] wrong2(int[] numbers, int n) {
        return ArrayUtils.isEmpty(numbers)
            ? new int[] {0}
            : ArrayUtils.subarray(numbers, 0, n);
    }

    private static int[] wrong3(int[] numbers, int n) {
        return n == 0
            ? ArrayUtils.subarray(numbers, 0, numbers.length)
            : ArrayUtils.subarray(numbers, 0, n);
    }

    private static int[] wrong4(int[] numbers, int n) {
        return n == numbers.length
            ? new int[] {}
            : ArrayUtils.subarray(numbers, 0, n);
    }

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static int[] take(int[] numbers, int n) {
      if (implementation.equals("wrong1")) {
        return wrong1(numbers, n);
      }
      else if (implementation.equals("wrong2")) {
        return wrong2(numbers, n);
      }
      else if (implementation.equals("wrong3")) {
        return wrong3(numbers, n);
      }
      else if (implementation.equals("wrong4")) {
        return wrong4(numbers, n);
      }
      else {
        return right(numbers, n);
      }
    }
}