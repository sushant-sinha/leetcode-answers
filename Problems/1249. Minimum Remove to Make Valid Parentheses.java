class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuffer ans=new StringBuffer();

        int counter=0;

        for(int i=0;i<s.length();i++){

            if(Character.isLowerCase(s.charAt(i))){
                ans.append(s.charAt(i));
                continue;
            }

            if(s.charAt(i)=='('){

                if(counter<=0){
                    counter=1;
                }
                else{
                    counter++;
                }

                ans.append(s.charAt(i));
                
            }
            else{
                if(counter<=0){
                    continue;
                }
                if(counter>0){
                    ans.append(s.charAt(i));
                    counter--;
                }
            }

        }

        // System.out.println(ans);

        if(counter>0){
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