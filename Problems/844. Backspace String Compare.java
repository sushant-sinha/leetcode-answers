// SUSHANT SINHA

// my solution
// 3ms ( 16.73% ) 39.4mb ( 5.71% )

class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        String s1= net(S);
        String t1= net(T);
        
        return s1.equals(t1);
        
    }
    
    public String net(String s){
        
        ArrayList<String> temp=new ArrayList<>();
        
        for(int i=0;i<s.length();i++)
            temp.add(s.substring(i,i+1));
        
        while(temp.contains("#")){
            
            for(int i=0;i<temp.size();i++){
                
                if(i!=0 && temp.get(i).equals("#")){
                    
                    temp.remove(i);
                    temp.remove(i-1);
                    break;
                    
                }
                if(i==0 && temp.get(i).equals("#")){
                    
                    temp.remove(i);
                    break;
                    
                }
                
            }
            
        }
        
        String s1="";
        
        for(String x:temp)
            s1+=x;
        
        return s1;
        
    }
    
}

// best solution given
// 0ms 37.4mb ( 41.74% )

class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length()-1;
        int j = T.length()-1;
        char c1;
        char c2;
        int count;
        while(i!=-1 && j!=-1){
            c1 = S.charAt(i);
            if(c1=='#'){
                count = 1;
                i--;
                while(count!=0 || S.charAt(i) =='#'){
                    c1 = S.charAt(i);
                    if(c1 == '#'){
                        count++;
                    }
                    else{
                        count--;
                    }
                    i--;
                    if(i==-1){
                        break;
                    }
                }
            }
            c2 = T.charAt(j);
            if(c2=='#'){
                count = 1;
                j--;
                while(count!=0 || T.charAt(j) =='#'){
                    c2 = T.charAt(j);
                    if(c2 == '#'){
                        count++;
                    }
                    else{
                        count--;
                    }
                    j--;
                    if(j==-1){
                       break;
                    }
                }
            }
            
            if(i==-1 || j==-1){
                break;
            }
            c1 = S.charAt(i);
            c2 = T.charAt(j);
            
            
            if(c1 != c2){
                return false;
            }
            i--;
            j--;
        }
        count = 0;
        while(i!=-1 && (count!=0 || S.charAt(i) =='#') ){
            c1 = S.charAt(i);
            if(c1 == '#'){
                count++;
            }
            else{
                count--;
            }
            i--;
        }
        
        count = 0;
        while(j!=-1 && (count!=0 || T.charAt(j) =='#')){
            c2 = T.charAt(j);
            if(c2 == '#'){
                count++;
            }
            else{
                count--;
            }
            j--;
        }
        
        if(i==-1 && j==-1) return true;
        return false;
    }
}