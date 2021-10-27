class Solution {
    public String validIPAddress(String IP) {
        
        if(IP.contains(".")){
            
            //condition for IPv4
            
            int count=0;
            
            //testing number of "." in IP            
            for(char c:IP.toCharArray())
                if(c=='.')
                    count++;
            
            if(count!=3)
                return "Neither";
            
            //split each section
            String sp[]=IP.split("\\.");
            
            //test if the length of the number is less than 3 and is not empty.... else "neither"
            for(String v:sp)
                if(v.isEmpty() || v.length()>3)
                    return "Neither";
            //test for the number of sections in array
            if(sp.length!=4)
                return "Neither";
            
            //testing every (4) strings to be valid
            for(String s:sp){
                
                //System.out.println("yes 2 "+s);
                
                if(s.chars().allMatch( Character::isDigit ) && ((Integer.parseInt(s)>255) || (Integer.parseInt(s)<0)) )
                    return "Neither";
                
                int l=s.length();
                
                if(l>1 && s.charAt(0)=='0')
                    return "Neither";
                
                for(char i:s.toCharArray()){
                    if(!Character.isDigit(i))
                        return "Neither";
                }
                
                
                
            }
            
            return "IPv4";
            
        }
        
        else if(IP.contains(":")){
            
            //condition for IPv6
            //similar to IPv4
            
            int count=0;
            
            for(char c:IP.toCharArray())
                if(c==':')
                    count++;
            
            if(count!=7)
                return "Neither";
            
            String sp[]=IP.split("\\:");
            
            for(String v:sp)
                if(v.isEmpty())
                    return "Neither";
            
            if(sp.length!=8)
                return "Neither";
            
            for(String s:sp){
                
                if(s.length()>4 || s.length()==0)
                    return "Neither";
                
                for(char i:s.toCharArray()){
                    
                    if(!Character.isDigit(i) && !( (i>=97 && i<=102) || (i>=65 && i<=70) ))
                        return "Neither";
                    
                }
                
            }
            
            return "IPv6";
            
        }
        
        else
            return "Neither";
        
    }
}