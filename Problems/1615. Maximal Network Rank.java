class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {

        int count[]=new int[n];

        // hashing the presence of roads between two cities
        int isHavingRoad[][]=new int[n][n];

        // counting the number of roads from each city
        for(int i[]:roads){
            count[i[0]]++;
            count[i[1]]++;

            // using Arrays.sort(i) because: isHavingRoad[0][1] and isHavingRoad[1][0] are different

            // because the for loop for getting the ans is starting from 0.
            // so the for loop's if condition will check for [0,1] and will never check for [1,0] pair
            // we'll sort i so that the isHavingRoad hash will update for [1,0] input (in roads array) as [0,1]
            // thus the isHavingRoad[0][1] will be flagged instead of isHavingRoad[1][0]
            Arrays.sort(i);
            isHavingRoad[i[0]][i[1]]++;
        }

        int ans=-1;

        // checking all the possible pairs of cities
        for(int i=0; i<n-1; i++){

            for(int j=i+1; j<n; j++){
            
                if(isHavingRoad[i][j]==1){
                    // System.out.println("set contains "+i+" "+j);
                    ans=Math.max(ans, count[i]+count[j]-1);
                }

                else{
                    ans=Math.max(ans, count[i]+count[j]);
                }
            }

        }

        return ans;
        
    }
}