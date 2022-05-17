// 6ms ( 64.82% ) 45.4mb ( 71.32% )

class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        List<String> ans=new ArrayList<>();
        
        int inAns[]=new int[words.length];
        
        // filling the array with value 2... if the value is 2 then we will be adding the element in the final answer arraylist
        Arrays.fill(inAns, 2);
        
        for(int i=0;i<words.length-1;i++){
            
            if(inAns[i]==0)
                continue;
            
            int j=i+1;
            
            while(j+1<words.length && inAns[j]!=2)
                j++;
            
            //System.out.println(words[i]+" "+words[j]);
            
            if(inAns[i]==2 && inAns[j]==2 && words[i].length()==words[j].length() && charCount(words[i],words[j])){
                
                inAns[j]=0;
                i=-1;
                
            }
            
        }

        
        
/* cannot remove elements while iterating the elements int the arraylist.... here ans was the arraylist initialized wih all the elements from the words array
        for(int i=1;i<ans.size();i++){
            
            if(words[i].length()==words[i-1].length() && charCount(words[i],words[i-1])){
                System.out.println(words[i]+" "+words[i-1]);
                ans.remove(i);
                i=1;
                continue;
            }
            
        }
        
*/      
        
        for(int i=0;i<words.length;i++){
            if(inAns[i]==2)
                ans.add(words[i]);
        }
        
        return ans;
        
    }
    
    boolean charCount(String s, String t){
        
        int ar[]=new int[26];
        
        for(int i=0;i<s.length();i++){
            
            ar[s.charAt(i)-'a']++;
            ar[t.charAt(i)-'a']--;
            
        }
        
        for(int i:ar)
            if(i!=0)
                return false;
        
        return true;
        
    }
    
}