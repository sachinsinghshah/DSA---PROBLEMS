import java.util.Arrays;

public class AveragesOfSubarrays {

    public static double[] findAveragesOfSubarrays(int[] arr, int k) {
        //sliding window approach
        double[] results = new double[(arr.length - k) + 1];
        int windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            //add the next element
            windowSum += arr[windowEnd];

            //slide the window forward
            //we don't need to slide if we have not hit the required window size of k
            if (windowEnd >= k - 1) {
                //we are **AUTOMATICALLY** returning the window average once we hit the window size of k
                //and pushing to the output array
                results[(windowEnd - k) + 1] = (double) windowSum / k;

                //subtracting the element going out
                windowSum -= arr[windowStart];

                //then sliding the window forward
                windowStart++;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        double[] averages = findAveragesOfSubarrays(arr, k);
        System.out.println(Arrays.toString(averages)); // [2.2, 2.8, 2.4, 3.6, 2.8]
    }
}