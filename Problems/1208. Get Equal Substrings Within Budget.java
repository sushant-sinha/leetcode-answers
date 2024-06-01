// SUSHANT SINHA

// 5ms ( 97.71% ) 43.21mb ( 31.10% )

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {

        int[] cost=new int[t.length()];

        for(int i=0;i<s.length();i++){
            cost[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }

        // System.out.println(Arrays.toString(cost));

        // sliding window (window between start and i of for loop)
        int ans=0, cur=0, start=0;

        for(int i=0;i<cost.length;i++){

            cur+=cost[i];
            
            // if addition of this element exceeds the maxCost
            if(cur>maxCost){
                // start removing elements from the beginning of the array
                while(cur>maxCost){
                    cur-=cost[start];
                    start++;

                    // when we hit the current element, that implies that the current element itself is causing the problem
                    // i.e. this element is having cost more than maxCost(ofc) and we have to remove this element too
                    // reset cost and start the window from start+1
                    if(start==i){
                        start++;
                        cur=0;
                        break;
                    }
                }
            }

            else{

                ans=Math.max(ans, i-start+1);

            }
        }


        return ans;
        
    }
}