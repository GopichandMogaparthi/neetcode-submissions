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

        */

        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
           
        }
         return false;
    } 
}