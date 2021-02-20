// SUSHANT SINHA

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
