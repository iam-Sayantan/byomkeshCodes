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
import java.math.BigInteger;
import java.io.*;

public class Main{
    public static void main(String args[]){

        try{

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            final int t = Integer.parseInt(bufferedReader.readLine());
            for(int i=0;i<t;i++){
                final int n = Integer.parseInt(bufferedReader.readLine());
                System.out.println(factorial(n));
            }      
        } catch (Exception e){

        }
    }

    public static BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE;
        for(int i = 2; i<=n;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}