// SUSHANT SINHA

// 558ms ( 5.15% ) 49mb ( 63.64% )

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        
        Arrays.sort(folder);
                
        // System.out.println(Arrays.toString(folder));
        
        List<String> ans=new ArrayList<>();
        
        for(int i=0;i<folder.length;i++){
            
            String x=folder[i];
            
            ans.add(x);
            
            for(int j=i+1;j<folder.length;j++){
                
                if(folder[j].indexOf(x)==0){
                    
                    //System.out.println(folder[j].indexOf(x));
                    
                    if(folder[j].charAt(folder[j].indexOf(x)+x.length())=='/'){
                        i++;
                        continue;
                    }
                    
                }
                
            }
            
        }
               
        return ans;
        
    }
}