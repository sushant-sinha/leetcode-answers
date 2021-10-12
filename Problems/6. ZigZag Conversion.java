// SUSHANT SINHA

// 12ms ( 45.88% ) 39.5mb ( 78.39% )

class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows==1)
            return s;
        
        // using array of ArrayList

        ArrayList<Character> ar[]=new ArrayList[numRows];
        
        // initializing ArrayLists

        for(int i=0;i<numRows;i++)
            ar[i]=new ArrayList<Character>();
        
        int row=0,direction=1;
        
        for(char c:s.toCharArray()){
            
            //System.out.println(row);
            
            ar[row].add(c);
            
            if(row+1==numRows)
                direction=-1;
            if(row-1==-1)
                direction=1;
            
            row+=direction;
            
        }
        
        String ans="";
        
        for(int i=0;i<numRows;i++){
            for(Character c:ar[i])
                ans+=c;
        }
        
        return ans;
        
    }
}

// best solution
// 3ms ( 89.99% ) 42.1mb ( 34.38% )

class Solution {
    public String convert(String s, int numRows) {
         int n = s.length();
        if(numRows<=1 || numRows>n){
            return s;
        }
        
        int interval = 2*numRows-2;
        char[] arr = new char[n];
        int count =0;
        for(int i = 0;i< numRows;i++){
            int step = interval-2*i;
            for(int j = i;j< n;j+=interval){
                arr[count++] = s.charAt(j);
                if(step >0 && step < interval && j+step<n){
                    arr[count++] = s.charAt(j+step);
                }
            }
        }
        
        return String.valueOf(arr);
        
    }
}