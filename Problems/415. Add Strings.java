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



// best solution 2ms


class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >= 0 || j >= 0) {
            int a = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int b = j >= 0 ? num2.charAt(j--) - '0' : 0;
            int sum = a + b + carry;
            int alg = sum % 10;
            carry = sum >= 10 ? 1 : 0;
            res.append(alg);
        }

        if (carry == 1) {
            res.append(carry);
        }
        
        return res.reverse().toString();
    }
}