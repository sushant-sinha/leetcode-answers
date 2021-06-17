// SUSHANT SINHA

// 1102ms ( 6.85% ) 52.4mb ( 19.75% )

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        for(int i=0;i<temperatures.length;i++){
            int x=0,in=0;
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j]>temperatures[i]){
                    x++;
                    in++;
                    temperatures[i]=x;
                    break;
                }
                x++;
            }
            if(in==0)
                temperatures[i]=0;
        }

        return temperatures;
        
    }
}
