/*
Problem Code: FLOW001

 Shivam is the youngest programmer in the world, he is just 12 years old. Shivam is learning programming and today he is writing his first program.

Program is very simple, given two integers A and B, write a program to add these two numbers.
Input

The first line contains an integer T, the total number of test cases. Then follow T lines, each line contains two Integers A and B.

Output

For each test case, add A and B and display it in a new line.

Constraints

    1 ≤ T ≤ 1000
    0 ≤ A,B ≤ 10000

Example

Input
3 
1 2
100 200
10 40

Output
3
300
50

*/
import java.util.*;
public class Main{

    public static void main (String args[]) {

        try{

            int sum = 0;

            Scanner sc = new Scanner(System.in);

            // No. of Test Cases
            int t = sc.nextInt();

           while(t-->0){
               long a = sc.nextLong();
               long b = sc.nextLong();
               System.out.println(a+b);
           } 
            
        } catch (Exception e){

        }

    }

}