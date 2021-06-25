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

// 2ms ( 98.24% ) approach from 

class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        char[] balls = boxes.toCharArray();
        int left = balls[0] == '1' ? 1 : 0, right = 0;

        // this for loop sets ans[0] and the rightmost '1'
        for (int i = 1; i < n; i++) {
            if (balls[i] == '1') {
                right++;
                ans[0] += i;
            }
        }

        // this for loop is for all 1 to n elements
        for (int i = 1; i < n; i++) {

        	// ith position has the answer that of: the previous index value + number of '1' to its left - the number of the '1' to itsa right
        	// it is same as 1*left - 1*right as the number is being reduced by 1 for each right '1'(getting closer) and increased by 1 for each '1' to its left (getting farther)
            ans[i] = ans[i - 1] + left - right;

            // if at index i, there was a one , update the left to have one more '1' and right to have one less '1'
            if (balls[i] == '1') {
                left++;
                right--;
            }
        }
        return ans;
    }
}