class Solution {
    
//     ArrayList<Character> vowel = new ArrayList<>();
    
//     vowel.add('a');
//     vowel.add('e');
//     vowel.add('i');
//     vowel.add('o');
//     vowel.add('u');
    
    public int countVowelSubstrings(String word) {
        
        if(word.length()<5)
            return 0;
        
        int ans=0;
        
        for(int i=0;i<word.length()-4;i++){
            
            for(int j=i+5;j<=word.length();j++){
                
                //System.out.println(word.substring(i,j));
                
                if(hasAll(word.substring(i,j))){
                    ans++;
                    //System.out.println("Done "+word.substring(i,j));
                }
                
            }
            
        }
        
        return ans;
        
    }
    
    boolean hasAll(String s){
        
        //System.out.println(s.chars().distinct().count());
        
        boolean ar[]=new boolean[5];
        
        for(int i=0;i<s.length();i++){
            
            switch(s.charAt(i)){
                    
                case 'a': ar[0]=true;
                    break;
                    
                case 'e': ar[1]=true;
                    break;
                    
                case 'i': ar[2]=true;
                    break;
                    
                case 'o': ar[3]=true;
                    break;
                    
                case 'u': ar[4]=true;
                    break;
                    
                default : return false;
                    
            }
            
        }
        
        //System.out.println(Arrays.toString(ar));
        
        for(boolean b:ar){
            if(!b)
                return false;
        }
        
        return true;
        
    }
}


// class Solution {
//     public int countVowelSubstrings(String word) {

//     int j = 0, k = 0, vow = 0, cnt = 0;

//     HashMap < Character, Integer > map = new HashMap < > ();
//     map.put('a', 0);
//     map.put('e', 0);
//     map.put('i', 0);
//     map.put('o', 0);
//     map.put('u', 0);

//     for (int i = 0; i < word.length(); ++i) {
//         if (map.get(word.charAt(i)) != null) {
//             map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
//             if ((int) map.get(word.charAt(i)) == 1) {
//                 ++vow;
//             }
//             while (vow == 5) {
//                 map.put(word.charAt(k), map.get(word.charAt(k)) - 1);
//                 if ((int) map.get(word.charAt(k)) == 0) {
//                     --vow;
//                 }
//                 k++;
//             }
//             cnt = cnt + (k - j);
//         } else {
//             map.forEach((k1, v) -> {
//                 map.put(k1, 0);
//             });
//             vow = 0;
//             j = k = i + 1;
//         }
//     }
//     return cnt;
// }
// }