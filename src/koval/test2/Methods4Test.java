package koval.test2;

import static koval.test2.Methods4.indexOf;

import java.util.List;

public class Methods4Test {

  public static void main(String[] args) {
    var coll = List.of(1, 2, 3, 2, 4);
    
    System.out.println(indexOf(coll, 2, -10));
    
    var emptyColl = List.of();
    
    System.out.println(indexOf(emptyColl, 1, -10));

  }

}