class Solution {
    public int findMinDifference(List<String> timePoints) {

        int allMins[]=new int[timePoints.size()];

        int index=0;

        for(String s: timePoints){
            allMins[index++]=stringToMinutes(s);
        }

        Arrays.sort(allMins);

        index=0;

        int ans=1441;

        for(;index<timePoints.size()-1;index++){
            ans=Math.min(allMins[index+1]-allMins[index], ans);
        }

        return Math.min(ans, 1440-(allMins[index]-allMins[0]));
        
    }

    int stringToMinutes(String time){

        String split[]=time.split(":");

        int ans=0;

        
            ans+=(Integer.parseInt(split[0]))*60;
            ans+=Integer.parseInt(split[1]);
        

        return ans;
    }
}

/*

class Solution {
    public int findMinDifference(List<String> timePoints) {

        TreeSet<Integer> minutes=new TreeSet<>();

        int ans=Integer.MAX_VALUE;

        for(String s: timePoints){

            int strToMin=stringToMinutes(s);

            if(minutes.contains(strToMin))
                return 0;
            
            else{

                if(minutes.floor(strToMin)!=null){

                    System.out.println("lower="+minutes.floor(strToMin)+ " cur="+strToMin);
                    
                    int diff=diffCalculator(strToMin, minutes.floor(strToMin));

                    System.out.println(diff);

                    ans=Math.min(ans, diff);
                }

                if(minutes.ceiling(strToMin)!=null){

                    System.out.println("upper="+minutes.ceiling(strToMin)+ " cur="+strToMin);

                    int diff=diffCalculator(minutes.ceiling(strToMin), strToMin);

                    System.out.println(diff);

                    ans=Math.min(ans, diff);
                }

                // int lowerTime=minutes.floor(strToMin), upperTime=minutes.ceiling(strToMin);

                // ans=Math.min(Math.abs(strToMin-lowerTime), ans);
                // ans=Math.min(Math.abs(strToMin-upperTime), ans);

                minutes.add(strToMin);

            }
        }

        return ans;
        
    }

    int diffCalculator(int big, int small){

        return Math.min(Math.abs(big-small-1440), Math.abs(small-big));

    }

    int stringToMinutes(String time){

        String split[]=time.split(":");

        int ans=0, hour=Integer.parseInt(split[0]), minutes=Integer.parseInt(split[1]);

        if(hour==0){
            return minutes;
        }

        else{
            ans+=(23-Integer.parseInt(split[0]))*60;
            ans+=60-Integer.parseInt(split[1]);
        }

        return ans;
    }
}

*/