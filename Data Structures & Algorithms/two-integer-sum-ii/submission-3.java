class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*

        Given array of integers : numbers 
        It is sorted in non-decreasing order small to big

        return the indices of two number such that 
        sum is equal to target number : target

       Condition :  index1 < index2
        index1 and index 2 cannot be equal 

        Exactly one valid solution




        */
        int l =0, r = numbers.length-1;
        while(l<r){
            int curSum = numbers[l]+numbers[r];

            if(curSum>target){
                r--;
            }
            else if(curSum<target){
                l++;
            }else{
                return new int[]{l+1, r+1};
            }
        }
        return new int[0];
    }
}
