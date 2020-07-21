/** Question: Given a sorted array of n integers that has been rotated an unknown number of times, give a O(log (n)) solution that finds an element in the array?
	Input: arr [] = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14}. Find 5 .
	Output: 8 (the index of 5 in the array) **/

public class DCP{

     public static void main(String []args){
         int[] arr = {18,19,20,21,22,23,35,37,39,41,42,4,8,15,16};
         int value = 33;
         int start = 0;
         int size = arr.length;
         int index = pivot(arr, size);
         int pos = 0;

        if(value > arr[0]){
             pos = BinarySearch(arr,(index-1), start ,value);
         }
        else{
             pos = BinarySearch(arr,size,index,value);
         }
		if(pos == -1){
			System.out.println("ERROR: NOT FOUND");
		}
        else{
			System.out.println("Position " + pos + " and its value : " + arr[pos]);
		}
     }
     
     static int pivot(int arr[], int size){
            
            if(arr[0] < arr[size-1]){
                return 0;
            }
            
            int start = 0;
            int finish = (size-1);
            int mid = 0;
            
            while(start < finish){
                mid = start + (finish - start) / 2;
                if(arr[start] < arr[mid]){
                    start = mid;
                }
                else{
                    finish = mid;
                }
            }
            return (mid + 1);
     }
     
     static int BinarySearch(int[] arr, int upper, int lower, int value){
        
        int mid = 0;
		int temp = 0;
        while(lower <= upper){
             temp = mid;
			 mid = lower + ((upper-lower)/2);
             
			 if(arr[mid] == value){
                 return mid;
             }
			 if(temp == mid){
				 return -1;
			 }
             if(arr[mid] < value){
                 lower = mid;
             }
             else{
                 upper = mid;
             }
        }
		
        return mid;
     }
}
