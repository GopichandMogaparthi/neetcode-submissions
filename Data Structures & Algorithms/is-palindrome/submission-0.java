class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] reverse = new char[s.length()];

        int index =0;

        for(int i=s.length()-1; i>=0;i--){
            reverse[index]=s.charAt(i);
            index++;
        }
for (int i = 0; i < s.length(); i++){
        if(s.charAt(i)!=reverse[i]){
            return false;
        }
}
        return true;
    }
}
