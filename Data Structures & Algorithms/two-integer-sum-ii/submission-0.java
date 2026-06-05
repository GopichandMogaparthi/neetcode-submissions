class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*
            Given an array of integers
            Sorted in non-decreasing order
            return the indices of two numbers index 1, index2
            so they add up to a given target number target index1<index2
            There is a condition index1 and index 2 cannot be equal
            we should not use the element twice

            I will take length of arrayand store it in a variable n create 
            an array of size 2
            then after
            i will iterate the array for two loops then i will check the 
            index i index j is equal to target. 

            if it is equal return indices

            


        */

        int n = numbers.length;

        int answer[] = new int[2];

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(numbers[i]+numbers[j]==target){
                    answer[0]=i+1;
                    answer[1]=j+1;
                    return answer;
                }
            }
        }

        return answer;
        
    }
}