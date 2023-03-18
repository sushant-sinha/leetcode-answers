// SUSHANT SINHA

// 59ms ( 54.85% ) 50.8mb ( 22.81% )

class BrowserHistory {

    // use hashmap for indexing
    // or
    // use doubly linkedlist but traversal for back and forward will take time
    // or
    // try with ArrayList🤷‍
    
    HashMap<Integer, String> map;

    int index=0, endIndex=0;

    public BrowserHistory(String homepage) {

        map=new HashMap<>();

        map.put(++index, homepage);
        endIndex++;
        
    }
    
    public void visit(String url) {

        if(endIndex>index){
            endIndex=index;
        }
        map.put(++index, url);
        ++endIndex;

    }
    
    public String back(int steps) {

        if(index>steps){
            // System.out.println("current="+index+" requested back="+steps);
            index-=steps;
            // System.out.println("returnig for="+index);
            return map.get(index);
        }
        
        else{
            index=1;
            return map.get(1);
        }
    }
    
    public String forward(int steps) {
        
        if(steps<=endIndex-index){
            index+=steps;
            return map.get(index);
        }

        else{
            index=endIndex;
            return map.get(index);
        }
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */