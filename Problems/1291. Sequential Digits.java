class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> ans=new ArrayList<>();
        int temp=12, len, adder=1;
        ans.add(temp);
        
        while(temp<=high){
            
            if(temp%10==9){
                
                len=String.valueOf(temp).length();
                len++;
                
                if(len==10)
                    break;
                
                StringBuffer gen=new StringBuffer();
                
                for(int i=1;i<=len;i++)
                    gen.append(i);
                
                //System.out.println(gen);
                temp=Integer.parseInt(String.valueOf(gen));
                
                ans.add(temp);
                
            }
            
            else{
                
                //System.out.println(temp);
                
                adder*=10;
                adder++;
                    
                
                while(temp%10!=9){
                    temp+=adder;
                    //System.out.println(temp);
                    ans.add(temp);
                }
                
            }
            
        }
        
        List<Integer> finalAnswer=new ArrayList<>();
        
        for(int i:ans){
            
            if(i>=low && i<=high)                
                finalAnswer.add(i);
            
            if(i>high)
                break;
            
        }
        
        return finalAnswer;
        
    }
}