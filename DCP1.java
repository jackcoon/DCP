/* Given a list of numbers, return whether any two sums to k. **/
/** For example, given [10, 15, 3, 7] and k of 17, return true since **/
/** 10 + 7 is 17. **/

// My first reaction was to just create a nested for loop to go through and compare
// each number and check if the sum exists.

/**
public class DCP{

     public static void main(String []args){
        int[] arr = {10,15,3,7,6,9,12,14,8};
        int num = 17;
        boolean sum;
        sum = pass(arr, num);
        System.out.println("Sum : " + sum);
     }
     
     static boolean pass(int [] arr, int num){
        int size = arr.length;
        
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                 if(arr[i] + arr[j] == num){
                     return true;   
                 }
            }
        }
        return false;
     }
     
}**/


////////////////////////////////////////////////////////////////////////////////////////////////////
/** Bonus: Can you do this in one pass? 
 For the bonus I sorted the array and then checked if the difference between the int that I was at
 was to high or to low, and then moved the operator in from there so it was only one pass but with
 pivots that slowly moved inward until the right combo was found **/


import java.util.Arrays;
public class DCP1{

     public static void main(String []args){
        int[] arr = {10,15,3,7,6,9,12,14,8};
        int num = 35;
        boolean sum;
        Arrays.sort(arr);
        
        sum = pass(arr, num);
        System.out.println("Sum " + sum);
     }
     
    static boolean pass(int [] arr, int num){
        int size = (arr.length - 1);
        int i = 0;
        int diff;
        
        while(i <= size){
            if((arr[i] + arr[size]) == num){
                return true;
            }
            else{
                diff = num - arr[i];
                if(diff > arr[size]){
                    i++;
                }
                else{
                    size--;
                }
            }
        }    
        return false;
    }   
}
