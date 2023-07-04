class Solution {
    public boolean buddyStrings(String s, String goal) {

        if(s.length()!=goal.length())
        return false;

        if(s.equals(goal)){

            // check if two characters at different indexes are same
            // else false

            if(s.length()>26)
                return true;

            int freq[]=new int[26];

            for(char c:s.toCharArray()){
                freq[c-'a']++;

                if(freq[c-'a']==2)
                    return true;
            }

            return false;

        }

        else{

            int toFind=0;
            char fromS=' ', fromGoal=' ';

            for(int i=0;i<s.length();i++){

                if(s.charAt(i)!=goal.charAt(i)){
                    
                    if(toFind==0){
                        
                        fromS=s.charAt(i);
                        fromGoal=goal.charAt(i);
                        toFind++;

                    }

                    else if(toFind==1){
                        if(s.charAt(i)==fromGoal && goal.charAt(i)==fromS){
                            toFind++;
                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        return false;
                    }
                }

            }

            // no second part of swap found and the entire string is traversed.... return false
            
            return toFind==2;

        }
        
    }
}