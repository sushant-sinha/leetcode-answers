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