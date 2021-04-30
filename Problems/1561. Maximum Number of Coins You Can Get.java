// SUSHANT SINHA

// using array
// 24ms( 97.19% ) 48.2mb ( 82.81% )

class Solution {
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);
        int ans=0,j=2;
        
        for(int i=0;i<(piles.length/3);i++){
            
            ans+=piles[piles.length-j];
            j+=2;
        }
        
        return ans;
        
    }
}

// using arraylist
// 425 ( 5.09% ) 51.5mb ( 10.70% )

class Solution {
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);
        
        ArrayList<Integer> p=new ArrayList<>();
        for(int i:piles)
            p.add(i);
        
        int ans=0;
        
        for(int i=0;i<(piles.length/3);i++){
            
            p.remove(p.size()-1);
            ans+=p.get(p.size()-1);
            p.remove(p.size()-1);
            p.remove(0);
            
        }
        
        return ans;
        
    }
}