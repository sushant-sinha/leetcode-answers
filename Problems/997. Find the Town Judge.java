// SUSHANT SINHA

// 3ms ( 81.43% ) 46.5mb ( 74.25% )

class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int count[]=new int[n+1];
        
        // calculating the net trust a person has
        // net trust means... the number of people trust him - number of people he trusts
        
        for(int i[]:trust){
            
            count[i[1]]++;
            count[i[0]]--;
            
        }

        // if a person has net trust == n-1 (because he trusts no one.. including himself)
        // this is only possible when... everybody else trusts him and he trusts no one -> judge
        
        for(int i=1;i<n+1;i++){
            
            if(count[i]==n-1)
                return i;
            
        }
        
        return -1;
        
    }
}