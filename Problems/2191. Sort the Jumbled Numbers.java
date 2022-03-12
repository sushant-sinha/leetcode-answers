// SUSHANT SINHA

// code worked for 58/66 testcases....
// it couldn't maintain the relative order in the array.... sorting method was using comparator and was from GFG

class Solution {
    
    int mp[];
    
    public int[] sortJumbled(int[] mapping, int[] nums) {
        
        mp=mapping;
        
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int i: nums){
            
            int convertedVal=calculate(i);
            
            map.put(i,convertedVal);
            
        }
        
        Map<Integer, Integer> sorted= sortByValue(map);
        
        int indexInnums=0;
        
        
        for (Map.Entry<Integer, Integer> en : sorted.entrySet()) {
            
            nums[indexInnums++]=en.getKey();
        }
        
        return nums;
        
    }
    
    // getting the value for the number
    int calculate(int n){
        
        //System.out.print(n);
        
        int val=0, index=0;
        
        if(n==0)
            val=mp[0];
        
        while(n!=0){
            
            val+=mp[n%10]*Math.pow(10,index++);
            //System.out.print(" "+val);
            n/=10;
            
        }
        
        //System.out.println(" hi "+val);
        
        return val;
        
    }
    
    // sorting function from GFG
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm){
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    
}


// solution from https://leetcode.com/problems/sort-the-jumbled-numbers/discuss/1831387/Java-Comparator
// 90ms ( 99.28% ) 51.2mb ( 89.17% )

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<Game> list = new ArrayList<>();
        for(int num: nums){
            int key = num;
            int value = 0;
            int multiplier = 1;
            if(num==0){
                value = mapping[0];
            }
            while(num>0){
                value += multiplier * mapping[num%10];
                num = num/10;
                multiplier *= 10;
            }
            Game g = new Game(key, value);
            list.add(g);
        }
        Collections.sort(list, new Comparator<Game>(){
           public int compare(Game g1, Game g2){
               return g1.value - g2.value;
           } 
        });
        
        for(int i=0; i<nums.length; i++){
            nums[i] = list.get(i).key;
        }
        return nums;
    }
    
    class Game {
        int key;
        int value;
        public Game(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
}