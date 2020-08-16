/**Employees & Designations
   A Company wants to obtain employees of a particular designation. You have been assigned as the programmer to build this package.
   You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:     
   Read Employee details from the User. The details would include name and designaton in the given order. The datatype for name and designation is string.     
   Build a hashmap which contains the name as key and designation as value.     
   You decide to write a function obtainDesignation which takes the hashmap and designation as input and returns a string List of employee names who belong 
   to that designation as output. Include this function in class UserMainCode. Display employee name's in ascending order.
   Create a Class Main which would be used to read employee details in step 1 and build the hashmap. Call the static method present in UserMainCode.  
   Input and Output Format:
   Input consists of employee details. The first number indicates the size of the employees. The next two values indicate the employee name employee designation. 
   The last string would be the designation to be searched.
   Output consists of a array values containing employee names.
   Refer sample output for formatting specifications.
   
   Sample Input 1:
   4
   Manish
   MGR
   Babu
   CLK
   Rohit
   MGR
   Viru
   PGR
   MGR
   
   Sample Output 1:
   Manish
   Rohit
*/


import java.util.*;
class UserMainCode{
  static TreeSet<String> obtainDesignation(HashMap<String,String> map, String val){
    TreeSet<String> sorted = new TreeSet<String>();
    int i = 0;
    String [] onlyDes = new String[map.size()];
    onlyDes = onlyDesignation(map);
    Iterator<String> it = map.values().iterator();
    while(it.hasNext()&&i<map.size()){
      String temp  = it.next();
      if(temp.equals(val)){
        sorted.add(onlyDes[i]);
      }
      i++;
    }
    return sorted;
}
  static String [] onlyDesignation(HashMap<String,String> map){
    int i = 0;
    String [] des = new String[map.size()];
    Iterator<String> it = map.keySet().iterator();
    while(it.hasNext()&&i<map.size()){
      des[i] = it.next();
      i++;
    }
    return des;
  }
}
class Main {
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    HashMap<String,String> map = new HashMap<String,String>();
    int num = in.nextInt();
    in.nextLine();
    for(int i = 0; i<num ;i++){
      String name = in.nextLine();
      String desig = in.nextLine();
      map.put(name,desig);
    }
    String des = in.nextLine();
    TreeSet<String> Name = UserMainCode.obtainDesignation(map,des);
    for(String i : Name){
      System.out.println(i);
    }
  }
}
