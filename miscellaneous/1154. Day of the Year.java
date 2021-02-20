// SUSHANT SINHA

// took reference 
// 1ms ( 96.76% ) 36.8mb ( 98.23% )

class Solution {
    boolean isLeapYear(int num){
        return num%400==0 ? true : num%4==0 && num%100!=0;
    }
    public int dayOfYear(String date) {
     int days[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        days[1]=isLeapYear(Integer.parseInt(date.substring(0,4))) ? 29 : 28;
        int dp[]=new int[12];//also can called prefix-sum array
        dp[0]=31;
        for(int i=1;i<12;i++)
            dp[i]=dp[i-1]+days[i];
        int month=Integer.parseInt(date.substring(5,7))-1;
        int ans=Integer.parseInt(date.substring(8,10))+(month-1<0 ? 0 : dp[month-1]);
        return ans;  
    }
}

// better representation
// 2ms ( 58.11% ) 36.9mb ( 93.51% )

class Solution {
    public int dayOfYear(String date) {
        String[] temp = date.split("-");
        int[] normal = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int[] leap = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        Boolean isLeap = false;
        if (Integer.parseInt(temp[0]) % 100 == 0) {
            if (Integer.parseInt(temp[0]) % 400 == 0) {
                isLeap = true;
            }
        }
        else if (Integer.parseInt(temp[0]) % 4 == 0) {
            isLeap = true;
        }
        if (isLeap) {
            int month = Integer.parseInt(temp[1]);
            int day = Integer.parseInt(temp[2]);
            sum += day;
            for (int i = 0; i < month; i++) {
                sum += leap[i];
            }
        }
        else {
            int month = Integer.parseInt(temp[1]);
            int day = Integer.parseInt(temp[2]);
            sum += day;
            for (int i = 0; i < month; i++) {
                sum += normal[i];
            }
        }
        return sum;
    }
}