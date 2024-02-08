package com.engineeringcoders.dsa.array;

public class ReversingOfArray {
    // Reversal of an array
    public static void main(String[] args){
        int array[] = {1,3,5,7,7};
        int n = array.length;

        //reversing the array
        for(int i =0 ;i<n/2;i++){
            // swap the elements between arr[i] and arr[n-i-1]
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
        System.out.println("Reversal of an array is:");
        for(int i = 0;i<n;i++){
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

}
