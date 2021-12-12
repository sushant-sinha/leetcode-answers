// SUSHANT SINHA


// no brain needed for this method
// 6ms ( 20.00% ) 39.1mb ( 20.00% )

class Solution {
    public int countPoints(String rings) {
        
        int ans=0;
        
        ArrayList<String> ar=new ArrayList<>();
        
        for(int i=0;i<rings.length()-1;i+=2){
            
            String temp=rings.charAt(i+1)+""+rings.charAt(i);
            
            if(!ar.contains(temp))
                ar.add(temp);
            
            //System.out.println(temp);
        }
        
        for(int i=0;i<=rings.length()/2;i++){
            
            String R=i+"R";String G=i+"G";String B=i+"B";
            
            //System.out.println(R+" "+G+" "+B);
            
            if(ar.contains(R) && ar.contains(G) && ar.contains(B))
                ans++;
            
        }
        
        return ans;
        
    }
}

// best solution from the submission tab
// 0ms

class Solution {
    public int countPoints(String rings) {
        boolean [][] arr = new boolean [10][3];
        int val;
        char color;
        
        for (int i = 1; i < rings.length(); i += 2){
            color = rings.charAt(i - 1);
            val = rings.charAt(i) - '0';
            
            if (color == 'R')
                arr[val][0] = true;
            else if (color == 'G')
                arr[val][1] = true;
            else
                arr[val][2] = true;
        }
        
        int total = 0;
        
        for (int i = 0; i < 10; ++i){
            if (arr[i][0] && arr[i][1] && arr[i][2])
                ++total;
        }
        
        return total;
    }
}
