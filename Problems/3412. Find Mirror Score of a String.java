class Solution {
    public long calculateScore(String s) {
        long ans=0;
        // creating a HashMap, maps the character with the position
        HashMap<Character, TreeSet<Integer>> pos=new HashMap<>();

        // for (char c = 'a'; c <= 'z'; c++) {
        //     System.out.println(mirrorGivenChar(c));
        // }

        //can you see the code?
        // it just got accepted, you want to dry run it?
        // oh nice you solved it

        for(int i=0;i<s.length();i++){

            char mirrored=mirrorGivenChar(s.charAt(i));

            if(pos.containsKey(mirrored)){
                // get the closest index, will be the largest value in the set
                TreeSet<Integer> temp=pos.get(mirrored);
                int j=temp.last();
                ans+=i-j;
                temp.remove(j);

                if(temp.size()==0)
                    pos.remove(mirrored);
            }

            else{
                TreeSet<Integer> temp;
                if(pos.containsKey(s.charAt(i)))
                    temp=pos.get(s.charAt(i));
                    

                else
                    temp=new TreeSet<>();
                
                temp.add(i);

                pos.put(s.charAt(i), temp);
            }
        }
        return ans;
    }       
    char mirrorGivenChar(char c){
        // if the given string falls in the first half of the char list
        if(c>='m')
            c=(char) ((int)'m'-(int)c+(int)'n');          
        
        // falls in the second half
        else
           c=(char)((int)'z'-(int)c+(int)'a');
  

      return c;
      

      }
}