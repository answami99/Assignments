/**Largest Key in HashMap
 
Write a program that construts a hashmap and returns the value corresponding to the largest key.
Include a class UserMainCode with a static method getMaxKeyValue which accepts a string. The return type (String) should be the value corresponding to the largest key.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of 2n+1 values. The first value corresponds to size of the hashmap. The next n pair of numbers equals the integer key and value as string.
Output consists of a string which is the value of largest key.
Refer sample output for formatting specifications.
Sample Input 1:
3
12
amron
9
Exide
7
SF
Sample Output 1:
Amron
*/



import java.util.*;
class UserMainCode{
  static String getMaxKeyValue(HashMap<Integer,String> map){
    Iterator<Integer> it = map.keySet().iterator();
    List<Integer> keys = new ArrayList<Integer>();
    while(it.hasNext()){
      keys.add(it.next());
    }
    int max = Collections.max(keys,null);
    return map.get(max);
  }
}
class Main{
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    HashMap<Integer,String> map = new HashMap<Integer,String>();
    int num = in.nextInt();
    for(int i = 0;i <num; i++){
      int key = in.nextInt();
      in.nextLine();
      String value = in.nextLine();
      map.put(key,value);
    }
    System.out.println(UserMainCode.getMaxKeyValue(map));
  }
}
