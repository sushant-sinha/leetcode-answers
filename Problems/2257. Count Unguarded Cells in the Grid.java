class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {

        HashMap<Integer, HashSet<Integer>> wallHash=new HashMap<>();
        HashMap<Integer, HashSet<Integer>> guardHash=new HashMap<>();

        for(int i[]: walls){

            HashSet<Integer> temp;

            if(wallHash.containsKey(i[0])){

                temp=wallHash.get(i[0]);
                
            }

            else{
                temp=new HashSet<>();
                
            }

            temp.add(i[1]);
            wallHash.put(i[0], temp);
        }

        for(int i[]: guards){
            HashSet<Integer> temp;

            if(guardHash.containsKey(i[0])){

                temp=guardHash.get(i[0]);
                
            }

            else{
                temp=new HashSet<>();
                
            }

            temp.add(i[1]);
            guardHash.put(i[0], temp);
        }

        int[][] map=new int[m][n];

        int ans=m*n-guards.length-walls.length;

        // System.out.println(ans);

        

        for(int i[]: guards){

            // System.out.println("in for guard "+Arrays.toString(i));

            int negatingCounter=0;

            // check all four directions

            int curPos[]=new int[]{i[0], i[1]};

            // check north

            while(curPos[0]-1>=0){
                if(wallHash.containsKey(curPos[0]-1) && wallHash.get(curPos[0]-1).contains(curPos[1])){
                    // System.out.println("break1");
                    break;
                }

                if(guardHash.containsKey(curPos[0]-1) && guardHash.get(curPos[0]-1).contains(curPos[1])){
                    // System.out.println("break2");
                    break;
                }


                if(map[curPos[0]-1][curPos[1]]==0){
                    ans--;
                    negatingCounter++;
                    map[curPos[0]-1][curPos[1]]=1;
                }
                curPos[0]--;
            }
            
            curPos[0]=i[0];
            curPos[1]=i[1];

            // check south

            while(curPos[0]+1<m){
                if(wallHash.containsKey(curPos[0]+1) && wallHash.get(curPos[0]+1).contains(curPos[1])){
                    // System.out.println("break3");
                    break;
                }

                if(guardHash.containsKey(curPos[0]+1) && guardHash.get(curPos[0]+1).contains(curPos[1])){
                    // System.out.println("break4");
                    break;
                }
                
                if(map[curPos[0]+1][curPos[1]]==0){
                    ans--;
                    negatingCounter++;
                    map[curPos[0]+1][curPos[1]]=1;
                }

                curPos[0]++;
            }
            curPos[0]=i[0];
            curPos[1]=i[1];

            // check east

            while(curPos[1]-1>=0){

                if(wallHash.containsKey(curPos[0]) && wallHash.get(curPos[0]).contains(curPos[1]-1)){
                    // System.out.println("break5");
                    break;
                }

                if(guardHash.containsKey(curPos[0]) && guardHash.get(curPos[0]).contains(curPos[1]-1)){
                    // System.out.println("break6");
                    break;
                }

                if(map[curPos[0]][curPos[1]-1]==0){
                    ans--;
                    negatingCounter++;
                    map[curPos[0]][curPos[1]-1]=1;
                }
                curPos[1]--;
            }

            curPos[0]=i[0];
            curPos[1]=i[1];

            // check north

            while(curPos[1]+1<n){

                if(wallHash.containsKey(curPos[0]) && wallHash.get(curPos[0]).contains(curPos[1]+1)){
                    // System.out.println("break7");
                    break;
                }

                if(guardHash.containsKey(curPos[0]) && guardHash.get(curPos[0]).contains(curPos[1]+1)){
                    // System.out.println("break8");
                    break;
                }

                if(map[curPos[0]][curPos[1]+1]==0){
                    ans--;
                    negatingCounter++;
                    map[curPos[0]][curPos[1]+1]=1;
                }
                curPos[1]++;
            }

            // System.out.println("----------------- "+negatingCounter);
            
        }

        
        return ans;
        
    }
}