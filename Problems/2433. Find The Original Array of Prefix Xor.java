// SUSHANT SINHA

// 2ms ( 77.37% ) 59.1mb ( 59.91% )

class Solution {
    public int[] findArray(int[] pref) {

        if(pref.length==0)
            return pref;

        int ans[]=new int[pref.length];

        for(int i=1;i<pref.length;i++){
            ans[i]=pref[i-1]^pref[i];
        }

        ans[0]=pref[0];

        return ans;
        
    }
}