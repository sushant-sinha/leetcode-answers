class Solution {
    public int bitwiseComplement(int n) {
        
        // Integer.toString(int n, int base) returns a string with base = base of decimal = n 
        
        String num=Integer.toString(n,2);
        
        char ar[]=num.toCharArray();
        
        for(int i=0;i<ar.length;i++){
            ar[i]= ar[i]=='0' ? '1' : '0';
        }
        
        // String.valueOf(char ar[]) returns string made up of characters in ar
        
        // Integer.parseInt(String n, int base) returns (decimal) integer of (String) n for base = base
        
        return Integer.parseInt(String.valueOf(ar),2);
        
    }
}