class Solution {

    int min=Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {

        Arrays.sort(cookies);
        final int len=cookies.length;

        if(cookies.length==k)
        return cookies[len-1];

        int status[]=new int[k];

        recur(cookies, 0, k, len, status);
        
        return min;
        
    }

    void recur(int[] cookie, int index, int k, int len, int status[]){

        if(index==len){
            // System.out.println("reached"+Arrays.toString(status));
            findMax(status);
            return;
        }

        for(int i=0;i<k;i++){
            // for(int j=index;j<len;j++){

                int temp[]=status.clone();
                temp[i]+=cookie[index];
                // System.out.println("going in function="+Arrays.toString(temp)+" index="+index+" i="+i);
                recur(cookie, index+1, k, len, temp);
                
            // }
        }

    }

    void findMax(int status[]){

        // System.out.println(Arrays.toString(status));

        Arrays.sort(status);

        if(status[0]==0)
        return;

        else
        min = min>status[status.length-1] ? status[status.length-1] : min;

    }

}