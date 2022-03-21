// SUSHANT SINHA

// 3ms ( 38.21% ) 41.2mb ( 45.90% )

class Solution {
    public boolean isHappy(int n) {
        
        int temp=0;
        
        ArrayList<Integer> alreadyVisited=new ArrayList<>();
        
        alreadyVisited.add(n);
        
        while(n!=1){
            
            temp=calcSum(n);
            
            if(alreadyVisited.contains(temp))
                return false;
            
            else
                alreadyVisited.add(temp);
            
            n=temp;
        }
        
        return true;
        
    }
    
    int calcSum(int n){
        
        int sum=0;
        
        while(n!=0){
            
            sum+=Math.pow(n%10,2);
            n/=10;
            
        }
        
        return sum;
    }
}