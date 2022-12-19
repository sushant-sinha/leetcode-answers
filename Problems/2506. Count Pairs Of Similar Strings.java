class Solution {
    public int similarPairs(String[] words) {
        
        // will reduce the string and then check whether it is the same string or not
        
        HashMap<String, Integer> map=new HashMap<>();
        int ans=0;
        
        for(String s:words){
            
            String reduced=help(s);
            
            if(map.containsKey(reduced))
                map.put(reduced, map.get(reduced)+1);
            
            else
                map.put(reduced, 1);
            
        }
        
        // traversing the hashmap and doing nC2 to get the number of pairs
        
        for(Map.Entry<String,Integer> e: map.entrySet()){
            
            int n=e.getValue();
            
            if(n>1){
                ans+=n*(n-1)/2;
            }
            
        }
        
        // System.out.println("final "+Collections.toString(set));
        
        return ans;
        
    }
    
    static String help(String s){
        
        StringBuffer ans=new StringBuffer();
        
        ArrayList<Character> ar=new ArrayList<>();
        
        for(char c:s.toCharArray()){
            
            if(!ar.contains(c))
                ar.add(c);
            
        }
        
        Collections.sort(ar);
        
        for(Character c:ar)
            ans.append(c);
        
        // System.out.println("fn "+ans);
        
        return ans.toString();
    }
}