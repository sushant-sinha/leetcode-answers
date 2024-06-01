class Solution {
    public int equalSubstring(String s, String t, int maxCost) {

        int[] cost=new int[t.length()];

        for(int i=0;i<s.length();i++){
            cost[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }

        int ans=0, cur=0, start=0;

        for(int i=0;i<cost.length;i++){

            cur+=cost[i];
            
            if(cur>maxCost){
                while(cur>maxCost){
                    cur-=cost[start];
                    start++;
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