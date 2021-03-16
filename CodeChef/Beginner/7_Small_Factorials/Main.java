/*

Problem Statement - Small factorials

Problem Code: FCTRL2

 You are asked to calculate factorials of some small positive integers.
Input

An integer t, 1<=t<=100, denoting the number of testcases, followed by t lines, each containing a single integer n, 1<=n<=100.
Output

For each integer n given at input, display a line with the value of n!
Example
Sample input:

4
1
2
5
3

Sample output:

1
2
120
6

*/

import java.util.*;

public class Main{
    public static void main(String args[]){

        try{

            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t-- > 0 ){
                long n = sc.nextLong();
                long fact = 1;
                for(int i = 1;i<=n;i++){
                fact = fact*i;
                }
                System.out.println(fact);
            }   

        } catch (Exception e){

        }


    }
}