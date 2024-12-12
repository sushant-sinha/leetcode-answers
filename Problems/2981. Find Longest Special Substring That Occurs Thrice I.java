// SUSHANT SINHA

// 57ms ( 7.57% ) 45.27MB ( 34.36% )

class Solution {
    public int maximumLength(String s) {

        HashMap<String, Integer> map=new HashMap<>();

        // hash all the special strings
        // no need to check if all the strings are special again if it belongs to this set
        HashSet<String> special=new HashSet<>();
        
        for(int size=1;size<=s.length();size++){
            // generating all substrings of different sizes and hashing it

            // System.out.println("coming in for size="+size);
            for(int i=0;i<=s.length()-size;i++){
                String sub=s.substring(i, i+size);

                // check if sub is special

                boolean subIsSpecial = special.contains(sub) || checkIfSpecial(sub);

                if(subIsSpecial){

                    special.add(sub);

                    if(map.containsKey(sub))
                        map.put(sub, map.get(sub)+1);

                    else
                        map.put(sub, 1);
                }
            }
        }

        String ans="";

        for(Map.Entry<String, Integer> e: map.entrySet()){
            
            if(e.getValue()>=3)
                ans = ans.length() > e.getKey().length() ? ans : e.getKey();
        }

        return ans.length()==0 ? -1 : ans.length();
        
    }

    boolean checkIfSpecial(String s){

        char firstChar=s.charAt(0);

        for(char c: s.toCharArray())
            if(c!=firstChar)
                return false;

        return true;
    }
}