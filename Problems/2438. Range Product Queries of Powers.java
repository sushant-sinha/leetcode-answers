// SUSHANT SINHA

// 104ms ( 21.28% ) 134.4mb ( 33.85% )

class Solution {
    public int[] productQueries(int n, int[][] queries) {
        
        int ans[]=new int[queries.length];
        
        ArrayList<Integer> powers=pow(n);
        
        for(int i=0;i<queries.length;i++){
            
            long temp=1;
            for(int j=queries[i][0];j<=queries[i][1];j++){
                
                temp=(temp*powers.get(j))%(1000000007);
                //System.out.println(temp);
            }
            
            ans[i]=(int)temp;
            
        }
        
        return ans;
        
    }
    
    static ArrayList<Integer> pow(int n){
        
        ArrayList<Integer> temp=new ArrayList<>();
        
        // convert the given into binary form
        // returning the binary number in the form of array
        
        String bin=Integer.toBinaryString(n);
        
        for(int i=bin.length()-1;i>=0;i--){
            
            if(bin.charAt(i)=='1')
            temp.add((int)Math.pow(2,bin.length()-1-i));
            
        }
        
        // System.out.println(bin+" "+temp);

        return temp;
        
    }
    
}