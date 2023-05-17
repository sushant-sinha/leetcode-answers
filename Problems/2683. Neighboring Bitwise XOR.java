class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        
        // simulating the given question
        
        if(derived.length==1)
            if(derived[0]==1)
                return false;
            else
                return true;
        
        int temp[]=new int[derived.length];
        temp[0]=0;
        
        for(int i=0;i<derived.length-1;i++){
            
            if(derived[i]==0 && temp[i]==0){
                temp[i+1]=0;
            }
            
            else if(derived[i]==0 && temp[i]==1){
                temp[i+1]=1;
            }
            
            else if(derived[i]==1 && temp[i]==0){
                temp[i+1]=1;
            }
            
            else if(derived[i]==1 && temp[i]==1){
                temp[i+1]=0;
            }
            
        }
        
        if((temp[0]^temp[derived.length-1])==derived[derived.length-1])
            return true;
        
        temp[0]=1;
        
        for(int i=0;i<derived.length-1;i++){
            
            if(derived[i]==0 && temp[i]==0){
                temp[i+1]=0;
            }
            
            else if(derived[i]==0 && temp[i]==1){
                temp[i+1]=1;
            }
            
            else if(derived[i]==1 && temp[i]==0){
                temp[i+1]=1;
            }
            
            else if(derived[i]==1 && temp[i]==1){
                temp[i+1]=0;
            }
            
        }
        
        if((temp[0]^temp[derived.length-1])==derived[derived.length-1])
            return true;
        
        return false;
        
    }
}