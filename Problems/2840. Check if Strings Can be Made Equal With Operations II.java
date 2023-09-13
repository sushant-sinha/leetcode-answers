// SUSHANT SINHA

// 221ms ( 11.72% ) 52mb ( 7.51% )

class Solution {
    public boolean checkStrings(String s1, String s2) {
        
        int n=s1.length();

        char ar1[]=new char[n];
        HashMap<Character, ArrayList<Integer>> mapeven=new HashMap<>();
        HashMap<Character, ArrayList<Integer>> mapodd=new HashMap<>();
        
        // frequency checker array
        int freq[]=new int[26];
        
        // for even indices
        for(int i=0;i<n;i+=2){
            
            ArrayList<Integer> temp;
            
            ar1[i]=s1.charAt(i);
            freq[s1.charAt(i)-'a']++;
            
            if(mapeven.containsKey(s2.charAt(i))){
                temp=mapeven.get(s2.charAt(i));
                temp.add(i);
                mapeven.put(s2.charAt(i), temp);
            }
            
            else{
                temp=new ArrayList<>();
                temp.add(i);
                mapeven.put(s2.charAt(i), temp);
            }
            
            freq[s2.charAt(i)-'a']--;
        }

        for(int i=1;i<n;i+=2){
            
            ArrayList<Integer> temp;
            
            ar1[i]=s1.charAt(i);
            freq[s1.charAt(i)-'a']++;
            
            if(mapodd.containsKey(s2.charAt(i))){
                temp=mapodd.get(s2.charAt(i));
                temp.add(i);
                mapodd.put(s2.charAt(i), temp);
            }
            
            else{
                temp=new ArrayList<>();
                temp.add(i);
                mapodd.put(s2.charAt(i), temp);
            }
            
            freq[s2.charAt(i)-'a']--;
        }
        
        for(int i:freq)
            if(i!=0)
                return false;
        
        for(int i=0;i<n;i+=2){
            
            if(mapeven.containsKey(ar1[i])){
                ArrayList<Integer> temp = mapeven.get(ar1[i]);
                temp.remove(0);
                if(temp.size()==0)
                    mapeven.remove(ar1[i]);
                else
                    mapeven.put(ar1[i], temp);
            }
            
            else
                return false;
            
        }

        for(int i=1;i<n;i+=2){
            
            if(mapodd.containsKey(ar1[i])){
                ArrayList<Integer> temp= mapodd.get(ar1[i]);
                temp.remove(0);
                if(temp.size()==0)
                    mapodd.remove(ar1[i]);
                else
                    mapodd.put(ar1[i], temp);
            }
            
            else
                return false;
            
        }
        
        // for(Map.Entry<Character, ArrayList<Integer>> e: map.entrySet())
        //     System.out.println(e.getValue());
        
        return true;
        
    }
}