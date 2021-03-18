/*

Turbo Sort 

Problem Code: TSORT

Given the list of numbers, you are to sort them in non decreasing order.
Input

t – the number of numbers in list, then t lines follow [t <= 10^6].
Each line contains one integer: N [0 <= N <= 10^6]
Output

Output given numbers in non decreasing order.
Example

Input:

5
5
3
6
7
1

Output:

1
3
5
6
7

*/

import java.util.*;

public class Main {

	public static void main(String args[]) {
        try{
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int[] intArray = new int[x];
            for(int i = 0; i<intArray.length;i++){
                intArray[i] = sc.nextInt();
            }
            Arrays.sort(intArray);
            for(int n: intArray){
                System.out.print(n+" ");
            }
		    // turboSort(intArray);
        } catch(Exception e){

        }
	}

	// public static void turboSort(int[] arr) {
	// 	for (int i = 0; i < arr.length; i++) {
	// 		for (int j = i + 1; j < arr.length; j++) {
	// 			int temp = 0;
	// 			if (arr[i] > arr[j]) {
	// 				temp = arr[i];
	// 				arr[i] = arr[j];
	// 				arr[j] = temp;
	// 			}
	// 		}
	// 		System.out.print(arr[i] + " ");
	// 	}
	// 	return;
	// }
}