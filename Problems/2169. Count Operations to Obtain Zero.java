class Solution {
    public int countOperations(int num1, int num2) {
        
        if(num1==0 || num2==0)
            return 0;
        
        // making num1 to always have the bigger value
        if(num1<num2){
            int temp=num2;
            num2=num1;
            num1=temp;
        }
        
        //System.out.println(num1+" "+num2);
        
        if(num1==num2)
            return 1;
        
        if(num1%num2==0)
            return num1/num2;
        
        int ans=0;
        
        while(num1!=0 && num2!=0){
            
            //System.out.println(num1+" "+num2);
            
            if(num1>num2)
                num1-=num2;
            
            else
                num2-=num1;
            
            ans++;
            
        }
        
        return ans;       
        
    }
}