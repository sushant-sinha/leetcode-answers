// SUSHANT SINHA

// edit
// instead of iterating the entire (individual) String from the disctionary and then checking whether the counter<=2
// we can break the for loop as soon as the counter value exceeds 2

// 4ms ( 94.84% ) 42.3mb ( 91.71% )

class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        
        ArrayList<String> ans=new ArrayList<>();
        
        int len=queries[0].length();
        
        for(String s:queries){            
            
            for(String d:dictionary){
                
                int counter=0;
                // using flag variable to indicate that a match has been found and no further iteration/comparision is needed
                boolean flag=true;
                
                for(int i=0;i<len;i++){
                    
                    if(s.charAt(i)!=d.charAt(i))
                        counter++;
                    
                    if(counter>2){
                        flag=false;
                        break;
                    }
                    
                }
                
                if(flag){
                    ans.add(s);
                    break;
                }
                
            }
            
        }
        
        return ans;
        
    }
}


// original solution
// 31ms ( 39.33% ) 42.8mb ( 86.14% )

class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        
        ArrayList<String> ans=new ArrayList<>();
        
        int len=queries[0].length();
        
        for(String s:queries){
            
            for(String d:dictionary){
                
                int counter=0;
                
                for(int i=0;i<len;i++){
                    if(s.charAt(i)!=d.charAt(i))
                        counter++;
                }
                
                if(counter<=2){
                    ans.add(s);
                    break;
                }
                
            }
            
        }
        
        return ans;
        
    }
}