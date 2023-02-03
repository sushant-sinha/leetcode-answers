// SUSHANT SINHA

// 6ms ( 69.97% ) 42.7mb ( 92.90% )

class Solution {
    public boolean makeStringsEqual(String s, String target) {

        if(s.equals(target))
        return true;

        boolean ans1=false, ans2=false;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ans1=true;
            }
            if(target.charAt(i)=='1'){
                ans2=true;
            }

            if(ans1&&ans2)
            return true;
        }

        return false;
        
    }
}