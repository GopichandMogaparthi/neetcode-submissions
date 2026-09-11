class Solution {
    public int lengthOfLongestSubstring(String s) {

        /*
        The brute force idea is to try starting a substring at every index and keep extending it unitl we see a repeated character. 
        For each starting point, we use a set to track the characters we've seen so far.

    As soon as a duplicate appears, that substring can't grow anymore, so we stop and record its length. 

    By doing this for every index, we are guranteed to find the longest valid substring, thoough the approach is slow.


        */

        int res = 0;
        for(int i = 0;i<s.length();i++){
            Set<Character> charSet = new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(charSet.contains(s.charAt(j))){
                    break;
                }
                charSet.add(s.charAt(j));
            }
            res = Math.max(res, charSet.size());
        }
        return res;
    }
}
