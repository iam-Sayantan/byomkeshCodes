/*

Reverse The Number 

Problem Code: FLOW007

Given an Integer N, write a program to reverse it.
Input

The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.
Output

For each test case, display the reverse of the given number N, in a new line.
Constraints

    1 ≤ T ≤ 1000
    1 ≤ N ≤ 1000000

Example

Input
4
12345
31203
2123
2300
Output
54321
30213
3212
32


*/

import java.util.*;

public class Main{

    public static void main (String args[]) {

        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0){
                int num = sc.nextInt();
                System.out.println(reverseNum(num));
            }


        } catch (Exception e) {

        }

    }

    public static int reverseNum(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            rev = (rev*10) + rem;
        }
        return rev;
    }

}