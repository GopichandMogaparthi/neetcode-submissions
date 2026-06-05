class Solution {
    public int[] productExceptSelf(int[] nums) {

        /*Given an integer array nums
        return an array - ouput
        where output[i] is the product of all elements of nums excewpt nums[i]
        each product is guaranteed to fit in a 32-bit integer


        

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
        */

        int n = nums.length;
        int[] output = new int[n];

        //Step 1 : Left Products

        output[0] =1;
        for(int i=1;i<n;i++){
            output[i] = output[i-1]*nums[i-1];
        }

        //Step 2 : Right products

        int right_Product =1;
        for(int i =n-1;i>=0;i--){
            output[i]*=right_Product;
            right_Product*=nums[i];
        }
        return output;
        
    }
}  
