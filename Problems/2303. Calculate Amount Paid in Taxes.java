class Solution {
    public double calculateTax(int[][] brackets, int income) {
        
        // when income is 0 we will have tax=0
        if(income==0)
            return 0;
        
        // if there is only one tax bracket.. and according to the question's condition... it will have the upper limit greater or equal than the income
        if(brackets.length==1)
            return (double)brackets[0][1]*income/100;
        
        double ans=0;
        
        // this is for the first tax bracket.... since the while loop will skip the first and the last element in the brackets array

        // first tax bracket
        if(brackets[0][0]<=income){
            
            ans+=(double)brackets[0][0]*brackets[0][1]/100;
            
            //System.out.println(ans);
            income-=brackets[0][0];
            
        }
        
        else{
            
            return (double)income*brackets[0][1]/100;
            
        }
        
        int i=0;
        
        while(i<brackets.length-1 && income!=0){
            
            int range=brackets[i+1][0]-brackets[i][0];
            
            // if the range between the two brackets is less than the current income.. we will calculate the tax on the range
            // then update the income to be the remaining/difference
            if(range<=income){
                
                ans+=(double)range*brackets[i+1][1]/100;
                //System.out.println(ans);
                
                income-=range;
                
            }
            
            // if the range is more than the income.. then simply calculate the tax on the income
            // declare the income to be zero as the complete income is taxed
            else{
                
                ans+=(double)income*brackets[i+1][1]/100;
                //System.out.println(ans+" income "+income);
                income=0;
                
            }
            
            i++;
            
        }
        
        // last tax bracket...
        if(income!=0)
            ans+=(income*brackets[i][1]/100);
        
        return ans;
        
    }
}