// SUSHANT SINHA

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