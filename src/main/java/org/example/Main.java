package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    //Method to remove duplicates
    static int removeDuplicates(Integer arr[], int n)
    {
        if (n == 0 || n == 1)
            return n;
        // To store index of next unique element
        int j = 0;
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
        arr[j++] = arr[n-1];
        return j;
    }

    static Integer[] sortArrayDescending (Integer[] arr ){
        //print original array
        System.out.printf("Original Array: %s", Arrays.toString(arr));
        // Sorts IntArray in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        //print sorted array
        System.out.printf("\n\nSorted Array: %s",
                Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
        //define Array
        Integer[] arr = {10, 10, 30, 40, 40, 65, 70, 70, 30, 55};
        int n = arr.length;
        //Sort array
        arr = sortArrayDescending(arr);
        //remove duplicates
        n = removeDuplicates(arr, n);
        System.out.printf("\n\nArray with Duplicates Removed: ");
        // Print updated array
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");


    }
}