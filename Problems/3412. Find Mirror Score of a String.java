// use of stack was suggested by @chromaa
// we were trying the new collaboration feature which was absolute bs

class Solution {
    public long calculateScore(String s) {
        long ans=0;
        // creating a HashMap, maps the character with the position
        HashMap<Character, Stack<Integer>> pos=new HashMap<>();

        char ar[]=new char[26];
        for(int i=25;i>=0;i--){
            ar[25-i]=(char)((int)'a'+i);

            pos.put((char)((int)'a'+i), new Stack<Integer>());
        }

        // for (char c = 'a'; c <= 'z'; c++) {
        //     System.out.println(mirrorGivenChar(c));
        // }

        //can you see the code?
        // it just got accepted, you want to dry run it?
        // oh nice you solved it

        for(int i=0;i<s.length();i++){

            // char mirrored=mirrorGivenChar(s.charAt(i));
            char mirrored=ar[s.charAt(i)-'a'];
            Stack<Integer> temp=pos.get(mirrored);

            if(temp.size()>0){
                // get the closest index, will be the largest value in the set
                // Stack<Integer> temp=pos.get(mirrored);
                int j=temp.pop();
                ans+=i-j;
                // temp.remove(j);

                // if(temp.size()==0)
                //     pos.remove(mirrored);
            }

            else{
                Stack<Integer> original=pos.get(s.charAt(i));
                original.push(i);
                pos.put(s.charAt(i), original);
            }

            // else{
            //     Stack<Integer> temp;
            //     if(pos.containsKey(s.charAt(i)))
            //         temp=pos.get(s.charAt(i));
                    

            //     else
            //         temp=new Stack<>();
                
            //     temp.push(i);

            //     pos.put(s.charAt(i), temp);
            // }
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