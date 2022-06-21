// SUSHANT SINHA

// initial approach
// this will be followed by the trie approach (optimal ig)... it has better speed at the cost of space

// 540ms ( 9.82ms ) 42.2mb ( 98.77% )
// slow because String is being used for the condition and sorting

class Solution {
    public int minimumLengthEncoding(String[] words) {
        
        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
        
        int len=0;
        
        ArrayList<String> ans=new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            
            boolean found=false;
            
            for(int j=0;j<ans.size();j++){
                
                if( ans.get(j).lastIndexOf(words[i])>=0 && (ans.get(j).lastIndexOf(words[i])+(words[i].length()))==ans.get(j).length()){
                    
                    found=true;
                    //System.out.println("found");
                    break;
                    
                }
            }
            
            if(!found){
                ans.add(words[i]);
                len+=words[i].length()+1;
            }
            
        }
        
        return len;
        
    }
}