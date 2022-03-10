class Solution {
    public List<String> cellsInRange(String s) {
        
        String pos[]=s.split(":");
        
        ArrayList<String> ans= new ArrayList<>();
        
        int n1=Integer.parseInt(pos[0].substring(1)), n2=Integer.parseInt(pos[1].substring(1));
        
        char start=pos[0].charAt(0), end=pos[1].charAt(0);
        
        StringBuilder cell;
        
        while(start<=end){
            
            int index=n1;
            
            while(index<n2+1){
                
                cell=new StringBuilder();
                cell.append(start).append(index);
                
                ans.add(cell.toString());
                index++;
            }
            
            start++;
            
        }
        
        return ans;
        
    }
}