/*
 * There are statistics for the year by months as an array:

int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };

Write code which calculates the maximum value from the array, 
the minimum value, the average and the median.

 */


package tasks;

import java.util.Arrays;

public class Lab_1_6_2 {

	public static void main(String[] args) {
		int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        int max = m[0], min = m[0], sum = 0;
        int median = m[m.length/2];
        for (int i = 0; i < m.length; i++){
        	sum += m[i];
        	if (m[i] < min){
        		min = m[i];
        	}
        	if (m[i] > max){
        		max = m[i];
        	}
        }
        float avg = (float)sum/m.length;
        System.out.println("Current array:");
        System.out.println(Arrays.toString(m));
        System.out.print("\nMaximum value from array: " + max);
        System.out.print("\nMinimum value from array: " + min);
        System.out.printf("\nThe average value from array: %.2f", avg);
        System.out.print("\nThe median from array: " + median);
	}

}
