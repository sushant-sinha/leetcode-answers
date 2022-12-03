// SUSHANT SINHA

// 0ms ( 100% ) 40mb ( 70.00% )

class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        
        return help(event1, event2) || help(event2, event1);
        
    }
    
    static boolean help(String[] e1, String[] e2){
        
        // if e2 ka start is in between e1 ka start and end
        // if e2 ka end is in between e1 ka start and end 
        
        // System.out.println("start "+(e1[0].compareTo(e2[0])<=0 && e1[1].compareTo(e2[0])>=0));
        // System.out.println("end "+(e1[1].compareTo(e2[1])>=0 && e1[0].compareTo(e2[1])<=0));
        
        if((e1[0].compareTo(e2[0])<=0 && e1[1].compareTo(e2[0])>=0)
           || (e1[1].compareTo(e2[1])>=0 && e1[0].compareTo(e2[1])<=0))
            return true;
        
        return false;
        
    }
}