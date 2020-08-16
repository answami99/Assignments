/**Removing elements from HashMap
Given a HashMap as input, write a program to perform the following operation :  If the keys are divisible by 3 then remove that key and its values and print the number of remaining keys in the hashmap.
 
Include a class UserMainCode with a static method afterDelete which accepts a HashMap as input.
 
The return type of the output is an integer which represents the count of remaining elements in the hashmap.
 
Create a class Main which would get the input and call the static method afterDelete present in the UserMainCode.
 
Input and Output Format:
First input corresponds to the size of hashmap
Input consists a HashMap
Output is an integer which is the count of remaining elements in the hashmap.
Refer sample output for formatting specifications.
 
Sample Input 1:
4
339
RON
1010
JONS
3366
SMITH
2020
TIM
Sample Output 1:
2
 
Sample Input 2:
5
1010
C2WE
6252
XY4E
1212
M2ED
7070
S2M41ITH
8585
J410N
Sample Output 2:
3
*/



import java.util.*;
class UserMainCode{
  static int afterDelete(HashMap<Integer,String> map){
    HashMap<Integer,String> map1 = new HashMap<Integer, String>();
      Iterator<Integer> it = map.keySet().iterator();
      while(it.hasNext()){
        int key = it.next();
        if(key%3!=0){
          map1.put(key,map.get(key));
        }
      }
      return map1.size();
  }
}
class Main{
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    HashMap<Integer,String> map = new HashMap<Integer,String>();
    int num = in.nextInt();
    for(int i = 0; i<num; i++){
      int key = in.nextInt();
      in.nextLine();
      String value = in.nextLine();
      map.put(key,value);
    }
    int size = UserMainCode.afterDelete(map);
    System.out.println(size);
  }
}
