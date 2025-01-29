class Solution {
    public int minimizeXor(int num1, int num2) {
        String a=Integer.toBinaryString(num1);
        String b=Integer.toBinaryString(num2);
        int count=0;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='1'){
                count=count+1;
            }
        }
        String ans1="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='1' && count>0){
                ans1=ans1+"1";
                count=count-1;
            }
            else{
                ans1=ans1+"0";
            }
        }
        int i=ans1.length()-1;
        String ans="";
        while(i>=0){
            if(count>0 && ans1.charAt(i)=='0'){
                ans="1"+ans;
                count=count-1;
            }
            else{
                ans=ans1.charAt(i)+ans;
            }
            i=i-1;
        }
        while(count>0){
            ans="1"+ans;
            count=count-1;
        }
        return Integer.parseInt(ans,2);
    }
}