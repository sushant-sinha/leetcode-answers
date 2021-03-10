// from https://github.com/interviewdiscussion/files/blob/master/Facebook_java%2Bpdf/43.%20Multiply%20Strings%20product.java

class Solution {
    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null) return "0";

        int m = num1.length(), n = num2.length();

        int[] digits = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {//calculate product from lower digits
            for (int j = n - 1; j >= 0; j--) {
                
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                // or use int product = Integer.parseInt(num1.substring(i,i+1)) * Integer.parseInt(num2.substring(j,j+1));
                
                int p1 = i + j, p2 = p1 + 1;//calculate the indices where the digits will be
                
                int sum = product + digits[p2];//calculate the sum
                
                digits[p1] += sum / 10;//add carries to digits[p1]
                
                digits[p2] = sum % 10;//notice this is =, not +=, cuz it has been added to sum
            }
        }
        
        StringBuilder res = new StringBuilder();
        
        for (int digit : digits) {

            if (!(res.length() == 0 && digit == 0)) res.append(digit);//skip the zero at front
        
        }
        
        return res.length() == 0 ? "0" : res.toString();//corner case like "0","0" -> [0, 0]
    }
}