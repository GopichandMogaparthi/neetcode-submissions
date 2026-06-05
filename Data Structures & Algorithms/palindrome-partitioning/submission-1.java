class Solution {
    public List<List<String>> partition(String s) {

        //Declare result according to data type List<List<String>> 
        List<List<String>> result = new ArrayList<>();

        //Convert String to char array 
        char[] arr = s.toCharArray();

        //List to store temp list 
        List<String> temp = new ArrayList<>();

        //Start Building from zero
        solve(0,arr,temp,result);

        return result;
    }
    private void solve(int start, char[] arr, List<String> temp, List<List<String>> result){
        if(start==arr.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int end = start;end<arr.length;end++){
            if(isPalindrome(arr,start,end)){
                temp.add(new String(arr,start,end-start+1));

                solve(end+1, arr, temp, result);

                temp.remove(temp.size()-1);
            }
        }
    }

    private boolean isPalindrome(char[] arr, int left, int right){
        while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}