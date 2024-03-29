class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(char ch : s.toCharArray()){
            switch(ch){        
            case ')': if(stack.empty() || stack.pop()!= '(') return false; break;
            case ']': if(stack.empty() || stack.pop()!= '[') return false; break;
            case '}': if(stack.empty() || stack.pop()!= '{') return false; break;
            default: stack.push(ch);
            }
        }
        
        return stack.empty();
    }
}