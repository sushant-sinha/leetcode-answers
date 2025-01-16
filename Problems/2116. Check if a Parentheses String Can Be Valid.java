
class Solution {
    public boolean canBeValid(String s, String locked) {

        Stack<int[]> braces=new Stack<>();

        int len=s.length();

        if(len%2==1)
            return false;

        for(int i=0;i<len;i++){

            int lockStatus=Character.getNumericValue(locked.charAt(i));
            char c=s.charAt(i);

            if(braces.empty()){
                braces.push(new int[]{c=='(' ? 0 : 1, lockStatus});
                continue;
            }

            // if it is not empty, check for the
            // hold until you don't find a fixed closing bracket before resolving

            if(lockStatus==1){
                // System.out.println("in stack for index = "+i);
                // try to resolve this
                if(c=='(')
                    braces.push(new int[]{0, lockStatus});

                else{
                    int prev[]=braces.peek();
                    // System.out.println("peeked val="+Arrays.toString(prev));
                    if(prev[1]==0 || prev[0]==0)
                        braces.pop();
                    
                    else
                        return false;
                    
                }
            }

            else
                braces.push(new int[]{c=='(' ? 0 : 1, lockStatus});
        }

        // while(!braces.empty()){
        //     System.out.println(Arrays.toString(braces.pop()));
        // }

        while(!braces.empty()){

            int[] cur=braces.pop();
            int[] prev=braces.pop();

            // System.out.println("comparing "+Arrays.toString(cur)+ " "+Arrays.toString(prev));

            if(cur[0]==1){
                if(prev[0]==0 || prev[1]==0)
                    continue;
                
                else
                    return false;
            }

            if(cur[0]==0){

                if(cur[1]==1)
                    return false;

                if(prev[0]==0 || prev[1]==0)
                    continue;
                
                else
                    return false;
            }

        }

        return braces.empty();
        
    }
}