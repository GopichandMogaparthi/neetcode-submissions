class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int maxLen =0;
        for(int i=0;i<n;i++){
            int[] hash = new int[256];
            int len =0;
            for(int j=i;j<n;j++){
                char c = s.charAt(j);
                if(hash[c]==1){
                    break;
                }
                hash[c]=1;
                len++;

                if(len>maxLen){
                    maxLen=len;
                }
            }
        }
        return maxLen;
    }
}
