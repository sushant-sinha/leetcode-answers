// SUSHANT SINHA


/*
    Given a set of range, if we divide the number sequence into two halves.
    If the number is in range of the first half, we discard the rest half.
    Repeat it untill we get three numbers x-1 (x) x+1 .... here the mid is the answer and thus returned.

*/

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
    int low=1; // Sequence starting from 1
    int high=n;
 
    while(low <= high){
        int mid = low+((high-low)/2);
        int result = guess(mid);
        if(result==0){
            return mid;
        }else if(result==1){
            low = mid+1;
        }else{
            high=mid-1;
        }
        
        // instead of last else we can use else if(result == -1){high=mid-1}
    }
 
    return -1;
}
}