// SUSHANT SINHA

// 180ms ( 5.17% ) 80.42mb ( 6.02% )

class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {

        HashMap<Integer, HashSet<Integer>> wallHash=new HashMap<>();
        HashMap<Integer, HashSet<Integer>> guardHash=new HashMap<>();

        // convert array to map for faster search
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

            // made this variable for debugging, not needed for solution
            // int negatingCounter=0;

            // check all four directions

            int x=i[0], y=i[1];

            // check north

            while(x-1>=0){
                if(wallHash.containsKey(x-1) && wallHash.get(x-1).contains(y)){
                    // System.out.println("break1");
                    break;
                }

                if(guardHash.containsKey(x-1) && guardHash.get(x-1).contains(y)){
                    // System.out.println("break2");
                    break;
                }


                if(map[x-1][y]==0){
                    ans--;
                    // negatingCounter++;
                    map[x-1][y]=1;
                }
                x--;
            }
            
            x=i[0];
            y=i[1];

            // check south

            while(x+1<m){
                if(wallHash.containsKey(x+1) && wallHash.get(x+1).contains(y)){
                    // System.out.println("break3");
                    break;
                }

                if(guardHash.containsKey(x+1) && guardHash.get(x+1).contains(y)){
                    // System.out.println("break4");
                    break;
                }
                
                if(map[x+1][y]==0){
                    ans--;
                    // negatingCounter++;
                    map[x+1][y]=1;
                }

                x++;
            }

            x=i[0];
            y=i[1];

            // check east

            while(y-1>=0){

                if(wallHash.containsKey(x) && wallHash.get(x).contains(y-1)){
                    // System.out.println("break5");
                    break;
                }

                if(guardHash.containsKey(x) && guardHash.get(x).contains(y-1)){
                    // System.out.println("break6");
                    break;
                }

                if(map[x][y-1]==0){
                    ans--;
                    // negatingCounter++;
                    map[x][y-1]=1;
                }
                y--;
            }

            x=i[0];
            y=i[1];

            // check west

            while(y+1<n){

                if(wallHash.containsKey(x) && wallHash.get(x).contains(y+1)){
                    // System.out.println("break7");
                    break;
                }

                if(guardHash.containsKey(x) && guardHash.get(x).contains(y+1)){
                    // System.out.println("break8");
                    break;
                }

                if(map[x][y+1]==0){
                    ans--;
                    // negatingCounter++;
                    map[x][y+1]=1;
                }
                y++;
            }

            // System.out.println("----------------- "+negatingCounter);
            
        }

        
        return ans;
        
    }
}