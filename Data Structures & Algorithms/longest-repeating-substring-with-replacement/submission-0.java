class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int maxFreq = 0;

            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'A';
                freq[idx]++;

                if (freq[idx] > maxFreq) {
                    maxFreq = freq[idx];
                }

                int len = j - i + 1;
                int replacements = len - maxFreq;

                if (replacements <= k) {
                    if (len > maxLen) maxLen = len;
                }
            }
        }
        return maxLen;
    }
}
