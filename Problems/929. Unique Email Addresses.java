// SUSHANT SINHA

// 10ms ( 72.14% ) 38.9mb ( 89.66% )

class Solution {
    public int numUniqueEmails(String[] emails) {
        
        ArrayList<String> dis = new ArrayList<>();
        int ans=0;
        
        for(String s:emails){
            String em=effective(s);
            if(!dis.contains(em)){
                dis.add(em);
                ans++;
            }
        }
        
        return ans;
        
    }
    
    String effective( String s ){
        
        String split[]=s.split("@");
        
        StringBuilder str= new StringBuilder();
        
        for(char c:split[0].toCharArray()){
            if(c=='.'){
                continue;
            }
            
            if(c=='+'){
                break;
            }
            
            else{
                str.append(c);
            }
        }
        
        str.append("@"+split[1]);
        
        return str.toString();
    }
}