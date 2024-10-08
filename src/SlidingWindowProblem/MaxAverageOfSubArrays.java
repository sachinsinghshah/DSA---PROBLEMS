package SlidingWindowProblem;

public class MaxAverageOfSubArrays {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0;
        int sum = 0;
        double maxAverage = Integer.MIN_VALUE;
        for (int end = 0 ; end < nums.length; end++){
            sum += nums[end];
            if(end >= k-1){
                double average = (double) sum / k;
                maxAverage = Math.max(maxAverage, average);
                sum -= nums[start];
                start++; 
            }
        }
        return maxAverage;
    }
}