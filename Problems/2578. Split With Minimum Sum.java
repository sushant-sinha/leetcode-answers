class Solution {
    public int splitNum(int num) {
        
        ArrayList<Integer> temp=new ArrayList<>();
        
        while(num!=0){
            temp.add(num%10);
            num/=10;
        }
        
        Collections.sort(temp);
        
        int n1=0, n2=0;
        boolean flag=false;
        
        for(int i=0;i<temp.size();i++){
            
            flag=!flag;
            
            if(flag){
                n1*=10;
                n1+=temp.get(i);
            }
            
            else{
                n2*=10;
                n2+=temp.get(i);
            }
        }
        
        return n1+n2;
        
    }
}