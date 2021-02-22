// SUSHANT SINHA

// 32ms ( 15.80% ) 40.6mb ( 29.90% )

class Solution {
    public String findLongestWord(String s, List<String> d) {
        String  max="";
        if(s.length()==0||s==null){
            return max;
        }
        for(String x:d){
            if(helper(s,x,0,0)){
                if(max.length()<x.length()){
                    max=x;
                }
                else if(max.length()==x.length()){
                    if(x.compareTo(max)<0){
                        max=x;
                    }
                }
            }
        }
        return max;
        
    }
    public static  boolean helper(String s,String target,int idx,int i){

	/* 

		using rescursion to find whether target string is a subsequence in string s, if yes then we can form the word by deleting some characters of the given string 

	*/

     if(idx==target.length()){
         return true;
     }
     if(i==s.length()){
         return false;
     }
     if(target.charAt(idx)!=s.charAt(i)){
         return helper(s,target,idx,i+1);
     }
     boolean res=helper(s,target,idx+1,i+1);
     if(res){
         return true;
     }
     return false;
      
}
}