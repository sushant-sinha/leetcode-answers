// SUSHANT SINHA

// 152ms ( 38.41% ) 39.5mb ( 71.27% )

class Solution {
    public int[] minOperations(String boxes) {
        
        int ans[]=new int[boxes.length()];
        char ar[]=boxes.toCharArray();

        for(int i=0;i<ans.length;i++){
        	ans[i]=count(ar,i);
        }

        return ans;
        
    }

    int count(char ar[] , int index){

    	int c=0,i=0;

    	for(;i<ar.length && i!=index;i++){
    		c+= ar[i]=='1' ? (index-i) : 0;
    	}

    	i++;

    	for(;i<ar.length;i++){
    		c+= ar[i]=='1' ? (i-index) : 0;
    	}

    	return c;
    }
}