/**Average of Elements in Hashmap
Given a method with a HashMap<int, float> as input. Write code to find out avg of all values whose keys are even numbers. Round the average to two decimal places and return as output.  [Hint : If the average is 5.901, the rounded average value is 5.9 . It the average is 6.333, the rounded average value is 6.33 . ]
 
Include a class UserMainCode with a static method avgOfEven which accepts a HashMap<int, float> as input.
 
The return type of the output is a floating point value which is the average of all values whose key elements are even numbers.
 
Create a class Main which would get the input and call the static method avgOfEven present in the UserMainCode.
 
Input and Output Format:
Input consists of the number of elements in the HashMap and the HashMap<int, float>.
Output is a floating point value that corresponds to the average.
Refer sample output for formatting specifications.
 
Sample Input 1:
3
1
2.3
2
4.1
6
6.2
Sample Output 1:
5.15
 Sample Input 2:
3
9
3.1
4
6.3
1
2.6
Sample Output 2:
6.3
*/



import java.text.DecimalFormat;
import java.util.*;
class UserMainCode{
  static float avgOfEven(HashMap<Integer, Float> map){
    int counter = 0;
    float sum = 0.0f;
    float avg = 0.0f;
      Iterator<Integer> it = map.keySet().iterator();
      while(it.hasNext()){
        int key = it.next();
        if(key%2==0){
          sum = (float)(sum + map.get(key));
          counter++;
        }
      }
      avg = sum/counter;
      return avg;
      }
}
class Main{
  public static void main(String [] args){
    DecimalFormat form = new DecimalFormat("#.##");
    Scanner input = new Scanner(System.in);
    HashMap<Integer, Float> map= new HashMap<Integer, Float>();
    int num = input.nextInt();

    for(int j = 0; j<num; j++){
      Integer i = input.nextInt();
      input.nextLine();
      Float f = input.nextFloat();
      map.put(i,f);
    }
    float average = UserMainCode.avgOfEven(map);
    System.out.println(form.format(average));
  }
}
