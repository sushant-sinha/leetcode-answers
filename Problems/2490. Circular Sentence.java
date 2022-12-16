// SUSHANT SINHA

// 1ms ( 99.91% ) 41.2mb ( 83.27% )

class Solution {
    public boolean isCircularSentence(String sentence) {

        String ar[]=sentence.split(" ");

        if(ar.length==1){
            return sentence.charAt(0)==sentence.charAt(sentence.length()-1);
        }

        for(int i=0;i<ar.length-1;i++){

            if( ar[i].charAt(ar[i].length()-1) != ar[i+1].charAt(0)){
                return false;
            }

        }

        if(ar[0].charAt(0) != ar[ar.length-1].charAt(ar[ar.length-1].length()-1)){
            return false;
        }

        return true;
        
    }
}