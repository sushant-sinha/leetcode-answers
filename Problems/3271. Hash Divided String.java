class Solution {
    public String stringHash(String s, int k) {

        StringBuffer result=new StringBuffer();

        int length=s.length();

        for(int i=0; i<=length/k-1; i++){

            // System.out.println("============");

            int sumOfHash=0;

            for(int j=0; j<k; j++){

                // System.out.println("char = "+s.charAt(k*i+j)+" val="+(s.charAt(k*i+j)-'a'));

                sumOfHash+=(int)(s.charAt(k*i+j)-'a');
                
            }

            // System.out.println("sumOfHash= "+sumOfHash);

            result.append((char)(sumOfHash%26+'a'));
        }

        return result.toString();
        
    }
}