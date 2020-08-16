/**State ID generator

Write a program to generate the state ID.
1)Read n Strings as input(as State Name).
2)Create a String Array to Store the above Input.
3)Write a function getStateId which accepts String Array as input.
4)Create a HashMap<String,String> which stores state name as key and state Id as Value.
5)The function getStateId returns the HashMap to the Main Class.

Include UserMainCode Class With static method getStateId which accepts String array and return a hashmap.

Create a Class Main which would be used to read n strings and call the static method present in UserMainCode.


Input and Output Format:
Input Consists of an integer n denotes the size of the string array.
Output consists of an HashMap displayed in the string array order.

Sample Input 1:
3
Kerala
Gujarat
Goa

Sample Output 1:
KER:Kerala
GUJ:Gujarat
GOA:Goa
*/


import java.util.*;
class UserMainCode{
  static HashMap<String,String> getStateId(String [] state){
    HashMap<String,String> map = new HashMap<String,String>();
    for(int i =0 ; i<state.length;i++){
      String temp = "";
      for(int j = 0; j<3;j++){
        temp = temp + state[i].charAt(j);
      }
      map.put(state[i],temp.toUpperCase());
    }
    return map;
  }
}
class Main{
  static void Display(HashMap<String,String> result){
    Iterator<String> it = result.keySet().iterator();
    while(it.hasNext()){
      String s = it.next();
      System.out.println(result.get(s)+":"+s);
    }
  }
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    String [] state = new String[size];
    in.nextLine();
    for(int i = 0; i<size ; i++){
      state[i]=in.nextLine();
    }
    HashMap<String,String> stateCode = UserMainCode.getStateId(state);
    Main.Display(stateCode);
  }
}
