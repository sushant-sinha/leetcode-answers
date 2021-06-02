// SUSHANT SINHA

// 1ms ( 30.97% ) 38.8mb ( 5.55% )

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        
        ArrayList<String> ans = new ArrayList<>();
        
        String split[]=text.split(" ");
        
        for(int i=0;i<split.length-2;i++){
            
            if(split[i].equals(first) && split[i+1].equals(second))
                ans.add(split[i+2]);
            
        }
        
        String ret[]=new String[ans.size()];
        
        for(int i=0;i<ret.length;i++)
            ret[i]=ans.get(i);
        
        return ret;
        
    }
}