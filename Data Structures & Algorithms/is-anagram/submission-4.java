class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> chars1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> charst = new HashMap<Character, Integer>();

        for(int i = 0;i<s.length();i++){
            chars1.put(s.charAt(i), chars1.getOrDefault(s.charAt(i), 0) + 1);
            charst.put(t.charAt(i), charst.getOrDefault(t.charAt(i), 0) + 1);

        }
    return chars1.equals(charst);

    }
}
