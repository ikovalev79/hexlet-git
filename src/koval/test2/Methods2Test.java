package koval.test2;

import static org.assertj.core.api.Assertions.assertThat;
import static koval.test2.Methods2.indexOf;

public class Methods2Test {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 1, 2};
    int[] emptyNumbers = {};
    
    assertThat(indexOf(numbers, 2, 0)).isEqualTo(1);
    assertThat(indexOf(numbers, 2, 2)).isEqualTo(3);
    assertThat(indexOf(numbers, 8, 0)).isEqualTo(-1);
    assertThat(indexOf(emptyNumbers, 1, 0)).isEqualTo(-1);

  }

}