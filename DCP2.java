/**
 * Given an array of integers, return a new array such that each element at index
 * i of the new array is the product of all the numbers in the original array except
 * the one at i.For example, if our input was [1, 2, 3, 4, 5], the expected output
 * would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output
 * would be [2, 3, 6].
 *
 * Solution: You multiply all the numbers by each other, then divide each number by its
 * original number, for instance in the example you would go 1*2*3*4*5 = 120, then
 * 120/1, 120/2, 120/3, 120/4, 120/5 so you would get the correct result
 * **/
/**
public class DCP2 {
	public static void main(String[] args) {
		int temp = 1;
		int[] arr = {1, 2, 3, 4, 5};
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i] * temp;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp / arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
**/

/**
 *
 * Follow-up: what if you can't use division?
 *
 * This one has a big similarity to hardware, as this is how a lot of low level machines divide
 * As dividing on small CPUs can be hardware heavy they instead continuously subtract until
 * you can't anymore, eventually returning your count as that is now your solution
 *
 */
  public class DCP2{
 	public static void main(String[] args){
		int temp = 1;
		int[] arr = {1, 2, 3, 4, 5};
		int i,j,count = 0;
 		for (i = 0; i < arr.length; i++) {
			temp = temp * arr[i];
		}

 		int sum = temp;
 		i = 0;
 		j = 0;
 		count = 0;

 		while(j < arr.length) {
 			if(sum == 0){
 				sum = temp;
 				arr[j] = count;
 				j++;
 				i++;
 				count = 0;
			}
 			else{
				sum = sum - arr[i];
 				count++;
			}
		}
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
 }
