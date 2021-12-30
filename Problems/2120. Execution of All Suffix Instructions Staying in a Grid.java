class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        
        int ans[]=new int[s.length()];
        
        String inst;
        int pos[]=new int[2];
        
        for(int i=0;i<s.length();i++){
            
            inst=s.substring(i);
            //System.out.println(inst);
            
            // initializing position
            pos[0]=startPos[0]; pos[1]=startPos[1];
            
            for(char c:inst.toCharArray()){
                
                switch(c){
                        
                    case 'R':
                        pos[1]++;
                        break;
                        
                    case 'L':
                        pos[1]--;
                        break;
                    
                    case 'U':
                        pos[0]--;
                        break;
                        
                    case 'D':
                        pos[0]++;
                        break;
                        
                };
                
                //System.out.println(Arrays.toString(pos));
                
                
                if(pos[0]==n || pos[0]==-1 || pos[1]==n || pos[1]==-1){
                    break;
                }
                
                else
                    ans[i]++;
                
            }
            
        }
        
        return ans;
        
    }
}