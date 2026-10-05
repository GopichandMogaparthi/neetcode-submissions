class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>();

        for(int num : nums){
            
            seen.add(num);
        }
        if(nums.length!=seen.size()){
            return true;
        }else{
            return false;
        }
    }
}