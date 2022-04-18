class Solution {
    public String customSortString(String order, String s) {
        
        ArrayList<Character> sList=new ArrayList<>();
        
        for(char c:s.toCharArray())
            sList.add(c);
        
        StringBuffer ans=new StringBuffer();
        
        for(char c:order.toCharArray()){
            
            while(sList.contains(c)){
                
                ans.append(c);
                sList.remove((Character)c);
                
            }
            
        }
        
        while(sList.size()!=0){
            
            ans.append(sList.get(0));
            sList.remove((Character)sList.get(0));
            
        }
            
        
        //System.out.println(ans);
        
        //return "hi";
        
        return ans.toString();
        
    }
}