// SUSHANT SINHA

// donno the point of this question

// 1ms ( 100% ) 42.2mb ( 40.00% )

class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        // checking who came after
        
        int acomeday=Integer.parseInt(arriveAlice.split("-")[1]);
        int acomemonth=Integer.parseInt(arriveAlice.split("-")[0]);;
        
        int aleaveday=Integer.parseInt(leaveAlice.split("-")[1]);
        int aleavemonth=Integer.parseInt(leaveAlice.split("-")[0]);
        
        int bcomeday=Integer.parseInt(arriveBob.split("-")[1]);
        int bcomemonth=Integer.parseInt(arriveBob.split("-")[0]);
        
        int bleaveday=Integer.parseInt(leaveBob.split("-")[1]);
        int bleavemonth=Integer.parseInt(leaveBob.split("-")[0]);
        
        int comeday;
        int comemonth;
        int goday;
        int gomonth;
        
        if(acomemonth>bcomemonth){
            comemonth=acomemonth;
            comeday=acomeday;
        }
        
        else if(acomemonth<bcomemonth){
            comemonth=bcomemonth;
            comeday=bcomeday;
        }
        
        else{
            comemonth=acomemonth;
            comeday=bcomeday>acomeday ? bcomeday : acomeday;;
        }
        
        // checking who left first
        
        if(aleavemonth<bleavemonth){
            gomonth=aleavemonth;
            goday=aleaveday;
        }
        
        else if(aleavemonth>bleavemonth){
            gomonth=bleavemonth;
            goday=bleaveday;
        }
        
        else{
            gomonth=aleavemonth;
            goday=bleaveday<aleaveday ? bleaveday : aleaveday;;
        }
        
        // System.out.println("c day="+comeday+" c month="+comemonth+" g day="+goday+" g month="+gomonth);
        
        int day[]=new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int ans=0;
        
        if(gomonth==comemonth && goday-comeday+1>0)
            return goday-comeday+1;
        
        else{
            
            for(int i=comemonth;i<=gomonth;i++){
                ans+=day[i];
            }
            
            ans-=comeday;
            ans-=(day[gomonth]-goday);
            
            if(ans<0)
                return 0;
            
        }
            
        
        return ans+1;
        
    }
}