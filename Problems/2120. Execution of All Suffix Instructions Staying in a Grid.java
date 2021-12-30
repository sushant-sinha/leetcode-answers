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


// inconsistent runtime ... don't know why ¯\_(ツ)_/¯
// 26ms ( 84.48% ) 39.3mb ( 90.74% )

class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        
        int ans[]=new int[s.length()];
        
        for(int i=0;i<s.length();i++){
            
            int x=startPos[0]; int y=startPos[1];
            
            for(int j=i;j<s.length();j++){
                
                switch(s.charAt(j)){
                        
                    case 'R':
                        y++;
                        break;
                        
                    case 'L':
                        y--;
                        break;
                    
                    case 'U':
                        x--;
                        break;
                        
                    case 'D':
                        x++;
                        break;
                        
                };
                
                //System.out.println(Arrays.toString(pos));
                
                
                if(x==n || x==-1 || y==n || y==-1){
                    break;
                }
                
                else
                    ans[i]++;
                
            }
            
        }
        
        return ans;
        
    }
}