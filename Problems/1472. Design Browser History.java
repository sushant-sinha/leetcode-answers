class BrowserHistory {

    // use hashmap for indexing
    // use doubly linkedlist 

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