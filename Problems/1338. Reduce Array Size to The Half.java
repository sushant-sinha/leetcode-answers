// SUSHANT SINHA

// 70ms ( 19.97% ) 62.7mb ( 21.15% )
// complicated and not fast

class Solution {
    public int minSetSize(int[] arr) {
        
        Arrays.sort(arr);
        
        HashMap<Integer,Integer> has = new HashMap<>();
        
        for(int i=0;i<arr.length;){
            int count=1;
            int x=arr[i];
            i++;
            while(i<arr.length && arr[i]==x){
                
                count++;
                i++;
            }
            
            has.put(x,count);
        }
        
        return helper(has,(arr.length/2));
        
    }
    
    public static int helper(HashMap<Integer, Integer> hm, int len)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        
        int ans=0,curlen=0;
        
        for (Map.Entry e : temp.entrySet()) {
            
            if(curlen>=len)
                return ans;
            
            // Add some bonus marks
            // to all the students and print it
            curlen+= (int)e.getValue();
            
            ans++;
  
        }
        
        return ans;
    }
    
}

// 23ms ( 94.27% ) 52mb ( 56.09% )
// simple and faster

class Solution {
    public int minSetSize(int[] arr) {
        
        int len=arr.length/2;
        
        int num[]=new int[100001];
        
        for(int i:arr){
            num[i]++;
        }
        
        Arrays.sort(num);
        
        int curlen=0,ans=0;
        
        for(int i=num.length-1;i>=0;i--){
            if(curlen>=len)
                return ans;
            ans++;
            curlen+=num[i];
        }
        
        return ans;
        
    }
}