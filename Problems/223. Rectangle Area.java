// SUSHANT SINHA

// 5ms ( 51.55% ) 42.4mb ( 80.00% )

class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
        // finding the length and width of the common area of the two rectangles
        
        // intuition
        
        // find the maximum of the left most corners
        // find minimum of the right most corners
        
        //subtract the above two values to get the breadth of the rectangle
        
        int length=Math.min(bx2,ax2)-Math.max(ax1,bx1);
        
        // find the maximum of the left most corners
        // find minimum of the right most corners
        
        // subtract the two to get the height of the rectangle
        
        int breadth=Math.min(by2,ay2)-Math.max(ay1,by1);
        
        // checking whether there is a valid overlap or not
        // if either of the length or the breadth is a negative value...
        
        // this means that second rectangle(B)'s leftmost edge is ahead of the rightmost edge of the first rectangle(A)
        
        // this means that second rectangle(B)'s bottomost edge is above the topmost edge of the first rectangle(A)
        
        // this works for vice-versa of rectangles (all the calculations)
        
        if(length>0 && breadth>0)
            return ((ax2-ax1)*(ay2-ay1))+((bx2-bx1)*(by2-by1))-(length*breadth);
        
        return ((ax2-ax1)*(ay2-ay1))+((bx2-bx1)*(by2-by1));
        
    }
}