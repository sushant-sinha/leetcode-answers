// SUSHANT SINHA

// my solution 🤣
// 18ms ( 6.15% ) 38.9mb ( 19.97% )

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
               
        ArrayList<String> ar=new ArrayList<>();
        
        for(String x:words){
            
            String sp[]=x.split("");
            
            String ans="";
            
            for(String a:sp){
                
                switch(a){
                        
                    case "a" :
                        ans+=".-";
                        break;
                    case "b" :
                        ans+="-...";
                        break;
                    case "c" :
                        ans+="-.-.";
                        break;
                    case "d" :
                        ans+="-..";
                        break;
                    case "e" :
                        ans+=".";
                        break;
                    case "f" :
                        ans+="..-.";
                        break;
                    case "g" :
                        ans+="--.";
                        break;
                    case "h" :
                        ans+="....";
                        break;
                    case "i" :
                        ans+="..";
                        break;
                    case "j" :
                        ans+=".---";
                        break;
                    case "k" :
                        ans+="-.-";
                        break;
                    case "l" :
                        ans+=".-..";
                        break;
                    case "m" :
                        ans+="--";
                        break;
                    case "n" :
                        ans+="-.";
                        break;
                    case "o" :
                        ans+="---";
                        break;    
                    case "p" :
                        ans+=".--.";
                        break;
                    case "q" :
                        ans+="--.-";
                        break;
                    case "r" :
                        ans+=".-.";
                        break;
                    case "s" :
                        ans+="...";
                        break;
                    case "t" :
                        ans+="-";
                        break;
                    case "u" :
                        ans+="..-";
                        break;
                    case "v" :
                        ans+="...-";
                        break;
                    case "w" :
                        ans+=".--";
                        break;
                    case "x" :
                        ans+="-..-";
                        break;
                    case "y" :
                        ans+="-.--";
                        break;
                    case "z" :
                        ans+="--..";
                        break;
                        
                }
                
                
            }
            if(!ar.contains(ans))ar.add(ans);
            
        }
        
        return ar.size();
        
    }
}

