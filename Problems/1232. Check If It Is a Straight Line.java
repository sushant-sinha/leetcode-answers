// SUSHANT SINHA

// 0ms ( 100% ) 42.8mb ( 89.18% )

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        float slope;

        // try{
        if(coordinates[0][1]>coordinates[1][1]){
            slope=(float)(coordinates[0][1]-coordinates[1][1])/(coordinates[0][0]-coordinates[1][0]);
        }

        else{
            slope=(float)(coordinates[1][1]-coordinates[0][1])/(coordinates[1][0]-coordinates[0][0]);
        }

        // }

        // catch(Exception e){
        //     slope=Integer.MAX_VALUE;
        // }

        // System.out.println(slope);

        // float tempSlope;

        for(int i=2; i<coordinates.length; i++){

            if(coordinates[i][1]>coordinates[0][1]){

                // if(coordinates[i][0]-coordinates[0][0]==0){
                    
                //     if(slope==Integer.MAX_VALUE)
                //     continue;
                    
                //     else
                //     return false;
                // }

                float tempSlope=(float)(coordinates[i][1]-coordinates[0][1])/(coordinates[i][0]-coordinates[0][0]);

                // System.out.println("Inside if");
                // System.out.println("for "+coordinates[i][0]+","+coordinates[i][1]+" tempSlope="+tempSlope+" og slope="+slope);

                if(slope!=tempSlope)
                    return false;

            }

            else{

                // if(coordinates[i][0]-coordinates[0][0]==0){
                    
                //     if(slope==Integer.MAX_VALUE)
                //     continue;
                    
                //     else
                //     return false;
                // }

                float tempSlope=(float)(coordinates[0][1]-coordinates[i][1])/(coordinates[0][0]-coordinates[i][0]);

                // System.out.println("Inside else");
                // System.out.println("for "+coordinates[i][0]+","+coordinates[i][1]+" tempSlope="+tempSlope+" og slope="+slope);

                if(slope!=tempSlope)
                    return false;

            }


        }

        return true;
        
    }
}