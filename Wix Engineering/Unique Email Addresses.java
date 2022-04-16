class Solution {
    public int numUniqueEmails(String[] emails) {
        
        ArrayList<String> unique=new ArrayList<>();
        
        for(String s:emails){
            
            String temp=simplify(s);
            
            if(!unique.contains(temp))
                unique.add(temp);
            
        }
        
        return unique.size();
        
    }
    
    String simplify(String s){
        
        String split[]=s.split("@");
        
        // extracting domain name
        String domainName=split[1];
        
        StringBuffer locName=new StringBuffer();
        
        for(char c:split[0].toCharArray()){
            
            if(c=='.')
                continue;
            
            else if(c=='+')
                break;
            
            locName.append(c);
            
        }
        
        
        
        StringBuffer sBuff=new StringBuffer();
        sBuff.append(locName).append("@").append(domainName);
        
        return sBuff.toString();
        
    }
}