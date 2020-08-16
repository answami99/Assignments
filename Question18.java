/**Transfer from Hashmap to Arraylist
 	
Write a program that constructs a hashmap with “employee id” as key and “name” as its value. Based on the rules below, on being satisfied, the name must be added to the arraylist.
i)First character should be small and the last character should be Capital.
ii)In name at least one digit should be there.
Include a class UserMainCode with a static method getName which accepts a hashmap. The return type is an arraylist as expected in the above statement
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of 2n+1 values. The first value corresponds to size of the hashmap. The next n pair of numbers contains the employee id and name.
Output consists of arraylist of strings as mentioned in the problem statement.
Refer sample output for formatting specifications.
Sample Input 1:
4
1
ravi5raJ
2
sita8gitA
3
ram8sitA
4
rahul
Sample Output 1:
ravi5raJ
sita8gitA
ram8sitA
*/



import java.util.*;
class UserMainCode{
  static ArrayList<String> getName(HashMap<Integer,String> map){
    ArrayList<String> accepted = new ArrayList<String>();
    Iterator<String> it = map.values().iterator();
    while(it.hasNext()){
      String name = it.next();
      int size = name.length();
      if(name.matches("(.*)\\d(.*)")&& Character.isLowerCase(name.charAt(0)) && Character.isUpperCase(name.charAt(size-1))){
        accepted.add(name);
      }
    }
    return accepted;
  }
}
class Main{
  public static void main(String [] args){
    HashMap<Integer,String> map = new HashMap<Integer,String>();
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for(int i = 0; i<num; i++){
      int employeeid = in.nextInt();
      in.nextLine();
      String name = in.nextLine();
      map.put(employeeid,name);
    }
    ArrayList<String> acceptedName = UserMainCode.getName(map);
    for(String i : acceptedName){
      System.out.println(i);
    }
  }
}
