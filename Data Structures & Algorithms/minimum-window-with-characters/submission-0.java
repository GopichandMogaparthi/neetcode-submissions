class Solution {
    public String minWindow(String s, String t) {

        //If t is empty, return an empty string

        if(t.isEmpty()) return "";

        //Build a frequency map countT for all characters in t

        Map<Character, Integer> countT = new HashMap<>();
        for(char c: t.toCharArray()){
            countT.put(c,countT.getOrDefault(c,0)+1);
        }

        /*
        Initialize:
        res = [-1, -1] to store the best window,
        resLen = infinity to store the smallest length found.
        */

        int[] res = {-1,-1};
        int resLen = Integer.MAX_VALUE;

        /*

        For each starting index i in s:
Create an empty frequency map countS.
For each ending index j from i to the end of s:
Add s[j] to countS.
Check if the current substring from i to j contains all characters in t:
For each character c in countT, ensure countS[c] is at least countT[c].
If it satisfies all requirements and is smaller than the current best, update res and resLen.


        */

        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> countS = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                countS.put(s.charAt(j), countS.getOrDefault(s.charAt(j), 0) + 1);

                boolean flag = true;
                for (char c : countT.keySet()) {
                    if (countS.getOrDefault(c, 0) < countT.get(c)) {
                        flag = false;
                        break;
                    }
                }

                if (flag && (j - i + 1) < resLen) {
                    resLen = j - i + 1;
                    res[0] = i;
                    res[1] = j;
                }
            }
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}