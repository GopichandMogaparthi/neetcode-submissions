class Solution {
    public List<List<String>> partition(String s) {

        // declare result according to data type list<list<string>>
        List<List<String>> result = new ArrayList<>();

        // convert the string into char array
        char[] arr = s.toCharArray();

        // temp list to store current partition
        List<String> temp = new ArrayList<>();

        // start building from index 0
        solve(0, arr, temp, result);

        return result;
    }

    private void solve(int start, char[] arr, List<String> temp, List<List<String>> result) {

        // if we reached end -> one partition ready
        if (start == arr.length) {
            result.add(new ArrayList<>(temp)); // copy
            return;
        }

        // try combination of 1 character, then 2, then 3, ...
        for (int end = start; end < arr.length; end++) {

            // check palindrome for substring arr[start..end]
            if (isPalindrome(arr, start, end)) {

                // if palindrome add it to temp list
                temp.add(new String(arr, start, end - start + 1));

                // move forward to build rest of partitions
                solve(end + 1, arr, temp, result);

                // backtrack: remove last added substring
                temp.remove(temp.size() - 1);
            }
        }
    }

    // Palindrome means reverse should be same
    private boolean isPalindrome(char[] arr, int left, int right) {
        while (left < right) {
            if (arr[left] != arr[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}