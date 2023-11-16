class Solution {
    public String findDifferentBinaryString(String[] nums) {

        HashSet<Integer> seen = new HashSet<>();

        int lenOfString=nums[0].length();

        for(String s: nums){
            seen.add(stringToInt(s, lenOfString));
        }

        int max=findMaxInt(lenOfString);

        for(int i=0;i<=max;i++){

            if(!seen.contains(i)){
                // System.out.println("not seen for i="+i);

                StringBuffer sb=new StringBuffer();
                while(i!=0){
                    sb.append(i%2);
                    i/=2;
                }

                int lenDiff=lenOfString-sb.length();

                while(lenDiff>0){
                    sb.append('0');
                    lenDiff--;
                }

                return sb.reverse().toString();
            }

        }

        // flow will never reach here
        return "";
        
    }

    int stringToInt(String s, int len){

        int ans=0;

        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)=='1')
                ans+=(int)Math.pow(2,len-1-i);
        }

        return ans;
    }

    int findMaxInt(int len){

        int ans=0;

        while(len!=0){
            ans+=(int)Math.pow(2,len-1);
            len--;
        }
        
        return ans;

    }
}