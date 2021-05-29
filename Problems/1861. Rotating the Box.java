// SUSHANT SINHA

class Solution {
    public char[][] rotateTheBox(char[][] box) {
        
        for(int j=0;j<box.length;j++){
            for(int i=box[0].length-1;i>=0;i--){
                
                int next=i;
                if(box[j][i]=='#'){
                    next++;
                    while(next<=box[0].length-1 && box[j][next]=='.'){
                        next++;
                    }
                    
                    box[j][i]='.';
                    box[j][next-1]='#';
                        
                }

            }
        }
        
        char ans[][]=new char[box[0].length][box.length];
        
        for(int i=0;i<box.length;i++){
            for(int j=0;j<box[0].length;j++){
                ans[j][box.length-i-1]=box[i][j];
            }
        }
        
        return ans;
        
    }
}