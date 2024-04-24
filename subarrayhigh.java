//Declare an array with 10 elements. Get a subarray from an array between index 2 to 6 and find out the 2nd highest number from the sub array.
//
//	  Input: 2 4 5 3 6 7 9 4 5 6
//
//	 Output:
//
//	       Sub array: 5 3 6 7 9
//
//	       2nd Highest element:7
package basics.practice;


    import java.util.Arrays;

    public class subarrayhigh {
     public static void main(String[] args) {
            // Declare an array
            int[] arr = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};

            // Get the subarray from index 2 to 6
            //Create new array for     find subarray
            int[] subArray = new int[5];
            for (int i = 2; i <= 6; i++) {
                subArray[i - 2] = arr[i];
            }

            // Sort the subarray in descending order
            Arrays.sort(subArray);

            // Get the 2nd highest element
            int secondHighest = subArray[subArray.length - 2];

            System.out.println("Sub array: " + Arrays.toString(subArray));
            System.out.println("Second Highest element: " + secondHighest);
        }
    }
/*----------------------------------------------------------------------------------------------------------*/
//Second Approch
    public class secondApproach {

    public static void main(String[] args) {
        int A[] = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};
        int N = A.length;
        System.out.println("Length of Array :" + N);

        // printing subarray from index 2 to 6
        System.out.println("SubArray of the Array from index 2 to 6: ");
        for (int a = 2; a < 7; a++) {
            System.out.print(A[a] + " ");
        }
        System.out.println(" ");

        int max1 = Integer.MIN_VALUE;

        for (int i = 2; i < 7; i++) {
            if (A[i] > max1) {
                max1 = A[i];
            }
        }
        int max2 = Integer.MIN_VALUE;
        for (int i = 2; i < 7; i++) {
            if (A[i] != max1) {
                if (A[i] > max2) {
                    max2 = A[i];
                }
            }
        }
        System.out.println("max Element of array :" + max1);// max of Array
        System.out.println("Second max element of array from subarray: " + max2);// max of subarray
    }
}


