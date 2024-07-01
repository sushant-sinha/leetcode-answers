// SUSHANT SINHA

// 8ms ( 12.50% ) 56.82mb ( 66.08% )

class Solution {
    public int minOperations(int[] nums) {

        int flipCounter=0;

        for(int i=0;i<nums.length;i++){

            
            if((nums[i]+flipCounter)%2==1)
                continue;
                
            else
                flipCounter++;
            
        }

        return flipCounter;
        
    }
}

/*

input: [0,1,1,0,1]

flip at index 0: 1 0 0 1 0-> flipCounter: 1

flip at index 1: 1 1 1 0 1-> flipCounter: 2

flip at index 3: 1 1 1 1 0-> flipCounter: 3

flip at index 4: 1 1 1 1 1-> flipCounter: 4

*/