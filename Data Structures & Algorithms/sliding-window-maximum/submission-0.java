class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        /*
        Given array nums and an integer k
        Sliding window of size 3 - starts at the left edge of the array
        Window slides one position to the right until it reaches the right edge of
        the array

        Return a list that contains the mazimum element in the window at each step

        Brute force approach

        Algorithm

        I will take an array output of size n-k+1 which will give me exact output

        I will iterate the array and the window find the maximum and assign to the output

        Return output


        */
        int n = nums.length;
        int[] output = new int[n-k+1];

        for(int i =0;i<=n-k;i++){
                int maxi = nums[i];
                for(int j=i;j<i+k;j++){
                    maxi = Math.max(maxi, nums[j]);
                }
                output[i] = maxi;
        }
        return output;
    }
}
