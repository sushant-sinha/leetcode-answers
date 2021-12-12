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
