class Solution {
    
    int ans=0;
    
    public int compress(char[] chars) {
        
        int index=-1;
        
        for(int i=0;i<chars.length;){
            
            char c=chars[i];
            chars[++index]=c;
            ans++;
            int counter=1;
            
            while(++i<chars.length && c==chars[i]){
                counter++;
            }
            
            //System.out.println(c+" "+counter+" ans="+ans);
            
            if(counter>=10){
                
                int temp=index+len(counter);
                int counterDuplicate=counter;
                
                while(counter!=0){
                    
                    chars[temp--]=(char)((counter%10)+'0');
                    counter/=10;
                    ans++;
                    
                    //System.out.println(chars);
                    
                }
                
                index=ans-1;
                
            }
            
            else if(counter<10 && counter>1){
                //System.out.println("hit "+counter);
                ans+=1;
                chars[++index]=(char)(counter+'0');
            }
            
        }
        
        return ans;
        
    }
    
    int len(int n){
        
        int x=0;
        
        while(n!=0){
            x++;
            n/=10;
        }
        
        return x;
        
    }
}