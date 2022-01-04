class Solution {
    public int numberOfBeams(String[] bank) {
        
        int ans=0, devices=0;
        
        for(char c:bank[0].toCharArray())
            if(c=='1')
                devices++;
        
        //System.out.println("0="+devices);
                
        
        for(int i=1;i<bank.length;i++){
            
            int tempCount=0;
            
            for(char c:bank[i].toCharArray()){
                
                if(c=='1')
                    tempCount++;
                
            }
            
            //System.out.println(i+" : tempCount="+tempCount+"  devices="+devices);
            
            if(tempCount!=0){
                
                ans+=tempCount*devices;
                devices=tempCount;
                
            }
            
            
        }
        
        return ans;
        
    }
}