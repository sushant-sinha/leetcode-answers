// SUSHANT SINHA

// 4ms ( 61.54% ) 39mb ( 98.69% )

class Solution {
    public int smallestValue(int n) {
        
        int oldVal=n;
        int newVal=sum(n);
        
        while(oldVal!=newVal){
            oldVal=newVal;
            newVal=sum(oldVal);
        }
        
        return newVal;
        
    }
    
    int sum(int n){
        
        ArrayList<Integer> prime_factors= primefactors(n);
        
        int sum=0;
        
        for(int i:prime_factors){
            
            sum+=i;
            
        }
        return sum;
    }
    
    ArrayList<Integer> primefactors(int n){
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int i=2; i<=n; i++){
            
            if(n%i==0){
                ans.add(i);
                n/=i;
                i=1;
            }
            
        }
        
        // System.out.println(ans);
        
        return ans;
        
    }
}

// can skip the sum function and directly return the sum of the prime factors

class Solution {
    public int smallestValue(int n) {
        
        int oldVal=n;
        int newVal=primeFactorsSum(n);
        
        while(oldVal!=newVal){
            oldVal=newVal;
            newVal=primeFactorsSum(oldVal);
        }
        
        return newVal;
        
    }
    
    int primeFactorsSum(int n){
        
        int sum=0;

        for(int i=2; i<=n; i++){
            
            if(n%i==0){
                sum+=i;
                n/=i;
                i=1;
            }
            
        }
        
        return sum;
        
    }
}