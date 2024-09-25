// SUSHANT SINHA

// 44ms ( 90.66% ) 45.33mb ( 86.35% )

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