class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;

        int best =0;

        for(int i=0;i<n;i++){
            int x = nums[i];
            int count =1;
            while(contains(nums, x+count)){
                count++;
            }
            best = Math.max(best, count);
        }
        return best;
    }
    private boolean contains(int nums[], int target){
        for(int v : nums){
            if(v==target){
                return true;
            }
        }
        return false;
    }

}
