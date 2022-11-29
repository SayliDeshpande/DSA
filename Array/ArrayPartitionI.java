import java.util.Arrays;
// leetcode problem L: https://leetcode.com/problems/array-partition/description/
public class ArrayPartitionI {
    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {

        final  int K = 10000;
        // Store the frequency of each element
        int[] elementToCount = new int[2 * K + 1];
        for (int element : nums) {
            // Add K to element to offset negative values
            elementToCount[element + K]++;
        }

        // Initialize sum to zero
        int maxSum = 0;
        boolean isEvenIndex = true;
        for (int element = 0; element <= 2 * K; element++) {
            while (elementToCount[element] > 0) {
                // Add element if it is at even position
                maxSum += (isEvenIndex ? element - K : 0);
                // Flip the value (one to zero or zero to one)
                isEvenIndex = !isEvenIndex;
                // Decrement the frequency count
                elementToCount[element]--;
            }
        }
        return maxSum;
    }
}
