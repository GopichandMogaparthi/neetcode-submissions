class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet seen = new HashSet<>();
        for(int n : nums){
            seen.add(n);
        }
        if(nums.length==seen.size()){
            return false;
        }
        return true;
    }
}