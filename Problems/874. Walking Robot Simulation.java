class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {

        HashSet<String> obstacleSet=new HashSet<>();

        for(int i[]: obstacles)
            obstacleSet.add(i[0]+" "+i[1]);

        int[][] moves=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};

        // dir: 0=North, 2=West, 4=South, 6=East. Rollover from East, if you get turn left from North, set it to East.
        // if you get turn right, perform +2. when you get turn right from West, rollover to north
        int maxDist=0, curPosX=0, curPosY=0, dir=0;

        for(int com: commands){

            // System.out.println("move: "+com);


            // if(obstacleSet.contains(curPosX+" "+curPosY))
            //     continue;

            if(com==-1){
                if(dir==6)
                    dir=0;
                else
                    dir+=2;
                continue;
            }

            else if(com==-2){
                if(dir==0)
                    dir=6;
                else
                    dir-=2;
                    continue;
            }

            // System.out.println("cur dir= "+dir);

            {

                for(int i=0;i<com;i++){

                    curPosX+=moves[dir/2][0];
                    curPosY+=moves[dir/2][1];
                    
            // System.out.println("cur pos= "+curPosX+" "+curPosY);
                    if(obstacleSet.contains(curPosX+" "+curPosY)){
                        curPosX-=moves[dir/2][0];
                        curPosY-=moves[dir/2][1];
                        break;
                    }

                    maxDist=Math.max(maxDist, curPosX*curPosX+curPosY*curPosY);
                }
            }

        }

        return maxDist;
        
    }
}