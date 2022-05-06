// SUSHANT SINHA

// 261ms ( 68.30% ) 119.2mb ( 40.11% )

class Solution {
    public int countLatticePoints(int[][] circles) {
        
        
        //Gives TLE: ArrayList<Integer> points=new ArrayList<>();
        
        Set<Integer> ans = new HashSet<>();
                
        for(int circle[]:circles){
            
            for(int i=circle[0]-circle[2];i<=circle[0]+circle[2];i++){
                
                for(int j=circle[1]-circle[2];j<=circle[1]+circle[2];j++){
                    
                    // System.out.println(i+" "+j);
                    // System.out.println((Math.pow(i-circle[0],2)+Math.pow(j-circle[1],2)) <= (circle[2]*circle[2]));
                    
                    if( (Math.pow(i-circle[0],2)+Math.pow(j-circle[1],2)) <= (circle[2]*circle[2]) ){
                        
                        
                        /*
                        
                        cannot use ArrayList<int[]>=new ArrayList<>();... because arrays with same values are different because they are two different locations in the storage.. which makes them different.
                        
                        *Two arrays are two separate regions of storage*
                        
                        https://stackoverflow.com/questions/50903207/assigning-two-arrays-equal-to-each-other-problems
                        
                        System.out.println(points.contains(point));
                        
                        if(!points.contains(point)){
                            points.add(point);
                            System.out.println(Arrays.toString(point));
                        }
                        
                        So, to overcome this, we need to create a unique number (or anything else) which can be used to identify the points in the array
                        https://leetcode.com/problems/count-lattice-points-inside-a-circle/discuss/1980902/JavaC%2B%2BPython-O(1)-Space
                        
                        here, (c[0] + i) * 1000 + c[1] + j
                        is used to make a unique number for every ordered-pair (point)
                        
                        */
                        
                        int uniq= i*10000+j;
                        ans.add(uniq);
                        
                    }
                    
                }
                
            }
            
            
        }
        
        return ans.size();
        
    }
}