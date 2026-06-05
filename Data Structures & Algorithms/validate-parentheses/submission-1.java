


class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If opening, push
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // If closing, must match the top
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If anything left open, invalid
        return stack.isEmpty();
    }
}
