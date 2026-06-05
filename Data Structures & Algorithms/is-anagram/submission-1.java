class Solution {
    public boolean isAnagram(String s, String t) {
        //i will check first whether two strings lengths are equal or not
        if(s.length()!=t.length()){
                return false;
        }
        // since in the constraint s and t ate lowercase english letters no need to worry about uppercase or special characterts

        int[] count = new int[26];

        //convert the string s to characterarray
        for(char c : s.toCharArray()){
            count[c-'a']++;
        }

        //convert the string t to characterarray

        for(char c : t.toCharArray()){
            count[c-'a']--;
        }
        for(int i=0;i<26;i++){
        if(count[i]!=0){
            return false;
        }
        }
        return true;
    }
}
