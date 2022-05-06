class Solution {
    public int countLatticePoints(int[][] circles) {
        
        
        //Gives TLE ArrayList<Integer> points=new ArrayList<>();
        
        Set<Integer> ans = new HashSet<>();
                
        for(int circle[]:circles){
            
            for(int i=circle[0]-circle[2];i<=circle[0]+circle[2];i++){
                
                for(int j=circle[1]-circle[2];j<=circle[1]+circle[2];j++){
                    
                    // System.out.println(i+" "+j);
                    // System.out.println((Math.pow(i-circle[0],2)+Math.pow(j-circle[1],2)) <= (circle[2]*circle[2]));
                    
                    if( (Math.pow(i-circle[0],2)+Math.pow(j-circle[1],2)) <= (circle[2]*circle[2]) ){
                        
                        int uniq= i*10000+j;
                        ans.add(uniq);
                        
                    }
                    
                }
                
            }
            
            
        }
        
        return ans.size();
        
    }
}