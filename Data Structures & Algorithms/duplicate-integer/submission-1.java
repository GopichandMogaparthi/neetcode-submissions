class Solution {
    public boolean hasDuplicate(int[] nums) {

        // nums
        // return true if any value appears more than once in the array 
        //otherwise return false

        /*for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
            
        }
        return false;
    }*/

  /* Set<Integer> set = new HashSet<>();


    for(int num : nums){
        if(set.contains(num)){
            return true;
        }
        set.add(num);
    }
return false;
*/

Set<Integer> set = new HashSet<>();

for(int num : nums){
    set.add(num);
}





    return nums.length!=set.size() ;


    //Time complexity is O(N)


    //Time complexoty O(n2)
}}