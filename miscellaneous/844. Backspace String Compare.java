// SUSHANT SINHA

// my solution
// 3ms ( 16.73% ) 39.4mb ( 5.71% )

class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        String s1= net(S);
        String t1= net(T);
        
        return s1.equals(t1);
        
    }
    
    public String net(String s){
        
        ArrayList<String> temp=new ArrayList<>();
        
        for(int i=0;i<s.length();i++)
            temp.add(s.substring(i,i+1));
        
        while(temp.contains("#")){
            
            for(int i=0;i<temp.size();i++){
                
                if(i!=0 && temp.get(i).equals("#")){
                    
                    temp.remove(i);
                    temp.remove(i-1);
                    break;
                    
                }
                if(i==0 && temp.get(i).equals("#")){
                    
                    temp.remove(i);
                    break;
                    
                }
                
            }
            
        }
        
        String s1="";
        
        for(String x:temp)
            s1+=x;
        
        return s1;
        
    }
    
}