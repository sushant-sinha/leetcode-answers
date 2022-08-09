// SUSHANT SINHA

// this is the brute force approach

// see the solution section for a more optimized solution which uses a balanced tree
// https://leetcode.com/problems/my-calendar-i/solution/

// 109ms ( 22.96% ) 42.9mb ( 94.90% )

class MyCalendar {

    // using an arraylist to keep the tack of the slots that have been booked already
    List<int[]> calendar;
    
    public MyCalendar() {
        calendar=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        
        for(int i[]: calendar){
            
            // if either the start date or the end date is inside the already booked slot
            
            if((start<i[1] && start>=i[0]) || (end>i[0] && end<=i[1]))
                return false;
            
            // if the new slot is entirely engulfing the already booked slot

            if(start<=i[0] && end>=i[1])
                return false;
            
        }
        
        // if their is no clash in the slots... then we will add this slot to the calendar and return true

        calendar.add(new int[]{start, end});
        return true;
        
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */