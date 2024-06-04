class Solution {
    public String compressedString(String word) {

        int len=word.length();

        StringBuilder ans=new StringBuilder();
        
        char ar[]=word.toCharArray();

        int index=0;

        for(;index<len;){

            char cur=ar[index];
            int counter=0;

            while(index<len && ar[index]==cur && counter<9){
                counter++;
                index++;
            }

            ans.append(counter);
            ans.append(cur);
        }

        return String.valueOf(ans);
        
    }
}