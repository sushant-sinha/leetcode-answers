// SUSHANT SINHA

// 4ms ( 65.73% ) 41.60mb ( 88.65% )

/*

Took me 3 attempts to solve this because of 2 cases:
    1) When the triplet is having value '0'. Handled it by adding a condition in line# 68.
    2) Missed to update one of the if conditions while copying🥲

*/ 

class Solution {
    public String numberToWords(int num) {

        if(num==0)
            return "Zero";

        String ans="";

        ArrayList<Integer> chunks=new ArrayList<>();

        while(num!=0){

            chunks.add(num%1000);
            num/=1000;

        }

        // System.out.println(chunks);

        int set=0;

        for(int i: chunks){

            ans=stringGenerator(i, set)+ans;

            set++;
        }

        if(ans.charAt(0)==' ')
            return ans.substring(1);

        return ans;
        
    }

    String stringGenerator(int num, int set){

        String ans="";
        // int index=0;

        // while(num!=0){

        //     int digit=num%100;
        //     ans=intToString(digit, index)+ans;
        //     num/=100;
        //     index++;

        // }

        ans=intToString(num%100, 0);
        num/=100;
        // System.out.println("for first "+num+" "+ans);
        ans=intToString(num, 1)+ans;
        // System.out.println("for "+num+" "+ans);

        if(!ans.equals("")){

        if(set==1)
            ans+=" Thousand";
        else if(set==2)
            ans+=" Million";
        else if(set==3)
            ans+=" Billion";

        }

        return ans;
    }

    String intToString(int digit, int position){

        if(position==0){

            if(digit==1){
                return " One";
            }

            if(digit==2){
                return " Two";
            }

            if(digit==3){
                return " Three";
            }
            
            if(digit==4){
                return " Four";
            }
            
            if(digit==5){
                return " Five";
            }
            
            if(digit==6){
                return " Six";
            }
            
            if(digit==7){
                return " Seven";
            }
            
            if(digit==8){
                return " Eight";
            }

            if(digit==9){
                return " Nine";
            }

            if(digit==10){
                return " Ten";
            }

            if(digit==11){
                return " Eleven";
            }

            if(digit==12){
                return " Twelve";
            }

            if(digit==13){
                return " Thirteen";
            }
            
            if(digit==14){
                return " Fourteen";
            }
            
            if(digit==15){
                return " Fifteen";
            }
            
            if(digit==16){
                return " Sixteen";
            }
            
            if(digit==17){
                return " Seventeen";
            }
            
            if(digit==18){
                return " Eighteen";
            }

            if(digit==19){
                return " Nineteen";
            }
            
            if(digit==0){
                return "";
            }
            
            else{

                return genericDoubleDigit(digit);
            }
                 
        }

        if(position==1){

            if(digit==1){
                return " One Hundred";
            }


            if(digit==2){
                return " Two Hundred";
            }

            if(digit==3){
                return " Three Hundred";
            }
            
            if(digit==4){
                return " Four Hundred";
            }
            
            if(digit==5){
                return " Five Hundred";
            }
            
            if(digit==6){
                return " Six Hundred";
            }
            
            if(digit==7){
                return " Seven Hundred";
            }
            
            if(digit==8){
                return " Eight Hundred";
            }

            if(digit==9){
                return " Nine Hundred";
            }
            
            if(digit==0){
                return "";
            }
            
        }

        return "";
    }

    String genericDoubleDigit(int num){

        String ans="";

        int digit=num%10;
        num/=10;

        ans=intToString(digit, 0);

        if(num==2){
            return " Twenty"+ans;
        }

        if(num==3){
            return " Thirty"+ans;
        }

        if(num==4){
            return " Forty"+ans;
        }

        if(num==5){
            return " Fifty"+ans;
        }

        if(num==6){
            return " Sixty"+ans;
        }

        if(num==7){
            return " Seventy"+ans;
        }

        if(num==8){
            return " Eighty"+ans;
        }

        if(num==9){
            return " Ninety"+ans;
        }

        return "";
        
    }
}