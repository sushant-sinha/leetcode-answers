class Solution {
    public String minWindow(String s, String t) {

        if(t.length()>s.length())
            return "";

        // or maybe use a hashmap for frequencies of the characters
        int low[]=new int[26];
        int up[]=new int[26];

        for(char c:t.toCharArray()){
            if(Character.isLowerCase(c))
                low[c-'a']++;
            else
                up[c-'A']++;
        }

        String ans=s;
        boolean flag=false;

        boolean satisfied=false;

        int curLow[]=new int[26];
        int curUp[]=new int[26];

        int i=0, j=0;

        for(;i<s.length();i++){

            satisfied=isSame(low, up, curLow, curUp);

            if(satisfied){
                if(j-i<=ans.length()){
                    ans=s.substring(i,j);
                }
            }
            
            // System.out.println("outer start = "+i+" end="+j+" statisfied="+satisfied);
            // System.out.println(Arrays.toString(low)+"low \n"+Arrays.toString(up)+" up \n"+Arrays.toString(curLow)+" curLow \n "+Arrays.toString(curUp)+" curUp\n");

            for(;j<s.length();j++){

                if(satisfied){
                    break;
                }

                else{

                    // System.out.println("start = "+i+" end="+j);
                    
                    char c=s.charAt(j);
                    
                    if(Character.isLowerCase(c)){
                        curLow[c-'a']++;
                    }

                    else{
                        curUp[c-'A']++;
                    }

                    // System.out.println(Arrays.toString(low)+"low \n"+Arrays.toString(up)+" up \n"+Arrays.toString(curLow)+" curLow \n "+Arrays.toString(curUp)+" curUp\n");

                    if(isSame(low, up, curLow, curUp)){
                        satisfied=true;
                        ++j;
                        if(j-i<=ans.length()){
                            flag=true;
                            ans=s.substring(i,j);
                        }
                        break;
                    }

                }

            }

            if(Character.isLowerCase(s.charAt(i))){
                curLow[s.charAt(i)-'a']--;
            }
            else{
                curUp[s.charAt(i)-'A']--;
            }
        }



        return flag ? ans : "";
        
    }

    boolean isSame(int[] low, int[] up, int[] curLow, int[] curUp){

        for(int i=0;i<26;i++){

            if(low[i]>curLow[i] || up[i]>curUp[i])
                return false;
        }

        return true;
    }
}