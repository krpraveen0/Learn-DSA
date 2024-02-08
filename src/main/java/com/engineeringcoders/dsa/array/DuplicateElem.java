package com.engineeringcoders.dsa.array;

// Find the duplicate elements in an array
public class DuplicateElem {
   public  static void main(String[] args){
       int arr[] = {2,3,3,7};
       int n = arr.length;

       for(int i = 0; i<n; i++){
           for(int j = i+1; j<n; j++){
               if(arr[i] == arr[j]){
                   System.out.println("Duplicate Elements found is:: " + arr[i] + "at position " + j);
               }
           }
       }
   }


}
