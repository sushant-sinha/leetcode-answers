// SUSHANT SINHA

// 4ms ( 80.00% ) 40.5mb ( 20.00% )

class Solution {
    public String[] divideString(String s, int k, char fill) {
        
        String ans[]=new String[(s.length()%k==0 ? s.length()/k : ((s.length()/k)+1))];
        
        int arIndex=0;
        
        for(int i=0;i<ans.length;i++){
            
            StringBuffer temp=new StringBuffer();
            
            int start=k*i, limit=start+k;
            
            while(start<s.length() && start<limit){
                temp.append(s.charAt(start));
                start++;
            }
            
            ans[i]=String.valueOf(temp);
            
        }
        
        if(s.length()%k!=0){
            
            StringBuffer temp;;
            
            while(ans[ans.length-1].length()!=k){
                
                temp=new StringBuffer();
                
                temp.append(ans[ans.length-1]);
                temp.append(fill);
                ans[ans.length-1]=String.valueOf(temp);
                
            }
            
        }
        
        return ans;
        
    }
}