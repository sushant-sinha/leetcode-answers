// SUSHANT SINHA

// 44ms ( 90.66% ) 45.33mb ( 86.35% )

/*

    Found a good way of comparing intervals and identifying iverlaps:

    Math.max(start, event[0]) < Math.min(end, event[1])
    
    The maximum of the start of the two events must be smaller than the minimum of the end of two events.

    This condition ensure all 3 cases (there are actually 6 cases, the other 3 are when the newer event is replace by the older event and vice-versa):
    1) when the start of the new event is after the start of the older event(), and the end of the older event is after the start of the newer event. But, the end of the newer event is after the end of the older event.
    example:

    old: [10,20]
    new: [12,24]

    2) when the end of the new event is after the start of the older event, and the start of the newer event is before the start of the older event. But, the end of the older event is after the end of the newer event.

    example:

    old: [10,20]
    new: [8,13]

    3) when the new event is completely engulfed by the older event

    example:

    old: [10,20]
    new: [12,15]

*/



class MyCalendarTwo {

    // all the new events are going to be added to this list.
    // but, as soon as we see
    List<int[]> singleBook;
    
    // List to store the timeframes that are being double booked.
    // we will make sure that the new event isn't falling in this timeframe. This will ensure that we don't have any tripple bookings.
    List<int[]> doubleBook;

    public MyCalendarTwo() {
        singleBook = new ArrayList<>();
        doubleBook = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {

        // not efficient implementation, traversing the entire list everytime
        // took from solutions

        // Check if the new booking overlaps with any double-booked intervals
        for (int[] event : doubleBook) {
            if (Math.max(start, event[0]) < Math.min(end, event[1])) {
                return false;  // Triple booking would happen, reject the booking
            }
        }

        // Check for overlaps with single bookings and store double bookings
        for (int[] event : singleBook) {
            if (Math.max(start, event[0]) < Math.min(end, event[1])) {
                // Store the overlapping part as a new double booking
                doubleBook.add(new int[]{Math.max(start, event[0]), Math.min(end, event[1])});
            }
        }

        // Add the new booking to single bookings
        singleBook.add(new int[]{start, end});
        return true;
    }
}