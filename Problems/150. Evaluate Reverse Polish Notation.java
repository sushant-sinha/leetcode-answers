// SUSHANT SINHA

// 6ms ( 89.26% ) 42.2mb ( 85.13% )

/*

input: 10 6 9 3 + -11 * / * 17 + 5 +

[10,6,9,3]+
[10,6,12,-11]*
[10,6,-132]/
[10,0]*
[0,17]+
[17,5]+
[22]

*/

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack=new Stack<>();

        for(String s:tokens){

            if(s.charAt(s.length()-1)=='+'){
                int temp=stack.pop()+stack.pop();
                
                stack.push(temp);
            }

            else if(s.charAt(s.length()-1)=='-'){
                int temp1=stack.pop();
                // System.out.println("-"+temp);
                stack.push(stack.pop()-temp1);
            }

            else if(s.charAt(s.length()-1)=='/'){
                int temp1=stack.pop();
                // System.out.println("/"+temp);
                stack.push(stack.pop()/temp1);
            }

            else if(s.charAt(s.length()-1)=='*'){
                int temp=stack.pop()*stack.pop();
                // System.out.println("*"+temp);
                stack.push(temp);
            }

            else{
                stack.push(Integer.valueOf(s));
                // System.out.println(s);
            }

            // System.out.println("stack"+stack);
        }

        return (int)stack.pop();
        
    }
}