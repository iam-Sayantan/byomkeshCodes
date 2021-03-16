/*
Problem Code: INTEST

The purpose of this problem is to verify whether the method you are using to read input data is sufficiently fast to handle problems branded with the enormous Input/Output warning. You are expected to be able to process at least 2.5MB of input data per second at runtime.
Input

The input begins with two positive integers n k (n, k<=107). The next n lines of input contain one positive integer ti, not greater than 109, each.
Output

Write a single integer to output, denoting how many integers ti are divisible by k.
Example

Input:
7 3
1
51
966369
7
9
999996
11

Output:
4

*/

import java.util.*;

public class Main {

    public static void main (String args[]){

        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            int arr[] = new int[n];
            for(int i = 0; i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i<n;i++){
                if(arr[i]%k==0){
                    count++;
                }
            }
            System.out.println(count);

            
            
        } catch (Exception e) {

        }

    }

}