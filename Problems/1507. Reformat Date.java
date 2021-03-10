// SUSHANT SINHA

// 1 ms 37.3mb (87.08%)

class Solution {
    public String reformatDate(String date) {

        StringBuilder tempans= new StringBuilder();
        
        tempans.append(date.substring(date.length()-4,date.length()) + "-");
                
        switch(date.substring(date.length()-8,date.length()-5)){
                
            case "Jan":
                tempans.append( "01"+ "-" );
                break;
            case "Feb":
               tempans.append( "02"+ "-" );
                break;
            case "Mar":
                tempans.append("03"+ "-" );
                break;
            case "Apr":
                tempans.append( "04"+ "-" );
                break;
            case "May":
                tempans.append( "05"+ "-" );
                break;
            case "Jun":
                tempans.append( "06"+ "-" );
                break;
            case "Jul":
                tempans.append( "07"+ "-" );
                break;
            case "Aug":
                tempans.append( "08"+ "-" );
                break;
            case "Sep":
                tempans.append( "09"+ "-" );
                break;
            case "Oct":
                tempans.append( "10"+ "-" );
                break;
            case "Nov":
                tempans.append( "11"+ "-" );
                break;
            case "Dec":
                tempans.append( "12"+ "-" );
                break;
                
                
        }
        
        if(date.length()%2==0){
            tempans.append("0"+date.substring(0,1));
        }
        else
            tempans.append(date.substring(0,2));
        
        return tempans.toString();
    }
    
}