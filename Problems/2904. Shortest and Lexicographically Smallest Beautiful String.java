// SUSHANT SINHA

// 7ms ( 26.79% ) 43.6mb ( 18% )

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
        TreeMap<Integer, ArrayList<StringBuffer>> map=new TreeMap<>();
        
        int strlen=s.length();
        
        for(int i=0;i<strlen;i++){
            
            int count1=0;
            int len=0;
            
            StringBuffer sb=new StringBuffer();
            
            for(int j=i;j<strlen;j++){
                
                // System.out.println("for i="+i+" j="+j);
                
                if(s.charAt(j)=='0'){
                    
                    sb.append('0');
                    len++;
                    
                }
                
                else{
                    
                    len++;
                    sb.append('1');
                    ++count1;
                    
                    if(count1==k){
                        
                        // System.out.println("adding in 1 "+sb+" "+sb.length());
                        
                        ArrayList<StringBuffer> temp;
                        
                        if(map.containsKey(len)){
                            temp=map.get(len);
                            temp.add(sb);
                            map.put(len, temp);
                        }
                        
                        else{
                            temp=new ArrayList<>();
                            temp.add(sb);
                            map.put(len, temp);
                        }
                        
                        break;
                        
                    }
                }
                
            }
            
        }
        
        if(map.size()==0)
            return "";
        
        ArrayList<StringBuffer> minLength=map.get(map.firstKey());
        
        Collections.sort(minLength);
        
        // for(Map.Entry<Integer, ArrayList<StringBuffer>> e : map.entrySet())
        //     System.out.println(e.getKey()+"   "+e.getValue());
        
        
        return minLength.get(0).toString();
    }
}