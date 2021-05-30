// SUSHANT SINHA

// 8ms ( 100% ) 39.8mb ( 70% )

class Solution {
    public String maxValue(String n, int x) {

        if(n.charAt(0)=='-')
            return negative(n,x);
        else
            return positive(n,x);
        
    }

    String negative(String n, int x){

        StringBuilder ans=new StringBuilder(n);

        if(Character.getNumericValue(1)>x)
            return ans.insert(1,x).toString();

        for(int i=1;i<n.length();i++){
            if(Character.getNumericValue(n.charAt(i))>x)
                return (ans.insert(i,x)).toString();
        }

        return ans.insert(n.length(),x).toString();

    }
    
    String positive(String n, int x){

        StringBuilder ans=new StringBuilder(n);

        for(int i=0;i<n.length();i++){
            if(Character.getNumericValue(n.charAt(i))<x)
                return (ans.insert(i,x)).toString();
        }

        return ans.insert(n.length(),x).toString();

    }
}

// from discuss section

class Solution{
    public String maxValue(String n, int x) {
        boolean isNegative = false;
        if(n.charAt(0) == '-') {
            isNegative = true;
            n = n.substring(1);
        }
        for(int i=0;i<n.length();i++) {
            int current = n.charAt(i) - '0';
            if(!isNegative && current<x || isNegative && current>x) 
                return (isNegative? "-": "") + n.substring(0, i) + x + n.substring(i);
        }
        return (isNegative? "-": "") + n + x;
    }
}