// SUSHANT SINHA

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