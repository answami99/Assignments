/**Removing Keys from HashMap
Given a method with a HashMap<Integer,string> as input. Write code to remove all the entries having keys multiple of 4 and return the size of the final hashmap.
 
Include a class UserMainCode with a static method sizeOfResultandHashMap which accepts hashmap as input.
 
The return type of the output is an integer which is the size of the resultant hashmap.
 
Create a class Main which would get the input and call the static method sizeOfResultandHashMap present in the UserMainCode.
 
Input and Output Format:
First input corresponds to the size of the hashmap.
Input consists of a hashmap<integer,string>.
Output is an integer which is the size of the hashmap.
Refer sample output for formatting specifications.
 
Sample Input 1:
3
2
hi
4
hello
12
hello world
Sample Output 1:
1
 Sample Input 2:
3
2
hi
4
sdfsdf
3
asdf
Sample Output 2:
2*/



import java.util.*;
class UserMainCode{
  static int sizeOfResultandHashMap(HashMap<Integer,String> h1){
    h1.entrySet().removeIf(entry -> ((entry.getKey()%4)==0));//Lambda Expression
    return h1.size();

  }
}
class Main{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    HashMap<Integer, String> h1= new HashMap<Integer, String>();
    int num = input.nextInt();

    for(int j = 0; j<num; j++){
      h1.put(input.nextInt(),input.nextLine());
    }
    System.out.println(UserMainCode.sizeOfResultandHashMap(h1));
  }
}
