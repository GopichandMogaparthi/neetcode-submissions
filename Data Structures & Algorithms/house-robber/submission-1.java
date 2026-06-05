class Solution {
    public int rob(int[] nums) {

        /*
        Given an integer array nums where nums[i] represents the amount of money the ith house

        Houses are arranged in a straight line. The ith house is the neighnbor of the i-1 and i+1 house

        Rob houses you cannot rob two adajacent houses Security system will automatically alert the police

        Take result and add number which are not adjacent \
        and find the maximum and repeat the same thing

        */
if(nums.length==0){
    return 0;
}
if(nums.length==1){
    return nums[0];
}
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
     
     for(int i=2;i<nums.length;i++){
        dp[i] = Math.max(dp[i-1],nums[i]+dp[i-2]);
     }
        return dp[nums.length-1];
    }

 }
