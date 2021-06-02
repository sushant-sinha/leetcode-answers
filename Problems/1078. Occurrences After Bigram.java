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

// 0ms ( 100% ) 39mb ( 5.55% )

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        
        ArrayList<String> ans = new ArrayList<>();
        
        String split[]=text.split(" ");
        
        for(int i=0;i<split.length-2;i++){
            
            if(split[i].equals(first) && split[i+1].equals(second))
                ans.add(split[i+2]);
            
        }
        
        // forming the array by iterating makes the code slow... use list.toArray(new String[0])
        return ans.toArray(new String[0]);
        
    }
}