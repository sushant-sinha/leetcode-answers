class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        HashSet<Integer> seen = new HashSet<>();
        
        seen.add(B[0]);
        seen.add(A[0]);
        
        if(A[0]==B[0]){
            A[0]=1;
        }
        else
            A[0]=0;
        
        for(int i=1;i<A.length;++i){
            
            // System.out.println("at i="+i+" set="+seen);
            
            int temp=A[i-1];
            
            if(A[i]==B[i]){
                A[i]=A[i-1]+1;
                seen.add(B[i]);
                continue;
            }
            
            if(seen.contains(A[i])){
                // System.out.println("inside 1");
                
                temp++;
                
                if(seen.contains(B[i])){
                    // System.out.println("inside 2");
                    temp++;
                }
            }
            
            if(seen.contains(B[i]) && !seen.contains(A[i])){
                // System.out.println("inside 3");
                temp++;
            }
            
            seen.add(A[i]);
            seen.add(B[i]);
            
            A[i]=temp;
            
        }
        
        return A;
        
    }
}