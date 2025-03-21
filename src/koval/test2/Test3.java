package koval.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Test3 {
  
  public static void fill1(List<String> coll, String element, int begin, int end) {
    if (coll == null || coll.size() == 0) {
      return;
    }
    
    int begin1 = begin < 0 ? 0 : begin;
    int end1 = end > coll.size() ? coll.size() : end;
    
    if (begin1 >= end1) {
      return;
    }
    
    for (int i = begin1; i < end1; i++) {
      coll.set(i, element);
    }
    
  }

  public static void main(String[] args) {
    //List<Integer> coll = Arrays.asList(1, 2, 3, 4);
    //List<Integer> coll1 = Arrays.asList(1, 2, 3, 4);
    //List.
    
    List<Integer> coll = new ArrayList<Integer>();
    coll.add(1);
    coll.add(2);
    coll.add(3);
    coll.add(4);
    
    //coll.addAll(<1, 2>);
    
    //ArrayList<Integer> coll1 = new ArrayList<Integer>();
    List<Integer> coll1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
    
    //coll1.add(1);
    //coll1.add(2);
    //coll1.add(3);
    //coll1.add(5);
    
    System.out.println(coll.equals(coll1));
    
    
    List<Integer> coll_1 = Arrays.asList(1, 2, 3, 4);
    List<Integer> coll_2 = Arrays.asList(1, 2, 3, 4);
    
    System.out.println(coll_1.equals(coll_2));
    
    //assertTrue(coll_1.equals(coll_2));
    
    var emptyColl = List.of();
    
    
    
    
    List<String> coll1_1 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
    List<String> coll1_2 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d1"));
    System.out.println(coll1_1.equals(coll1_2));
    System.out.println(coll1_1.get(3));
    
    System.out.println("");
    
    
    fill1(coll1_1, "*", 2, 3);
    
    System.out.println(coll1_1.get(0));
    System.out.println(coll1_1.get(1));
    System.out.println(coll1_1.get(2));
    System.out.println(coll1_1.get(3));
    
    
    Path path = Paths.get("src", "test", "resources", "fixtures", "1.txt")
        .toAbsolutePath().normalize();
    System.out.println(path.toString());
  }

}