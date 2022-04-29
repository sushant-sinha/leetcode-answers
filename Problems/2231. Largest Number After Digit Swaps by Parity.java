class Solution {
    public int largestInteger(int num) {
        
        // will reuse this variable to be the anwer
        int counter=num;
        
        int evenlen=0, oddlen=0;
        
        while(counter!=0){
            
            if((counter%10)%2==0)
                evenlen++;
            
            else
                oddlen++;
            
            counter/=10;
        }
        
        int index=0, eveindex=-1, oddindex=-1;
        
        int evenNo[]=new int[evenlen];
        int evenIndex[]=new int[evenlen];
        
        
        int oddNo[]=new int[oddlen];;
        int oddIndex[]=new int[oddlen];
        
        while(num!=0){
            
            if((num%10)%2==0){
                evenNo[++eveindex]=(num%10);
                evenIndex[eveindex]=index;
            }
            
            else{
                oddNo[++oddindex]=(num%10);
                oddIndex[oddindex]=index;
            }
            
            num/=10;
            index++;
        }
        
        Arrays.sort(oddNo);
        Arrays.sort(evenNo);
        
        // index will be used to iterate the oddNo arr from 0 to oddlen
        index=0;
        
        for(int i:oddIndex){
            
            counter+=Math.pow(10,i)*oddNo[index++];
            
        }
        
        index=0;
        
        for(int i:evenIndex){
            
            counter+=Math.pow(10,i)*evenNo[index++];
            
        }
        
        return counter;
        
    }
}