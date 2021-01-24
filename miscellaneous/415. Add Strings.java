// SUSHANT SINHA

// my solution 21ms 

class Solution {
    public String addStrings(String num1, String num2) {
        if(num1.equals(""))return num2;
        if(num2.equals(""))return num1;
        String ans="";
        String n1[]=num1.split("");
        String n2[]=num2.split("");
        
        if(n1.length>=n2.length){
            int carry=0,i=n2.length-1,j=n1.length-1;
            
            for(;i>=0;i--,j--){
                
                int temp=Integer.parseInt(n1[j])+Integer.parseInt(n2[i])+carry;
                if(temp>=10){
                    ans=(temp%10)+ans;
                    carry=1;
                }
                else{
                    carry=0;
                    ans=temp+ans;
                }
                
            }
            
            
            while(j>=0){
                
                int temp=Integer.parseInt(n1[j])+carry;
                if(temp>=10){
                    ans=(temp%10)+ans;
                    carry=1;
                }
                else{
                    carry=0;
                    ans=temp+ans;
                }
                j--;
            
            }
            
            if(carry==1)ans=1+ans;
            
            
        }
        else{
            int carry=0,j=n2.length-1,i=n1.length-1;
            
            for(;i>=0;i--,j--){
                
                int temp=Integer.parseInt(n2[j])+Integer.parseInt(n1[i])+carry;
                if(temp>=10){
                    ans=(temp%10)+ans;
                    carry=1;
                }
                else{
                    carry=0;
                    ans=temp+ans;
                }
                
            }
            
            
            while(j>=0){
                
                int temp=Integer.parseInt(n2[j])+carry;
                if(temp>=10){
                    ans=(temp%10)+ans;
                    carry=1;
                }
                else{
                    carry=0;
                    ans=temp+ans;
                }
                j--;
            
            }
            
            if(carry==1)ans=1+ans;
            
            
        }
        
        return ans;
        
    }
}

