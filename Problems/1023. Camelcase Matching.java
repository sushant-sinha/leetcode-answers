class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        
        ArrayList<Boolean> ans=new ArrayList<>();
        
        ArrayList<String> pt=new ArrayList<>();
        
        for(int i=0;i<pattern.length();){
            if(Character.isUpperCase(pattern.charAt(i))){
                
                int start=i;
                i++;
                while(i<pattern.length() && Character.isLowerCase(pattern.charAt(i)))
                    i++;
                
                pt.add(pattern.substring(start,i));
                
            }
        }
        
        
        for(String s:queries){
            
            ArrayList<String> qu=new ArrayList<>();
            
            boolean toadd=true;
            
            for(int i=0;i<s.length();){
                
                if(Character.isUpperCase(s.charAt(i))){
                    
                    int start=i;
                    i++;
                    while(i<s.length() && Character.isLowerCase(s.charAt(i)))
                        i++;
                    
                    
                    qu.add(s.substring(start,i));
                                        
                }
            }
            
            if(qu.size()!=pt.size()){
                ans.add(false);
                continue;
            }
            
            for(int i=0;i<pt.size();i++){
                
                boolean found=false;
                
                char ar1[]=pt.get(i).toCharArray();
                char ar2[]=qu.get(i).toCharArray();
                
                if(ar1.length<=ar2.length){
                    
                    int x=0,y=0;
                    
                    for(;x<ar1.length;x++){
                        found=false;
                        for(;y<ar2.length;y++){
                            if(ar2[y]==ar1[x]){
                                found=true;
                                break;
                            }
                        }
                    }
                    
                    if(!found)
                        ans.add(true);
                    
                }
                
                else{
                    ans.add(false);
                    break;
                }
                
            }
            
            if(toadd)
                ans.add(true);
            else
                ans.add(false);
            
            
        }
        
        return ans;
        
    }
}