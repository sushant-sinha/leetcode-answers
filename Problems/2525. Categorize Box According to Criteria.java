// SUSHANT SINHA

// 0ms ( 100% ) 39.3mb ( 91.46% )

class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        
        boolean bulky=false, heavy=false;
        long volume=(long)length*width*height;
        
        if(mass>=100)
            heavy=true;
        
        if(length>=10000 || width>=10000 || height>=10000 || volume>=1000000000)
            bulky=true;
        // System.out.println(heavy+" "+bulky+" "+(volume>=1000000000)+" vol="+volume);
        
        if(bulky && heavy)
            return "Both";
        
        if(!bulky && !heavy)
            return "Neither";
        
        return bulky ? "Bulky" : "Heavy";
        
    }
}