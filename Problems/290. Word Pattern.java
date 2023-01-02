class Solution {
    public boolean wordPattern(String pattern, String s) {

        // instead of using a hashmap..
        // i will use a 26 length String array

        String map[]=new String[26];
        Arrays.fill(map, "");

        String sArray[]=s.split(" ");
        int i=0;

        if(sArray.length!=pattern.length())
        return false;

        for(char c:pattern.toCharArray()){

            // checking whther this words already exists in the mapping or not
            // if it exists... then it should be for the same mapped character else return false

            for(int j=0;j<26;j++){
                // System.out.println(map[j]);
                if(map[j].equals(sArray[i]) && c!=(char)(97+j)){
                    return false;
                }
            }

            // if map already exists for a given char
            if(!map[c-'a'].equals("")){
                if(!map[c-'a'].equals(sArray[i]))
                return false;
            }
            
            // if there is no existing map
            else{
                map[c-'a']=sArray[i];
            }
            

            i++;
        }

        return true;
    }
}