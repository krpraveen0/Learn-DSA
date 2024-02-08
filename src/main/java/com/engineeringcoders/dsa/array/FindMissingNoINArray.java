package com.engineeringcoders.dsa.array;

public class FindMissingNoINArray {
    public static void main(String[] args){
        //find the missing number in an array
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        //As the one element of above array arr is missing so length of arr will be n+1
        //find the sum of n natural number
        int sum_natural_num = ((n+1)*(n+2)/2);
        int sum = 0;

        // sum of current elements
        for(int i = 0; i<n ; i++){
            sum += arr[i];
        }

        int missing_elem = 0;
        missing_elem = sum_natural_num - sum;
        System.out.println("The missing number is: " + missing_elem);
    }

}
