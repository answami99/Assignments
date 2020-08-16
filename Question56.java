/**ArrayList to String Array

Write a program that performs the following actions:
Read n strings as input.
Create an arraylist to store the above n strings in this arraylist.
Write a function convertToStringArray which accepts the arraylist as input.
The function should sort the elements (strings) present in the arraylist and convert them into a string array.
Return the array.
Include a class UserMainCode with the static method convertToStringArray which accepts an arraylist and returns an array.

Create a Class Main which would be used to read n strings and call the static method present in UserMainCode.

Input and Output Format:

Input consists of n+1 integers. The first integer denotes the size of the arraylist, the next n strings are values to the arraylist.
Output consists of an arrayas per step 4. Refer sample output for formatting specifications.

Sample Input 1:
4
a
d
c
b
Sample Output 1:
a
b
c
d
*/


import java.util.*;
class UserMainCode{
  static String [] convertToStringArray(ArrayList<String> list){
    Iterator<String> it = list.iterator();
    int n = list.size();
    //System.out.println(n);
    int i = 0;
    String str[] = new String[n];
    while(i<n && it.hasNext()){
      str[i]=it.next();
      i++;
    }

    return str;
  }
}
class Main{
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();
    int num = in.nextInt();
    in.nextLine();
    for(int i = 0; i<num; i++){
      list.add(in.nextLine());
    }
    String [] arr = UserMainCode.convertToStringArray(list);
    for(String s : arr){
      System.out.println(s);
    }
  }
}
