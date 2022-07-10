// SUSHANT SINHA

// 5ms ( 82.43% ) 42.5mb ( 86.35% )

class Solution {
    public String decodeMessage(String key, String message) {
        
        char ans[]=new char[message.length()];
        
        HashMap<Integer, Integer> map=new HashMap<>();
        
        int index=0;
        
        for(char c:key.toCharArray()){
            
            if(c==' ')
                continue;
            
            if(!map.containsKey(c-'a'))
                map.put((c-'a'),index++);
            
            if(index==26)
                break;
            
        }
        
        for(int i=0;i<message.length();i++){
            
            if(message.charAt(i)==' '){
                ans[i]=' ';
                continue;
            }
            
            //System.out.println((char)((int)map.get(message.charAt(i)-'a')+'a'));
            
            ans[i]=(char)((int)map.get(message.charAt(i)-'a')+'a');
            
        }
        
        return String.valueOf(ans);
        
    }
}