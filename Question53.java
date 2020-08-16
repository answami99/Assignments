/**Grade Calculator

A School wants to give assign grades to its students based on their marks. You have been assigned as the programmer to automate this process. 
You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
Read student details from the User. The details would include name, mark in the given order. The datatype for name is string, mark is float.
You decide to build a hashmap. The hashmap contains name as key and mark as value.

BUSINESS RULE:
1. If Mark is less than 60, then grade is FAIL.
2. If Mark is greater than or equal to 60, then grade is PASS.
Note: FAIL/PASS should be in uppercase. Store the result in a new Hashmap with name as Key and grade as value.
4. You decide to write a function calculateGrade which takes the above hashmap as input and returns the hashmap as output. Include this function in class UserMainCode.
Create a Class Main which would be used to read student details in step 1 and build the hashmap. Call the static method present in UserMainCode.

Input and Output Format:

Input consists of student details. The first number indicates the size of the students. The next two values indicate the name, mark.

Output consists of a name and corresponding grade for each student.  Refer sample output for formatting specifications.

Sample Input 1:
3
Avi
76.36
Sunil
68.42
Raja
36.25

Sample Output 1:
Avi
PASS
Sunil
PASS
Raja
FAIL*/


 import java.util.*;
 class UserMainCode{
   static HashMap<String,String> calculateGrade(HashMap<String,Float> map){
     HashMap<String,String> grade = new HashMap<String,String>();
     Iterator<String> it = map.keySet().iterator();
     while(it.hasNext()){
       String name = it.next();
       float marks = map.get(name);
       if(marks<60){
         grade.put(name,"FAIL");
       }else{
         grade.put(name,"PASS");
       }
       //if(it.
     }
     return grade;
   }
 }
 class Main{
   static void Display(HashMap<String,String> result){
     Iterator<String> it = result.keySet().iterator();
     while(it.hasNext()){
       String s = it.next();
       System.out.println(s);
       System.out.println(result.get(s));
     }
   }
   public static void main(String [] args){
     HashMap<String,Float> map = new HashMap<String, Float>();
     Scanner in = new Scanner(System.in);
     int num = in.nextInt();
     for(int i = 0 ; i<num ;i++){
       in.nextLine();
       map.put(in.nextLine(),in.nextFloat());
     }
     Main.Display(UserMainCode.calculateGrade(map));

   }
 }
