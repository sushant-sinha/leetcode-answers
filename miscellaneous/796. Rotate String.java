// SUSHANT SINHA

// My solution simple approach not efficient
// 27ms ( 5.50% ) 40mb

class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length()!=B.length())return false;
        if(A.equals(B))return true;
        String temp="",ans=A;
        while(!temp.equals(ans)){
            temp="";
            String ar[]=A.split("");
            for(int i=1;i<ar.length;i++)
                temp+=ar[i];
            temp+=ar[0];
            A=temp;
            if(temp.equals(B))return true;
            
        }
        
        return false;
        
    }
}
