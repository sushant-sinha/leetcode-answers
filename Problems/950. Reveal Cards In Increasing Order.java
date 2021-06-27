// SUSHANT SINHA

// 4ms ( 24.61% ) 39.4mb ( 28.27% )

class Solution {
    
    static int ans[];
    
    public int[] deckRevealedIncreasing(int[] deck) {
        
        if(deck.length==1)
            return deck;
        
        Arrays.sort(deck);
        
        ans=new int[deck.length];
        
        ans[1]=deck[deck.length-1];
        ans[0]=deck[deck.length-2];
        
        for(int i=deck.length-3;i>=0;i--){
            add(deck[i],deck.length-i-2);
            
        }
        
        return ans;
        
    }
    
    void add(int x, int index){
        
        int a=ans[index];
        
        for(index--;index>=0;index--){
            ans[index+2]=ans[index];
        }
        
        ans[1]=a;
        ans[0]=x;
        
        
    }
    
}

// best solution
// 2ms ( 98.45% ) 39.3mb ( 37.41% )

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        if(deck.length==1) return deck;
        int n=deck.length;
        int[] res=new int[n];
        Arrays.sort(deck);
        res[0]=deck[0];
        int k=1,c=0;
        while(k<n){
            for(int i=1;i<n;i++){
                if(res[i]==0){
                    c++;
                    if(c==2){
                        res[i]=deck[k];
                        k++;
                        c=0;
                    }
                }
            }
        }
    return res;
    }
}