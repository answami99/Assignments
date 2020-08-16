/**Remove 3 Multiples
 
Write a program that accepts an ArrayList of integers as input and removes every 3rd element and prints the final ArrayList.
 
Suppose the given arrayList contains 10 elements remove the 3rd, 6th and 9th elements.
 
Include a class UserMainCode with a static method “removeMultiplesOfThree” that accepts an ArrayList<Integer> as arguement and returns an ArrayList<Integer>.
 
Create a class Main which would get the required input and call the static method removeMultiplesOfThree present in the UserMainCode.
 
Input and Output Format:
The first line of the input consists of an integer n, that corresponds to the number of elements to be added in the ArrayList.
The next n lines consist of integers that correspond to the elements in the ArrayList.
 
Output consists of an ArrayList of integers.
 
Sample Input:
6
3
1
11
19
17
19
 
Sample Output
3
1
19
17
*/



import java.util.*;
class UserMainCode{
  static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> list){
      int counter = 1;
      ArrayList<Integer> arr = new ArrayList<Integer>();
      Iterator it = list.iterator();
      while(it.hasNext()){
        int num = (int)it.next();
        if((counter%3)!= 0){
          arr.add(num);
        }
        counter++;
      }
      return arr;
  }
}
class Main{
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    int num = in.nextInt();
    for(int i = 0;i<num;i++){
        list.add(in.nextInt());
    }
    list = UserMainCode.removeMultiplesOfThree(list);
    for(int i : list){
      System.out.println(i);
    }
  }
}
