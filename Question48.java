/**Sum of Lowest marks
Given input as HashMap, value consists of marks and rollno as key.Find the sum of the lowest three subject marks from the HashMap.
 
Include a class UserMainCode with a static method getLowest which accepts a Hashmap with marks and rollno.
 
The return type of the output is the sum of lowest three subject marks.
 
Create a class Main which would get the input and call the static method getLowest present in the UserMainCode.
 
Input and Output Format:
First line of the input corresponds to the HashMap size.
Input consists a HashMap with marks and rollno.
Output is an integer which is the sum of lowest three subject marks.
Refer sample output for formatting specifications.
 
Sample Input 1:
5
1
54
2
85
3
74
4
59
5
57
Sample Output 1:
170
  
Sample Input 2:
4
10
56
20
58
30
87
40
54
Sample Output 2:
168
*/



import java.util.*;
class UserMainCode{
  static int getLowest(HashMap<Integer,Integer> map){
    LinkedList<Integer> list = new LinkedList<Integer>();
    Iterator<Integer> it = map.values().iterator();
    while(it.hasNext()){
      list.add(it.next());
    }
    Collections.sort(list);
    return list.get(0)+list.get(1)+list.get(2);
  }
}
class Main{
  public static void main(String [] args){
    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for(int i = 0;i<num; i++){
      map.put(in.nextInt(),in.nextInt());
    }
    System.out.println(UserMainCode.getLowest(map));
  }
}
