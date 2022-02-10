// SUSHANT SINHA

// 14ms ( 11.49% ) 42.5mb ( 6.06% )

class Solution {
    public long smallestNumber(long num) {
        
        if(num==0)
            return num;
        
        String s=Long.toString(num);
        
        char ar[]=s.toCharArray();
        
        Arrays.sort(ar);
        
        int i=0;
        
        if(ar[0]=='-'){
            
            // reusing variable s
            
            s="";
            i=ar.length-1;
            
            for(;i>0;i--)
                s+=ar[i];
            
            s='-'+s;
            
            return Long.parseLong(s);
            
        }
        
        if(ar[0]=='0'){
            
            while(i<ar.length && ar[i]=='0')
                i++;
            
            ar[0]=ar[i];
            ar[i]='0';
            
            return Long.parseLong(new String(ar));
        }
        
        else
            return Long.parseLong(new String(ar));
        
    }
}