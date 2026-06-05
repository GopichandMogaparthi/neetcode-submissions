class Solution {
    public boolean hasDuplicate(int[] nums) {

        /*Given array nums 

        return true : if any value appears more than once

        otherwise : return false

        Initially what comes to my mind was take pairs of elements compare each

        element 

        If elements are matched say its true

        If not false

        It can be done using two for loops

        

        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
           
        }
         return false;
         */


    /*
    To optimize this problem i can do using hashset 
    which is more efficent way do that

    Set does not allow duplicates 

    we can check the sizes of array and set 
    if there is a difference in size there is an duplicate element was present

    else not
    
    */
    HashSet<Integer> seen = new HashSet<>();
    for(int num : nums){
        seen.add(num);

    }
    if(seen.size()!=nums.length){
        return true;
        }

        return false;
    } 
}