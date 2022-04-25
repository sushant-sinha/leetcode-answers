/*

class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        
        List<List<Integer>> ans= new ArrayList<>();
        
        for(int i=0;i<words.length-1;i++){
            
            ArrayList<Integer> temp;
            
            for(int j=i+1;j<words.length;j++){
                
                if(isCombPal(words[i],words[j])){
                    temp=new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    ans.add(temp);
                }
                
                
                
                if(isCombPal(words[j],words[i])){
                    temp=new ArrayList<>();
                    temp.add(j);
                    temp.add(i);
                    ans.add(temp);
                }
                
                
            }
        }
        
        return ans;
        
    }
    
    boolean isCombPal(String s, String t){
        
        StringBuffer sbuff=new StringBuffer();
        
        sbuff.append(s);sbuff.append(t);
        
//         StringBuffer temp=sbuff.reverse();
        
//         if(temp.equals(sbuff))
//             return true;
        
//         return false;
        
        String temp=sbuff.toString();
        
        for(int i=0;i<temp.length()/2;i++){
            
            if(temp.charAt(i)!=temp.charAt(temp.length()-1-i))
                return false;
            
        }
        
        return true;
        
    }
}

// from: https://dev.to/seanpgallivan/solution-palindrome-pairs-23j6

*/

class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        Map<String, Integer> wmap = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++)
            wmap.put(words[i], i);
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) {
                for (int j = 0; j < words.length; j++) {
                    String w = words[j];
                    if (isPal(w, 0, w.length()-1) && j != i) {
                        ans.add(List.of(i, j));
                        ans.add(List.of(j, i));
                    }
                }
                continue;
            }
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();
            String bw = sb.toString();
            if (wmap.containsKey(bw)) {
                int res = wmap.get(bw);
                if (res != i) ans.add(List.of(i, res));
            }
            for (int j = 1; j < bw.length(); j++) {
                if (isPal(bw, 0, j-1)) {
                    String s = bw.substring(j);
                    if (wmap.containsKey(s))
                        ans.add(List.of(i, wmap.get(s)));
                }
                if (isPal(bw, j, bw.length()-1)) {
                    String s = bw.substring(0,j);
                    if (wmap.containsKey(s))
                        ans.add(List.of(wmap.get(s), i));
                }
            }
        }
        return ans;
    }

    private boolean isPal(String word, int i, int j) {
        while (i < j)
            if (word.charAt(i++) != word.charAt(j--)) return false;
        return true;
    }
}