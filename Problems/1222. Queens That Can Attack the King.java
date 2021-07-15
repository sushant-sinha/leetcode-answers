// SUSHANT SINHA

// 1ms ( 78.48% ) 38.9mb ( 91.71% )

class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        
        List<List<Integer>> ans= new ArrayList<>();
        
        int k1=king[0];
        int k2=king[1];
        
        int x=-1,y=-1;
        
        boolean f=false;
        
        //horizontal right
        
        while(++k2<8){
            for(int pos[]:queens){
                if(pos[1]==k2 && pos[0]==k1){
                    x=pos[0];
                    y=(pos[1]);
                    f=true;
                    break;
                }
            }
            if(f)
                break;
        }     
        
        if(x!=-1){
        ans.add(new ArrayList<Integer>(Arrays.asList(x,y)));
        }
        
        
        k1=king[0];
        k2=king[1];
        
        x=-1;y=-1;
        f=false;
        
        //horizontal left
        
        while(--k2>=0){
            for(int pos[]:queens){
                if(pos[1]==k2 && pos[0]==k1){
                    x=pos[0];
                    y=(pos[1]);
                    f=true;
                    break;
                }
            }
            if(f)
                break;
        }     
        
        if(x!=-1){
        ans.add(new ArrayList<Integer>(Arrays.asList(x,y)));
        }
        
        // vertical top
        
        k1=king[0];
        k2=king[1];
        
        x=-1;y=-1;
        f=false;
                
        while(--k1>=0){
            for(int pos[]:queens){
                if(pos[1]==k2 && pos[0]==k1){
                    x=pos[0];
                    y=(pos[1]);
                    f=true;
                    break;
                }
            }
            if(f)
                break;
        }     
        
        if(x!=-1){
        ans.add(new ArrayList<Integer>(Arrays.asList(x,y)));
        }
        
        // vertical bottom
        
        k1=king[0];
        k2=king[1];
        
        x=-1;y=-1;
        f=false;
                
        while(++k1<8){
            for(int pos[]:queens){
                if(pos[1]==k2 && pos[0]==k1){
                    x=pos[0];
                    y=(pos[1]);
                    f=true;
                    break;
                }
            }
            if(f)
                break;
        }     
        
        if(x!=-1){
        ans.add(new ArrayList<Integer>(Arrays.asList(x,y)));
        }
        
        
        //left top diagonal
                
        k1=king[0];
        k2=king[1];
        
        x=-1;y=-1;
        f=false;
                
        while(--k1>=0 && --k2>=0){
            for(int pos[]:queens){
                if(pos[1]==k2 && pos[0]==k1){
                    x=pos[0];
                    y=(pos[1]);
                    f=true;
                    break;
                }
            }
            if(f)
                break;
        }     
        
        if(x!=-1){
        ans.add(new ArrayList<Integer>(Arrays.asList(x,y)));
        }
        
        //right top diagonal
                
        k1=king[0];
        k2=king[1];
        
        x=-1;y=-1;
        f=false;
                
        while(--k1>=0 && ++k2<8){
            for(int pos[]:queens){
                if(pos[1]==k2 && pos[0]==k1){
                    x=pos[0];
                    y=(pos[1]);
                    f=true;
                    break;
                }
            }
            if(f)
                break;
        }     
        
        if(x!=-1){
        ans.add(new ArrayList<Integer>(Arrays.asList(x,y)));
        }
        
        
        //left bottom diagonal
                
        k1=king[0];
        k2=king[1];
        
        x=-1;y=-1;
        f=false;
                
        while(++k1<8 && --k2>=0){
            for(int pos[]:queens){
                if(pos[1]==k2 && pos[0]==k1){
                    x=pos[0];
                    y=(pos[1]);
                    f=true;
                    break;
                }
            }
            if(f)
                break;
        }     
        
        if(x!=-1){
        ans.add(new ArrayList<Integer>(Arrays.asList(x,y)));
        }
        
        //right bottom diagonal
                
        k1=king[0];
        k2=king[1];
        
        x=-1;y=-1;
        f=false;
                
        while(++k1<8 && ++k2<8){
            for(int pos[]:queens){
                if(pos[1]==k2 && pos[0]==k1){
                    x=pos[0];
                    y=(pos[1]);
                    f=true;
                    break;
                }
            }
            if(f)
                break;
        }     
        
        if(x!=-1){
        ans.add(new ArrayList<Integer>(Arrays.asList(x,y)));
        }
        
        return ans;
    }
}