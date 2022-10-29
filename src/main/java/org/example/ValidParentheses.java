import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        Stack parentheses = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '(') || (s.charAt(i) == '{') || (s.charAt(i) == '[')) {
                parentheses.push(s.charAt(i));
            } else if (parentheses.isEmpty()) {
                return false;
            } else if (s.charAt(i) == ')') {
                if ((char) parentheses.peek() == '(') {
                    parentheses.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if ((char) parentheses.peek() == '[') {
                    parentheses.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if ((char) parentheses.peek() == '{') {
                    parentheses.pop();
                } else {
                    return false;
                }
            }
        }
        if (parentheses.isEmpty()) return true;
        else return false;
    }
}