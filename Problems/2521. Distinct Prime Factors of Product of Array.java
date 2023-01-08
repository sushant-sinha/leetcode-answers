class Solution {
    public int distinctPrimeFactors(int[] nums) {
        
        HashSet<Integer> factors=new HashSet<>();
        
        for(int x:nums){
            
            for(int i=1; i<= Math.sqrt(x); i++){
                if(x%i==0){
                    if(isPrime(i))
                    factors.add(i);
                    
                    if(isPrime(x/i))
                    factors.add(x/i);
                }
            }
            
        }
        
//         for(int i:factors)
//             System.out.println(i);
        
        return factors.size()-1;
        
    }
    
    boolean isPrime(int n){
        
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        
        return true;
        
    }
}