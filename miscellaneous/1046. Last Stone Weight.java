// SUSHANT SINHA

// 1ms ( 91.16% ) 36.3mb ( 68.40% )

class Solution {
    public int lastStoneWeight(int[] stones) {
        
        ArrayList<Integer> ar=new ArrayList<>();
        
        for(int x:stones)
            ar.add(x);
        
        while(ar.size()>1){
            
            Collections.sort(ar);
            
            int max=ar.get(ar.size()-1);
            int max1=ar.get(ar.size()-2);
            
            if(max>max1){
                ar.remove(ar.size()-1);
                ar.remove(ar.size()-1);
                ar.add(max-max1);
            }
            if(max==max1){
                ar.remove(ar.size()-1);
                ar.remove(ar.size()-1);
            }
            
        }
        
        if(ar.size()!=0)return ar.get(0);
        
        return 0;
        
    }
}