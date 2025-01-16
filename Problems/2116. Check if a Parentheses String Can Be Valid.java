// SUSHANT SINHA

// referred editorial

class Solution {
    public boolean canBeValid(String s, String locked) {

        int len=s.length();

        if(len%2==1)
            return false;

        Stack<Integer> open=new Stack<>();
        Stack<Integer> free=new Stack<>();

        for(int i=0;i<len;i++){

            // System.out.println("testing index "+i);

            if(locked.charAt(i)=='0')
                free.push(i);
            
            else if(s.charAt(i)=='(')
                open.push(i);

            // this is a closed and locked bracket
            else{

                if(!open.empty())
                    open.pop();

                else if(!free.empty())
                    free.pop();

                else
                    return false;

            }
        }

        // System.out.println(open+" "+free);

        while(!open.empty()){

            // ran out of unlocked spots
            if(free.empty())
                return false;
            
            int freePos=free.pop();
            int openPos=open.pop();

            if(freePos>openPos)
                continue;
            
            else
                return false;
        }

        // we don't care about the unmatched unlocked brackets
        // I trust that they'll be matched by themselves
        return open.empty();
        
    }
}