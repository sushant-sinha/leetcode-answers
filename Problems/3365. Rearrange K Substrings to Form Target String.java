class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {

        if(k==1){
            return s.equals(t);
        }

        HashMap<String, Integer> map=new HashMap<>();

        int lenOfEachSub=s.length()/k;

        // System.out.println("len="+lenOfEachSub);

        for(int i=0;i<s.length();){

            // System.out.println("i="+i +" len+i="+(i+lenOfEachSub));
            String sub=s.substring(i, i+lenOfEachSub);

            if(map.containsKey(sub)){
                map.put(sub, map.get(sub)+ 1);
            }

            else{
                map.put(sub, 1);
            }

            i+=lenOfEachSub;

            

        }

        for(int j=0;j<t.length();){

            String sub=t.substring(j, j+lenOfEachSub);

            if(map.containsKey(sub)){
                if(map.get(sub)==1)
                    map.remove(sub);
                
                else
                    map.put(sub, map.get(sub)-1);
            }

            else
                return false;

            j+=lenOfEachSub;

        }

        return true;
        
    }

    // int generateHash
}