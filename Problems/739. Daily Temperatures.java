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

// solution using stack
// 7ms ( 95.59% ) 54.1mb ( 18.19% )

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] stack = new int[temperatures.length];
        int top = -1;
        int[] ret = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            while(top > -1 && temperatures[i] > temperatures[stack[top]]) {
                int idx = stack[top--];
                ret[idx] = i - idx;
            }
            stack[++top] = i;
        }
        return ret;
    }
}