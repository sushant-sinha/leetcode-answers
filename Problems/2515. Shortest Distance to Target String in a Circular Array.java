// SUSHANT SINHA

// 6ms ( 6.13% ) 43mb ( 28.92% )

class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        
        HashMap<String, ArrayList<Integer>> map=new HashMap<>();
        
        for(int i=0;i<words.length;i++){
            
            ArrayList<Integer> ar=new ArrayList<>();
            
            if(map.containsKey(words[i])){
                ar=map.get(words[i]);
                ar.add(i);
                map.put(words[i], ar);
            }
            
            else{
                ar.add(i);
                map.put(words[i], ar);
            }
            
        }
        
        if(map.containsKey(target)){
            return findMin(startIndex, map.get(target), words.length);
        }
        
        return -1;
        
    }
    
    int findMin(int startIndex, ArrayList<Integer> ar, int len){
        
        int min=0, ans=101;
        
        for(int i:ar){
            
            if(i==startIndex)
                return 0;
            
            if(startIndex>i){
                
                min=Math.min(len-startIndex+i, Math.abs(startIndex-i));
                
            }
            
            else{
                
                min=Math.min(len-i+startIndex, Math.abs(startIndex-i));
                
            }
            
            
            ans=Math.min(ans,min);
            // System.out.println(i+" start="+startIndex+" "+min+" first="+(len-startIndex+i)+" sec="+(Math.abs(startIndex-i)));
            
            
            
        }
        
        return ans;
        
    }
}