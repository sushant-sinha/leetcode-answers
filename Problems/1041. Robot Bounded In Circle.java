// https://leetcode.com/problems/robot-bounded-in-circle/discuss/1676745/Python3-LINEAR-()-Explained

class Solution {
    public boolean isRobotBounded(String instructions) {
        
        int direction[][]=new int[][]{
            {0,1},
            {1,0},
            {0,-1},
            {-1,0}
        };
        
        int curPos[]=new int[]{0,0};
        int curDir=0;
        
        for(char c: instructions.toCharArray()){
            
            if(c=='G'){
                
                curPos[0]+=direction[curDir][0];
                curPos[1]+=direction[curDir][1];
                
            }
            
            else if(c=='L')
                curDir=(curDir+3)%4;
            
            else
                curDir=(curDir+1)%4;
            
        }
        
        if((curPos[0]==0 && curPos[1]==0) || curDir!=0)
            return true;
        
        else
            return false;
        
    }
}