// SUSHANT SINHA

 // 31ms ( 70% ) 42.8mb ( 100% )

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        // bubble sort
        
        int num=0, len=heights.length;
        
        while(num<len-1){
            
            int cur=heights[len-1];
            //System.out.println(cur);
            
            for(int i=len-2;i>=num;i--){
                if(heights[i]<cur){
                    
                    //System.out.println(heights[i]+" "+heights[i+1]+" "+names[i]+" "+names[i+1]);
                    
                    // swapping string
                    String temp=names[i];
                    names[i]=names[i+1];
                    names[i+1]=temp;
                    
                    // swapping int
                    int t=heights[i];
                    heights[i]=heights[i+1];
                    heights[i+1]=t;
                    
                }
                
                cur=heights[i];
            }
            
            num++;
            
        }
        
        return names;
        
    }
}