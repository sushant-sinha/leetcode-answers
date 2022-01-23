// SUSHANT SINHA

// 0ms ( 100% ) 36.5mb ( 75.00% )

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> ans=new ArrayList<>();
        int temp=12, len=2, adder=1;
        ans.add(temp);
        
        while(temp<=high){
            
            if(temp%10==9){
                
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