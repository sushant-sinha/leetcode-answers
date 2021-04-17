// SUSHANT SINHA

// 6ms ( 80.02% ) 39.3mb ( 54.78% )

class Solution {
    public String removeDuplicates(String s, int k) {
        Deque<Item> deque = new LinkedList();
        
        //Gready Apprach,
        //whenever we find the k consecutive same character just remove the dequeu (stack)
        
        for(char c : s.toCharArray()){
            if(deque.isEmpty()){
                deque.addLast(new Item(c, 1));
                continue;
            }
            
            //last stored item
            Item item = deque.peekLast();

            if(item.c != c){
                deque.addLast(new Item(c, 1));
                continue;
            }
            
            if(item.count == k - 1){
                deque.removeLast();
            }else{
                item.count++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!deque.isEmpty()){
            Item item = deque.removeFirst();
            
            while(item.count --> 0){
                sb.append(item.c);
            }
        }
        
        //sb.reverse();
        
        return sb.toString();
        
    }
}

class Item {
    char c;
    int count;
    
    public Item(char c, int count){
        this.c = c;
        this.count = count;
    }
}

// my solution .... TLE

class Solution {
    public String removeDuplicates(String s, int k) {
        
        ArrayList<Character> ar=new ArrayList<>();
        
        for(char c:s.toCharArray())
            ar.add(c);
        
        for(int i=0;i<ar.size()-k;i++){
            
            char c=ar.get(i);
            int ck=1;
            
            for(int j=1;j<k;j++){
                if(ar.get(i+j)==c)
                    ck++;
                else break;
            }
            if(ck==k){
                
                for(int j=0;j<k;j++){
                    ar.remove(i);
                }
                i=-1;
            }
            
        }
        
        String ans="";
        
        for(char c:ar)
            ans+=c;
        
        return ans;
        
        
    }
}