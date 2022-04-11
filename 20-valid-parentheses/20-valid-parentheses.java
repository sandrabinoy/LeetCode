import java.util.*;

class Solution {
    public boolean isValid(String s) {
        
        boolean isValid = true;
        Stack<Character> stack = new Stack<Character>();
        char charVal = ' ';

        for(int i = 0; i < s.length(); i++) {
            charVal = s.charAt(i);
            if(charVal == '(' || charVal == '[' || charVal == '{') {
                stack.push(s.charAt(i));
            }
            else if(charVal == ')' || charVal == '}' || charVal == ']') {
                if(stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                switch (charVal)
                {
                    case ')': {
                        if (stack.peek() == '(') {
                            stack.pop();
                            isValid = true;
                        } else {
                            isValid = false;
                        }
                        break;
                    }
                    case '}': {
                        if (stack.peek() == '{') {
                            stack.pop();
                            isValid = true;
                        } else {
                            isValid = false;
                        }
                        break;
                    }
                    case ']': {
                        if (stack.peek() == '[') {
                            stack.pop();
                            isValid = true;
                        } else {
                            isValid = false;
                        }
                        break;
                    }
                }
            }
            if(isValid == false) {
                return isValid;
            }
        }

        if(!stack.isEmpty()) {
            isValid = false;
        }

        return isValid;

    }
}