class Solution {
    public int evalRPN(String[] tokens) {
        
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }

        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < tokens.length; i++) {

            String curr = tokens[i];
            if (curr.equals("+") || curr.equals("-") || curr.equals("*") || curr.equals("/")) {
                if (stack.isEmpty() || stack.size() == 1) {
                    return 0;
                }
                int b = stack.pop();
                int a = stack.pop();
                if (curr.equals("+")) {
                    result = a+b;
                } else if (curr.equals("-")) {
                    result = a-b;
                } else if (curr.equals("*")) {
                    result = a*b;
                } else {
                    result = a/b;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(curr));
            }
        }
            
        return stack.pop(); 
        
    }
}



/**
["4","13","5","/","+"]
Stack -> 6
1. 
r = 0
curr = "4"

2. 
r = 0
curr = "13"

3.
r = 0
curr = "5"

4.
r = 0
curr = "/"
b = 5, a = 13
result = a / b = 13/5 = 2

5.
result = 2
curr = "+"
b = 2, a = 4
result = a + b = 4 + 2 = 6

*/