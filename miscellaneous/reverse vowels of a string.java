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

