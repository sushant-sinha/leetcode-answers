// SUSHANT SINHA

// 4ms ( 57.42% ) 37.5mb ( 52.04% )

class Solution {
    public String reorderSpaces(String text) {
        
        int space=0;
        for(char x:text.toCharArray())
            if(x==' ')
                ++space;
        
        
        String[] words = text.trim().split("\\s+");
        
        String ans="";
        int ar=0;
        
        if(words.length==1){
            
            ans+=words[0];
            
            while(ans.length()!=text.length())
                ans+=" ";
            
            return ans;
            
        }
        
        int val=(space/(words.length-1));
        int remainder = space%(words.length-1);
        
        for(int i=0;i<space+words.length-remainder;i++){
            
            ans+=words[ar++];
            if(i+1==space+words.length-remainder)
                break;
            for(int j=0;j<val;j++)
                ans+=" ";
            i+=val;
            
        }
        
        
        
        while(ans.length()!=text.length())
            ans+=" ";
        
        return ans;
        
    }
}

// best solution
// 0ms ( 100% )

class Solution {
    /**
        text = "ttt  bbb k"
        result = "ttt bbb k "
        
        text = "   tt"
        result ="tt   "
        
        text = "tt  kk    l  n", s = 8, wc = 4, slots = 4-3 = 3
        8/3 = 2, 8%3 = 2
        result = "tt  kk  l  n  "
        
        text = "tt kk     l  n"
            i=0,wc=0,sc=0,ch='t'
            i=1,wc=0,sc=0,ch='t'
            i=2,wc=0,sc=0,ch=' ' -> sc=1, wc=1
            i=3,wc=1,sc=1,ch=' ' -> sc=2, wc=1
            i=3,wc=1,sc=2,ch=k
            i=4,wc=1,sc=2,ch=k
            i=5,wc=1,sc=2,ch=' ' -> sc=3, wc=2
            i=6,wc=2,sc=3,ch=' ' -> sc=4, wc=2
            i=7,wc=2,sc=4,ch=' ' -> sc=5, wc=2
            i=8,wc=2,sc=5,ch=' ' -> sc=6, wc=2
            i=9,wc=2,sc=6,ch=l   -> sc=6, wc=2
            i=10,wc=2,sc=6,ch=' ' -> sc=7, wc=3
            i=11,wc=3,sc=7,ch=' ' -> sc=8, wc=3
            i=12,wc=3,sc=7,ch=n -> sc=8, wc=3
            
            
    **/
    public String reorderSpaces(String text) {
        int wc=0, sc=0;
        for(int i=0; i<text.length(); i++) {
            char ch = text.charAt(i);
            if(ch == ' ') {
                sc++;
            } else {
                if(i == 0 || text.charAt(i-1) == ' ') {
                     wc++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        
        int slot = (wc-1);
        int spacePerSlot = slot == 0 ? 0 : sc/slot;
        int leftOver = slot == 0 ? sc : sc%(wc-1);
        
        for(int i=0; i<text.length(); i++) {
            char ch = text.charAt(i);
            if(ch != ' ') {
                sb.append(ch);   
                if(i+1 == text.length() || text.charAt(i+1) == ' ') { // word ending
                    for(int j=0; slot > 0 && j<spacePerSlot; j++) {
                        sb.append(' ');
                    }
                    slot--;
                }
            }
        }
        
        for(int j=0; j<leftOver; j++) {
            sb.append(' ');
        }
        return sb.toString();
    }
}
