// SUSHANT SINHA

// 16th November 2022 solution
// 0ms ( 100% ) 40.9mb ( 44.02% )

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return       -1 if num is higher than the picked number
 *                1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int low=1;
        int high=n;
        
        int temp=(high-low+1)/2;
        // System.out.println(low+" "+high+" "+temp);
        
        int get=guess(temp);
        
        while(get!=0){
            
            if(get==1){
                low=temp+1;
            }
            
            else if(get==-1){
                high=temp-1;
            }
            
            temp=low+(high-low)/2;
            get=guess(temp);
            
            // System.out.println(low+" "+high+" "+temp+" "+get);
            
        }
        
        return temp;
        
    }
}

// old solution and the binary search solution (there is also one ternary seach solution which solves this in O(log3n) time.... see the solution section for this solution)

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