package koval.test2;

import static org.assertj.core.api.Assertions.assertThat;
import static koval.test2.Methods3.gt;

public class Methods3Test {

  public static void main(String[] args) {
    assertThat(gt(3,1)).isTrue();
    assertThat(gt(3,3)).isFalse();
    assertThat(gt(1,3)).isFalse();

  }

}