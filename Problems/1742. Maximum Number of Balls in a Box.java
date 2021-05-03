// SUSHANT SINHA

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        
        int index[]=new int[54];
        
        while(lowLimit<=highLimit){
            index[sum(lowLimit)]++;
            lowLimit++;
        }
        
        Arrays.sort(index);
        
        return index[53];
        
    }
    
    int sum(int n){
        
        int ans=0;
        
        while(n!=0){
            ans+=n%10;
            n/=10;
        }
        
        return ans;
        
    }
}