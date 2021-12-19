class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        StringBuilder sb=new StringBuilder();
        
        sb.append(s.substring(0,spaces[0]));
        sb.append(" ");
        
        for(int i=0;i<spaces.length-1;i++){
            
            sb.append(s.substring(spaces[i],spaces[i+1]));
            sb.append(" ");
            
        }
        
        sb.append(s.substring(spaces[spaces.length-1],s.length()));
        
        return String.valueOf(sb);
        
    }
}