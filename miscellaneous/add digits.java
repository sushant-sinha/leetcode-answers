// SUSHANT SINHA

// My answer

class Solution {
    public int addDigits(int num) {
        int temp=99;
        while(String.valueOf(num).length()!=1){
            temp=0;
            int len=String.valueOf(num).length();
            for(int i=1;i<=len;i++){
                temp+=num%(Math.pow(10,i));num/=Math.pow(10,i);
            }
            
            num=temp;
        }
        return num;
    }
}

// op answer

class Solution {
    public int addDigits(int num) {
        if (num % 9 == 0 && num != 0) {
            return 9;
        }
        
        return num % 9;
    }
}

