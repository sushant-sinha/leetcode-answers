// SUSHANT SINHA

// 7ms ( 74.14% ) 60.60mb ( 58.94% )

class Solution {

    ArrayList<int[]> coordinates=new ArrayList<>();
    int end[]=new int[2];
    boolean foundEnd=false;

    public int[][] findFarmland(int[][] land) {

        for(int i=0;i<land.length;i++){
            for(int j=0;j<land[0].length;j++){

                if(land[i][j]==1){
                    foundEnd=false;
                    traverse(land, i, j);
                    // System.out.println("in for "+i+" "+j+" end="+end[0]+" "+end[1]);
                    coordinates.add(new int[]{i,j,end[0],end[1]});
                }
            }
        }

        int ans[][]=new int[coordinates.size()][4];

        int index=0;

        for(int i[]: coordinates){
            ans[index++]=i;
        }

        return ans;
        
    }

    void traverse(int[][] map, int i, int j){

        map[i][j]=0;

        // System.out.println("in for "+i+" "+j);

        // corner
        if(i+1==map.length && j+1==map[0].length && !foundEnd){
            end[0]=i;
            end[1]=j;
            // System.out.println("exit "+i+" "+j+" "+foundEnd);
            foundEnd=true;
            return;
        }

        if(i+1==map.length && j+1<map[0].length && map[i][j+1]==0 && !foundEnd){
            end[0]=i;
            end[1]=j;
            // System.out.println("exit 1 "+i+" "+j+" "+foundEnd);
            foundEnd=true;
            return;
        }

        if(j+1==map[0].length && i+1<map.length && map[i+1][j]==0 && !foundEnd){
            end[0]=i;
            end[1]=j;
            // System.out.println("exit 2 "+i+" "+j+" "+foundEnd);
            foundEnd=true;
            return;
        }

        if(j+1<map[0].length && i+1<map.length && map[i+1][j]==0 && map[i][j+1]==0 && !foundEnd){
            end[0]=i;
            end[1]=j;
            // System.out.println("exit 3 "+i+" "+j+" "+foundEnd);
            foundEnd=true;
            return;
        }

        if(i+1<map.length && map[i+1][j]==1){
            traverse(map, i+1, j);
        }

        if(j+1<map[0].length && map[i][j+1]==1){
            traverse(map, i, j+1);
        }
    }
}