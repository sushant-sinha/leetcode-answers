// SUSHANT SINHA



class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(')');
            } else if(ch=='[') {
                stack.push(']');
            } else if(ch=='{') {
                stack.push('}');
            } else if(stack.isEmpty() || stack.pop()!=ch) {
              return false;  
            }
        } 
        return stack.isEmpty();
    }
}
