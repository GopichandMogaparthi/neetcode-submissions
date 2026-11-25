class Solution {
    public int maxFrequency(int[] nums, int k) {

        int countK = 0;
        for(int num : nums){
            if(num==k){
                countK++;
            }
        }
        int result=0;

        for(int i=1;i<=50;i++){
            if(i==k){
                continue;
            }
            int count =0;
            for(int num:nums){
                if(num==i) count++;
                if(num==k) count--;
                count = Math.max(count,0);
                result = Math.max(result, countK+count);
            }
        }
        return result;
    }
}