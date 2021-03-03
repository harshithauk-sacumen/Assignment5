package com.company;
import java.io.*;

class RepeatedNo {
    static int count=0;

    // Returns maximum repeating element
    static int maxRepeating(int arr[], int n, int k)
    {
        // Iterate though input array, for every element arr[i], increment arr[arr[i]%k] by k
        for (int i = 0; i< n; i++)
            arr[(arr[i]%k)] += k;

        // Find index of the maximum repeating element
        int max = arr[0], result = 0;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                result = i;
            }
            count++;
        }
        return result;
    }

    public static void main (String[] args)
    {

        int arr[] = {1,1,2,2,3,4,2,2,2,2,2,2,7,8,9,10};
        int n = arr.length;
        int k=16;
        System.out.println("Maximum repeating element is: " + maxRepeating(arr,n,k)+ " it is repeated "+count+"times");
    }
}
