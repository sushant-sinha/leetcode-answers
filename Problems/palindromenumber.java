// SUSHANT SINHA

// SLOWER METHOD

// class Solution {
//     public boolean isPalindrome(int x) {
//         if(x<0 || (x%10==0 && x!=0))return false;
//         char arr[]=Integer.toString(x).toCharArray();
//         for(int i=0;i<(arr.length/2);i++){
//             if(arr[i]!=arr[arr.length-i-1])return false;
//         }
//         return true;
//     }
// }

// FASTER METHOD

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x !=0))
            return false;
        int reverse = 0;
        while ( x > reverse){
           reverse = reverse * 10 + x % 10;
           x /=10;
        }
        return (x == reverse || x == reverse /10);
    }
}