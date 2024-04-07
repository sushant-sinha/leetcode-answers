// SUSHANT SINHA

// 18ms ( 71.40% ) 45.20mb ( 81.75% )

class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuffer ans=new StringBuffer();

        // maintain opening and closing brackets by using +1 for '(' and -1 for ')'
        int counter=0;

        for(int i=0;i<s.length();i++){

            if(Character.isLowerCase(s.charAt(i))){
                ans.append(s.charAt(i));
                continue;
            }

            if(s.charAt(i)=='('){

                if(counter<=0){
                    // reset the counter as soon as we see a new opening braket after erroneous closing brackets
                    counter=1;
                }
                else{
                    counter++;
                }

                ans.append(s.charAt(i));
                
            }
            else{

                if(counter<=0){
                    // if there are already erroneous closing brackets, skip
                    continue;
                }
                if(counter>0){
                    // if this closing bracket has an opening bracket pair, add it
                    ans.append(s.charAt(i));
                    counter--;
                }
            }

        }

        // System.out.println(ans);

        if(counter>0){

            // remove extra opening brackets
            // starting from back so that the modified string's '(' lands at the correct index, else we would've have issues as after deleting characters, the index wouln't coincide correctly
            // this also ensures for maximum efficiency as the trailing index are easy to traverse.
            int index=ans.length()-1;

            while(counter>0){
                if(ans.charAt(index)=='('){
                    counter--;
                    ans.deleteCharAt(index);
                }
                index--;
            }
        }

        return ans.toString();
        
    }
}