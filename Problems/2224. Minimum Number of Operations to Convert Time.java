// SUSHANT SINHA

// 1ms ( 100% ) 40.1mb ( 100% )
// could have reduced the use of superfluous variables 

class Solution {
    public int convertTime(String current, String correct) {
        
        int timeCurrent=convertToMinutes(current);
        int timeCorrect=convertToMinutes(correct);
        
        int diff=Math.abs(timeCurrent-timeCorrect);
        
        int ans=0;
        
        while(diff!=0){
            
            if(diff>=60)
                diff-=60;
            
            else if(diff>=15)
                diff-=15;
            
            else if(diff>=5)
                diff-=5;
            
            else if(diff>=1)
                diff-=1;
            
            ans++;
        }
        
        return ans;
        
        
    }
    
    int convertToMinutes(String s){
        
        int hour=Integer.parseInt(s.substring(0,2))*60;
        int min=Integer.parseInt(s.substring(3,5));
        
        return hour+min;
        
    }
}