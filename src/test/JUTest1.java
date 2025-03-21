package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class JUTest1 {

  @Test
  void test1() {
    List<Integer> coll_1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
    List<Integer> coll_2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5));
    
    assertTrue(coll_1.equals(coll_2));
  }
  
  @Test
  void test2() {
    List<Integer> coll_1_1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
    List<Integer> coll_2_1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 6));
    
    assertTrue(coll_1_1.equals(coll_2_1));
  }

}
