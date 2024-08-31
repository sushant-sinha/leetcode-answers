class Solution {
    public int chalkReplacer(int[] chalk, int k) {

        long sum=0;

        for(int i: chalk)
            sum+=i;

        long remainder=k%sum;

        for(int i=0;i<chalk.length;i++){

            // System.out.println("current remainder = "+remainder+ " chalk[i] "+chalk[i]);
            if(remainder<chalk[i]){
                return i;
            }

            else
                remainder-=chalk[i];
        }

        return 0;
        
    }
}