package koval.test2;

import java.util.List;
import java.util.Map;

public class TestForHexLet2 {

  public static void main(String[] args) throws Exception {
    List<Map<String, String>> companies = Data2.getCompanies();
    
    int i = -1;
    
    for (Map<String, String> company : companies) {
      i++;
      System.out.println(i + " | " + Integer.valueOf(company.get("id")) + " | " + company.get("name") + " | " + company.get("phone"));
    }
    
    String vvv = "123e";
    vvv.equals(vvv);
    
    //Integer.valueOf("123").
    System.out.println(Integer.parseInt("123"));
    
    //companies.
    
    System.out.println();
    
    
    int id = 300;
    
    int listId = -1;
    int requestedListId = -1;
    
    for (Map<String, String> company : companies) {
      listId++;
      
      if (Integer.valueOf(company.get("id")) == id) {
        requestedListId = listId;
      }
    }
    
    if (requestedListId != -1) {
      System.out.println(requestedListId + " | " + Integer.valueOf(companies.get(requestedListId).get("id")) + " | " + companies.get(requestedListId).get("name") + " | " + companies.get(requestedListId).get("phone"));
    }
    else {
      throw new Exception("Company not found"); //NotFoundResponse("Company not found");
    }

  }

}