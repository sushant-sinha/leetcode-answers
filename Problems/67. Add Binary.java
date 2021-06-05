// SUSHANT SINHA

// Slow Solution

// class Solution {
//     public String addBinary(String a, String b) {
//         // pad zeros
//        if(a.length()>b.length()){
//            int dif1=a.length()-b.length();
//            for(int i=0;i<dif1;i++){
//                b="0"+b;
//            }
//        }else{
//            int dif2=b.length()-a.length();
//            for(int i=0;i<dif2;i++){
//                a="0"+a;
//            }
//        }
       
//        // add with carry
//        String sum=new String("");
//        int carry=0;
//        for(int j=a.length()-1;j>=0;j--){
//            String temp_a=""+a.charAt(j);
//            String temp_b=""+b.charAt(j);
//            int temp=Integer.parseInt(temp_a)+Integer.parseInt(temp_b)+carry;
//            if(temp>=2){
//                carry=1;
//                sum=temp-2+""+sum;
//            }else{
//                carry=0;
//                sum=temp+""+sum;
//            }
//        }
//         if(carry==1) sum="1"+sum;
//         return sum;
//     }
// }

/* 


Fast Solution from https://www.programcreek.com/2014/05/leetcode-add-binary-java/


*/

class Solution{
public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
 
    int i=a.length()-1;
    int j=b.length()-1;
 
    int carry = 0;
 
    while(i>=0 || j>=0){
        int sum=0;
 
        if(i>=0 && a.charAt(i)=='1'){
            sum++;    
        }
 
        if(j>=0 && b.charAt(j)=='1'){
            sum++;
        }
 
        sum += carry;
 
        if(sum>=2){
            carry=1;
        }else{
            carry=0;
        }
 
        sb.insert(0,  (char) ((sum%2) + '0'));
 
        i--;
        j--;
    }
 
    if(carry==1)
        sb.insert(0, '1');
 
    return sb.toString();
}
}