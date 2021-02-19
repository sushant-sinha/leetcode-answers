// SUSHANT SINHA

class Solution {
    public String removeDuplicates(String S) {
        
        ArrayList<String> ar=new ArrayList<>();
        
        for(String x:S.split(""))
            ar.add(x);
        
        for(int i=0;i<ar.size()-1;i++){
            
            if(ar.get(i).equals(ar.get(i+1))){
                
                ar.remove(i);
                ar.remove(i);
                i=-1;
                
            }
            
        }
        
        String ans="";
        
        for(int i=0;i<ar.size();i++)ans+=ar.get(i);
        
        return ans;
        
    }
}
