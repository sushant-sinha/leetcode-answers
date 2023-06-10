class Solution {
    public boolean isFascinating(int n) {
        
        boolean ar[]=new boolean[10];
        
        String temp= n+""+(n*2)+(n*3);
        
        if(temp.length()>9)
            return false;
        
        // System.out.println((int)'1');
        
        for(char c: temp.toCharArray()){
            // System.out.println(c-'1'+1);
            ar[c-'1'+1]=!ar[c-'1'+1];
        }
        
        return ar[1] && ar[2] && ar[3] && ar[4] && ar[5] && ar[6] && ar[7] && ar[8] && ar[9];
        
    }
}