// SUSHANT SINHA


// 0ms 36.2mb ( 64.54% )

/*

Approach #1: Check Position [Accepted]
Intuition

If the rectangles do not overlap, then rec1 must either be higher, lower, to the left, or to the right of rec2.

Algorithm

The answer for whether they don't overlap is LEFT OR RIGHT OR UP OR DOWN, where OR is the logical OR, and LEFT is a boolean that represents whether rec1 is to the left of rec2. The answer for whether they do overlap is the negation of this.

The condition "rec1 is to the left of rec2" is rec1[2] <= rec2[0], that is the right-most x-coordinate of rec1 is left of the left-most x-coordinate of rec2. The other cases are similar.

Note: we should also check if either of the rectangle is actually a line. If this is the case, then we cannot have any positive overlapping according to the definition.

*/

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // check if either rectangle is actually a line
        if (rec1[0] == rec1[2] || rec1[1] == rec1[3] ||
            rec2[0] == rec2[2] || rec2[1] == rec2[3]) {
            // the line cannot have positive overlap
            return false;
        }

        return !(rec1[2] <= rec2[0] ||   // left
                 rec1[3] <= rec2[1] ||   // bottom
                 rec1[0] >= rec2[2] ||   // right
                 rec1[1] >= rec2[3]);    // top
    }
}