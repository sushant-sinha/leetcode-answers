// SUSHANT SINHA


// My solution

class Solution {
    public String reverseVowels(String s) {
        StringBuffer sb=new StringBuffer();
        
        ArrayList<String> ar=new ArrayList<String>();
                
        for(int i=0;i<=(s.length()-1);i++){
            
            String sub=s.substring(i,i+1);
            
            switch(sub){
                case "a" :
                    ar.add(sub);
                    break;
                case "e" :
                    ar.add(sub);
                    break;
                case "i" :
                    ar.add(sub);
                    break;
                case "o" :
                    ar.add(sub);
                    break;
                case "u" :
                    ar.add(sub);
                    break;    
                    case "A" :
                    ar.add(sub);
                    break;
                case "E" :
                    ar.add(sub);
                    break;
                case "I" :
                    ar.add(sub);
                    break;
                case "O" :
                    ar.add(sub);
                    break;
                case "U" :
                    ar.add(sub);
                    break;
            }
            
        }
        
        int size=ar.size();
        
        for(int i=0;i<=(s.length()-1);i++){
            
            String sub=s.substring(i,i+1);
            
            if(!sub.equals("a") && !sub.equals("i") && !sub.equals("o") && !sub.equals("u") && !sub.equals("e") && !sub.equals("A") && !sub.equals("E") && !sub.equals("I") && !sub.equals("O") && !sub.equals("U"))
                sb.append(sub);
            
            else sb.append(ar.get(--size));
            
            
        }
        
         return ""+sb;
    }
}

// Fastest solution

class Solution {
    public String reverseVowels(String s) {
        char ans[] = s.toCharArray();
        int i=0, j= s.length()-1;
        while (i<j) {
            while (i<j) 
            {
                if(ans[i]=='a' || ans[i]=='e' || ans[i]=='i' || ans[i]=='o' || ans[i]=='u' || ans[i]=='A' || ans[i]=='E' || ans[i]=='I' || ans[i]=='O' || ans[i]=='U')
                {
                    break;
                }
                i++;
            }
            while (j>i) 
            {
                if(ans[j]=='a' || ans[j]=='e' || ans[j]=='i' || ans[j]=='o' || ans[j]=='u' || ans[j]=='A' || ans[j]=='E' || ans[j]=='I' || ans[j]=='O' || ans[j]=='U')
                {
                    break;
                }
                j--;
            }

            if(i<j)
            {
                char swapper = ans[i];
                ans[i] = ans[j];
                ans[j] = swapper;
                i++;
                j--;
            }
        }
        
        return new String(ans);
    }
}

