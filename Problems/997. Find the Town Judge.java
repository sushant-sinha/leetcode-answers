class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int count[]=new int[n+1];
        
        // calculating the net trust a person has
        // net trust means... the number of people trust him - number of people he trusts
        
        for(int i[]:trust){
            
            count[i[1]]++;
            count[i[0]]--;
            
        }
        
        for(int i=1;i<n+1;i++){
            
            if(count[i]==n-1)
                return i;
            
        }
        
        return -1;
        
    }
}