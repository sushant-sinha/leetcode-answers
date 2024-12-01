class Solution {
    public int maxGoodNumber(int[] nums) {

        String[] bin=new String[3];

        bin[0]=decToBin(nums[0]);
        bin[1]=decToBin(nums[1]);
        bin[2]=decToBin(nums[2]);

        int ans=Integer.MIN_VALUE;

        ans=Math.max(ans, binToDec(bin[0]+bin[1]+bin[2]));
        // System.out.println(bin[0]+" "+bin[1]+" "+bin[2]+" "+(bin[0]+bin[1]+bin[2]));
        ans=Math.max(ans, binToDec(bin[0]+bin[2]+bin[1]));
        ans=Math.max(ans, binToDec(bin[1]+bin[0]+bin[2]));
        ans=Math.max(ans, binToDec(bin[1]+bin[2]+bin[0]));
        ans=Math.max(ans, binToDec(bin[2]+bin[1]+bin[0]));
        ans=Math.max(ans, binToDec(bin[2]+bin[0]+bin[1]));

/*
        if(bin[0].compareTo(bin[1])>=0){
            if(bin[0].compareTo(bin[2])>=0){
                index1=0;
                if(bin[1].compareTo(bin[2])>=0){
                    index2=1;
                    index3=2;
                }
            }
            else{
                index1=2;
                index2=0;
                index3=1;
            }
        }

        else{
            if(bin[1].compareTo(bin[2])>=0){
                index1=1;
                if(bin[0].compareTo(bin[2])>=0){
                    index2=0;
                    index3=2;
                }
            }
            else{
                index1=2;
                index2=1;
                index3=0;
            }
        }
*/

        return ans;
        
    }

    String decToBin(int i){

        StringBuffer sb=new StringBuffer();

        while(i!=0){
            // System.out.println(sb);
            sb.append(i%2);
            i/=2;
        }

        sb.reverse();

        return sb.toString();
    }

    int binToDec(String s){

        int ans=0, power=s.length()-1;

        for(char c: s.toCharArray()){
            ans+=Math.pow(2, power) * (Character.getNumericValue(c));
            power--;
        }

        return ans;

    }
}