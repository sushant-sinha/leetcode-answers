// SUSHANT SINHA

 
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int ksplit[]=new int[String.valueOf(K).length()];
        int i=0;
        while(K!=0){
            ksplit[i]=K%10;
            K/=10;
            i++;
        }
        
        
        int carry=0,kpointer=0;
        if(A.length>=ksplit.length){
        for(i=A.length-1;i>=0;i--){
            
            if(kpointer<ksplit.length){
                if(A[i]+ksplit[kpointer]+carry<10){
                    ans.add(A[i]+ksplit[kpointer]+carry);
                    carry=0;
                }
                
                else{
                    ans.add((A[i]+ksplit[kpointer]+carry)%10);
                    carry=1;
                }
                kpointer++;
            }
            
            else{
                
                if(A[i]+carry<10){
                    ans.add(A[i]+carry);
                    carry=0;
                }
                
                else{
                    ans.add((A[i]+carry)%10);
                    carry=1;
                }
                
            }
            
            
        }
        }
        
        
        
        else{
            kpointer=A.length-1;
            for(i=0;i<ksplit.length;i++){
            
            if(kpointer>=0){
                if(ksplit[i]+A[kpointer]+carry<10){
                    ans.add(ksplit[i]+A[kpointer]+carry);
                    carry=0;
                }
                
                else{
                    ans.add((ksplit[i]+A[kpointer]+carry)%10);
                    carry=1;
                }
                kpointer--;
            }
            
            else{
                
                if(ksplit[i]+carry<10){
                    ans.add(ksplit[i]+carry);
                    carry=0;
                }
                
                else{
                    ans.add((ksplit[i]+carry)%10);
                    carry=1;
                }
                
            }
            
            
        }
        }
        
        if(carry==1)ans.add(1);
        Collections.reverse(ans);
        
        return ans;
        
    }
}