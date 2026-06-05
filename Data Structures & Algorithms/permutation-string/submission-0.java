class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        if(m>n){
            return false;
        }

        for(int i=0;i<=n-m;i++){
            String temp = s1;
            boolean ok = true;
            for(int j=0;j<m;j++){
                char c = s2.charAt(i+j);
                int idx = indexOfChar(temp, c);

                if(idx == -1){
                    ok = false;
                    break;
                }
                temp = temp.substring(0, idx)+temp.substring(idx+1);
            }
            if(ok){
                return true;
            }
        }
        return false;
    }

    private int indexOfChar(String s, char target){
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
}