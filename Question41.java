/**Calculate Average – Hash Map
Write amethod that accepts the input data as a hash map and finds out the avg of all values whose keys are odd numbers.   Include a class UserMainCode with a static method calculateAverage which accepts aHashMap<Integer,Double> and the size of the HashMap. The return type (Double) should return the calculated average. Round the average to two decimal places and return it.
Create a Class Main which would be used to accept Input values and store it as a hash map, and call the static method present in UserMainCode. 
Input and Output Format:
Input consists of an integer n corresponds to number of hash map values, followed by 2n values. (index followed by value).
Output consists of a Double.
Refer sample input and output for formatting specifications.
Sample Input :
4
1
3.41
2
4.1
3
1.61
4
2.5
Sample Output :
2.51
*/



import java.util.*;
import java.text.DecimalFormat;
class UserMainCode{
  static double calculateAverage(HashMap<Integer,Double> map){
    Iterator<Integer> it= map.keySet().iterator();
    int counter = 0;
    double sum = 0;
    while(it.hasNext()){
      int key = it.next();
      if(key%2 != 0){
        sum = sum + map.get(key);
        counter++;
      }
    }
    double avg = sum/counter;
    return avg;
  }
}
class Main{
  public static void main(String [] args){
    DecimalFormat form = new DecimalFormat("#.00");
    Scanner in = new Scanner(System.in);
    HashMap<Integer,Double> map = new HashMap<Integer,Double>();
    int num = in.nextInt();
    for(int i = 0;i<num;i++){
      map.put(in.nextInt(),in.nextDouble());
    }
    double average = UserMainCode.calculateAverage(map);
    System.out.println(form.format(average));
  }
}
