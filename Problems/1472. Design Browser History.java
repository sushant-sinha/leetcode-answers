//incomplete
//https://stackoverflow.com/questions/22802232/remove-all-elements-from-a-list-after-a-particular-index/22802295
class BrowserHistory {
    
    ArrayList<String> history=new ArrayList<>();
    int i=0;

    public BrowserHistory(String homepage) {
        
    }
    
    public void visit(String url) {
        
        if(((i+1)<31)){
            history[i++]=url;
            for(int j=i+1;j<31;j++){
                history[j]="";
            }
        }
        
    }
    
    public String back(int steps) {


    }
    
    public String forward(int steps) {

        if((i+steps)<31 && !history[i+steps].equals("")){
            i+=steps;
            return history[i];
        }

        while(steps!=0history[i]){

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