// SUSHANT SINHA

// 29ms ( 72.20% ) 71.6mb ( 12.64% )

class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {

        int largestM=0, largestP=0, largestG=0;

        int len=garbage.length;

        for(int i=len-1;i>=0;i--){

            if(largestM==0 && garbage[i].contains("M"))
                largestM=i;

            if(largestP==0 && garbage[i].contains("P"))
                largestP=i;
            
            if(largestG==0 && garbage[i].contains("G"))
                largestG=i;

            if(largestM!=0 && largestP!=0 && largestG!=0)
                break;

        }

        // System.out.println(largestM+" "+largestP+" "+largestG);

        int M=0, P=0, G=0;

        for(int i=0;i<len-1;i++){

            // int tempM=0, tempP=0, tempG=0,
            int trav=travel[i];

            for(char c:garbage[i].toCharArray()){
                if(c=='M'){
                    M++;
                }
                else if(c=='P'){
                    P++;
                }
                else if(c=='G'){
                    G++;
                }
            }

            if(i<largestM){
                M+=trav;
            }
            if(i<largestP){
                P+=trav;
            }
            if(i<largestG){
                G+=trav;
            }

            // System.out.println(i+ " temp="+" "+M+" "+P+" "+G);

        }

        // System.out.println(M+" "+P+" "+G);

        if(largestM==len-1){
            // M+=travel[travel.length-1];
            for(char c:garbage[len-1].toCharArray()){
                if(c=='M'){
                    M++;
                }
            }
        }

        if(largestP==len-1){
            // P+=travel[travel.length-1];
            for(char c:garbage[len-1].toCharArray()){
                if(c=='P'){
                    P++;
                }
            }
        }

        if(largestG==len-1){
            // G+=travel[travel.length-1];
            for(char c:garbage[len-1].toCharArray()){
                if(c=='G'){
                    G++;
                }
            }
        }

        return M+P+G;
        
    }
}