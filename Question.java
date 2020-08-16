/**Write a program to read an array of strings and return an arraylist which consists of words whose both first and last characters are vowels. Assume all inputs are in lowecase.
Include a class UserMainCode with a static method matchCharacter which accepts a string array. The return type shoud be an arraylist which should contain elements as mentioned above.
Create a Class Main which would be used to accept Input array and call the static method present in UserMainCode.
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' string correspond to the elements in the array.
Output consists of strings which are elements of arraylist
Refer sample output for formatting specifications.
  
Sample Input 1:
4
abcde
pqrs
abci
orto
  
Sample Output 1:
abcde
abci
orto
*/


import java.util.*;
class UserMainCode{
  static ArrayList<String> matchCharacter(String [] input){
    ArrayList<String> output = new ArrayList<>();
    for(int i = 0;i<input.length;i++){
      int l = input[i].length();
      char first = input[i].charAt(0);
      char last = input[i].charAt(l-1);
      if((first=='a'||first=='e'||first=='i'||first=='o'||first=='u')&&(last=='a'||last=='e'||last=='i'||last=='o'||last=='u')){
        output.add(input[i]);
      }
    }
    return output;
  }
}

class Main{
  public static void main(String [] args){
  Scanner in = new Scanner(System.in);
  int num  = in.nextInt();
  String [] input = new String[num];
  in.nextLine();
  for(int i = 0; i<num; i++){
    input[i]=in.nextLine();
  }
  ArrayList<String> output = UserMainCode.matchCharacter(input);
  Iterator<String> it = output.iterator();
  while(it.hasNext()){
    System.out.println(it.next());
  }
}
}
