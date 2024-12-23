// SUSHANT SINHA
// 169ms ( 5.02% ) 46.21MB ( 6.01% )

class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {

        TreeMap<Character, Integer> map=new TreeMap<>(Collections.reverseOrder());

        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        // for(Map.Entry<Character, Integer> e: map.entrySet())
        //     System.out.println(e.getKey()+" "+e.getValue());

        StringBuffer sb=new StringBuffer();
        sb.append(".");

        while(true){

            //get the character with the largest lexical position

            if(map.size()==0)
                break;
            // System.out.println("in "+sb);
            Character c=map.firstKey();

            if(c==sb.charAt(sb.length()-1))
                break;

            int freq=map.get(c);

            int consecutiveCounter=0;

            while(freq!=0 && consecutiveCounter<repeatLimit ){
                freq--;
                sb.append(c);
                consecutiveCounter++;
                // System.out.println("freq = "+freq+" "+consecutiveCounter);
            }

            if(freq==0){
                map.remove(c);
                continue;
            }

            map.put(c,freq);

            // now check for the next element

            c=map.higherKey(c);
            // System.out.println("lower c="+c);
            // no smaller element found
            if(c==null)
                break;
            
            consecutiveCounter=0;
            
            freq=map.get(c);

            
                freq--;
                sb.append(c);

            if(freq==0){
                map.remove(c);
                continue;
            }

            map.put(c,freq);
        }

        return sb.toString().substring(1);
        
    }
}

// solution from editorial
// O(N logK)

class Solution {

    public String repeatLimitedString(String s, int repeatLimit) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) ->
            Character.compare(b, a)
        );

        for (char ch : freq.keySet()) {
            maxHeap.offer(ch);
        }

        StringBuilder result = new StringBuilder();

        while (!maxHeap.isEmpty()) {
            char ch = maxHeap.poll();
            int count = freq.get(ch);

            int use = Math.min(count, repeatLimit);
            for (int i = 0; i < use; i++) {
                result.append(ch);
            }

            freq.put(ch, count - use);

            if (freq.get(ch) > 0 && !maxHeap.isEmpty()) {
                char nextCh = maxHeap.poll();
                result.append(nextCh);
                freq.put(nextCh, freq.get(nextCh) - 1);
                if (freq.get(nextCh) > 0) {
                    maxHeap.offer(nextCh);
                }
                maxHeap.offer(ch);
            }
        }

        return result.toString();
    }
}