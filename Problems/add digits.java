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

// fastest asnwer

class Solution {
    public int addDigits(int num) {
        int s=0;
        while(num!=0)
        {
            int r=num%10;
            s=s+r;
            //System.out.println(s);
            num=num/10;
            if(num==0 && s>=10)
            {
                num=s;
                s=0;
            }
        }
        return s;
    }
}