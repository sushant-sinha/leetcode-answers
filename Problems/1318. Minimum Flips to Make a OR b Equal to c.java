class Solution {
    public int minFlips(int a, int b, int c) {

        int ans=0;

        ArrayList<Integer> abin=tobin(a);
        ArrayList<Integer> bbin=tobin(b);
        ArrayList<Integer> cbin=tobin(c);

        // System.out.println("a="+abin+" b="+bbin+" c="+cbin);

        int max=abin.size()>bbin.size() ? (abin.size()>cbin.size() ? abin.size() : cbin.size()) : (bbin.size()>cbin.size() ? bbin.size() : cbin.size());
        
        int x,y,z;

        for(int i=0;i<max;i++){
            
            x=i<abin.size() ? abin.get(i) : 0;
            y=i<bbin.size() ? bbin.get(i) : 0;
            z=i<cbin.size() ? cbin.get(i) : 0;

            if(z==0){

                if(x==1)
                ans+= y==1 ? 2 : 1;

                else
                ans+= y==1 ? 1 : 0;
            }

            else{

                if(x==0)
                ans+= y==0 ? 1 : 0; 

            }

        }

        return ans;
        
    }

    ArrayList<Integer> tobin(int a){

        ArrayList<Integer> ar=new ArrayList<>();

        while(a!=0){
            ar.add(a%2);
            a/=2;
        }

        return ar;

    }

}