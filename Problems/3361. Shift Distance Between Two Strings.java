// SUSHANT SINHA

// 42ms ( 81.42% ) 45.17MB ( 99.66% )

class Solution {
    public long shiftDistance(String s, String t, int[] nextCost, int[] previousCost) {

        // create a map for converting every character to every other character

        // must return long. Got wrong answer just because of this :')
        long ans=0;

        long[][] cost=new long[26][26];

        for(int i=0;i<26;i++){

            for(int j=0;j<26;j++){

                if(i==j){
                    cost[i][j]=0;
                    continue;
                }

                else{

                    long costFront=calculateCostFront(i, j, nextCost);
                    long costBack=calculateCostFront(j, i, previousCost);
                    costBack+=previousCost[i]-previousCost[j];

                    cost[i][j]=Math.min(costFront, costBack);
                }
            }
        }

        // for(long i[]: cost){
        //     System.out.println(Arrays.toString(i));
        // }

        for(int i=0;i<s.length();i++){

            // System.out.println("adding "+cost[s.charAt(i)-'a'][t.charAt(i)-'a']);
            ans+=cost[s.charAt(i)-'a'][t.charAt(i)-'a'];
        }

        // System.out.println("final answer="+ans);

        return ans;
        
    }

    long calculateCostFront(int start, int target, int[] cost){

        long sum=0;

        while(start!=target){
            sum+=cost[start];
            start++;
            start%=26;
        }

        return sum;
    }

    // long costBack(int start, int target, int[] cost){

    //     long sum=0;

    //     while(start!=target){
    //         sum+=cost[start];
    //         (++start)%26;
    //     }

    //     return sum;
    // }
}