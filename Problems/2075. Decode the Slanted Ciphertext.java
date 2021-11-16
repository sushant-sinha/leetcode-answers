// SUSHANT SINHA

// 41ms ( 75.62% ) 49.1mb ( 71.63% )

class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        
        //System.out.println(encodedText.length());
        
        int colcount=encodedText.length()/rows;
        
        char ar[]=encodedText.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<colcount;i++){
            for(int j=i;j<ar.length;){
                
                //System.out.println(ar[j]);
                sb.append(ar[j]);
                j+=colcount+1;
            }
        }
        // https://stackoverflow.com/questions/16974267/how-to-remove-only-trailing-spaces-of-a-string-in-java-and-keep-leading-spaces/16974310
        return sb.toString().stripTrailing();
        
    }
}