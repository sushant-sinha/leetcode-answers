// SUSHANT SINHA

class Solution {
    public int maxNumberOfBalloons(String text) {
        
        int ar[]=new int[5];
        
        for(char x:text.toCharArray()){
            
            switch(x){
                case 'b':
                    ar[0]++;break;
                case 'a':
                    ar[1]++;break;
                case 'l':
                    ar[2]++;break;
                case 'o':
                    ar[3]++;break;
                case 'n':
                    ar[4]++;break;
            }
            
        }
        
        ar[2]/=2;
        ar[3]/=2;
        
        Arrays.sort(ar);
        
        return ar[0];
        
    }
}