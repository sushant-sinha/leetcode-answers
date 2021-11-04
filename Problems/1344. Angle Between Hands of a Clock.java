// SUSHANT SINHA

// 0ms ( 100% ) 36mb ( 80.34% )
// using the formula directly

class Solution {
    public double angleClock(int hour, int minutes) {
        
        if(hour==12)
            return (11*(double)minutes)/2>180 ? 360-((11*(double)minutes)/2) : (11*(double)minutes)/2;
        
        //return 0;
        return Math.abs(((11*(double)minutes)/2)-(30*hour))>180 ? 360-Math.abs(((11*(double)minutes)/2)-(30*hour)) : Math.abs(((11*(double)minutes)/2)-(30*hour));
        
    }
}