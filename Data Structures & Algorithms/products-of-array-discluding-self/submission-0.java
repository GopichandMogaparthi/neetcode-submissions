class Solution {
    public int[] productExceptSelf(int[] nums) {

        /*Given an integer array nums
        return an array - ouput
        where output[i] is the product of all elements of nums excewpt nums[i]
        each product is guaranteed to fit in a 32-bit integer


        */

        //create an array with an output of length is same as given array

        int[] output = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            output[i] = 1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    output[i] = output[i]*nums[j];
                }
            }
        }

        return output;
        
    }
}  
