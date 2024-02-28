// SUSHANT SINHA

// 16ms ( 94.66% ) 48.48mb ( 91.58% )

class Solution {
    public String lastNonEmptyString(String s) {
        
        int freq[]=new int[26];
        
        int lastIndex[]=new int[26];
        
        int maxFreq=0;
        
        char ar[]=s.toCharArray();
        
        for(int i=0;i<s.length();i++){
            
            lastIndex[ar[i]-'a']=i;
            
            freq[ar[i]-'a']++;
            
            if(maxFreq<freq[ar[i]-'a'])
                maxFreq=freq[ar[i]-'a'];
            
        }
        
        // String ans="";

        StringBuffer sb=new StringBuffer();
        
        int maxFreqCount=0;
        
        for(int i:freq)
            if(i==maxFreq)
                maxFreqCount++;
        
        while(maxFreqCount!=0){
            
            int index=Integer.MAX_VALUE;
            int c=0;
            
            for(int i=0;i<26;i++){
                
                if(freq[i]==maxFreq && lastIndex[i]<index){
                    
                    index=lastIndex[i];
                    c=i;
                    
                }
            }
            
            freq[c]=0;
            
            sb.append((char)(c+'a'));
            
            maxFreqCount--;
        }
        
        return sb.toString();
        
    }
}