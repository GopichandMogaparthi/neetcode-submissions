class Solution {
    public int missingNumber(int[] nums) {

        /*

        * Let n be the length of an array
        * Initialize a variable res = n
        * For each index i from 0 to n-1 
            Add i to res
            Subtract nums[i] from res
        * After the loop res will hold the missing number
        * Return res as the answer

        */
        int res = nums.length;
        for(int i=0;i<nums.length;i++){
            res+=i-nums[i];
        }
        return res;
    }
}