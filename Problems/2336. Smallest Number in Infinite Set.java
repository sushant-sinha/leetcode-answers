class SmallestInfiniteSet {

    TreeSet<Integer> removed;

    public SmallestInfiniteSet() {

        removed=new TreeSet<>();
        
    }
    
    public int popSmallest() {

        if(removed.size()==0 || removed.first()!=1){
            removed.add(1);
            return 1;
        }

        else{

            int min=removed.first();
            int max=removed.last();

            // System.out.println("max="+max+" min="+min);

            // when we have continuously filled element
            //             if lowest is 1: return max+1
            //             if lowest is not 1: return 1
            if(max-min+1==removed.size()){

                if(min==1){
                    removed.add(max+1);
                    return max+1;
                }

                else{
                    removed.add(1);
                    return 1;
                }
            }

            // there is a gap in the removed array... we will find the lowest value in this gap and return
            else{

                Object ar[]=removed.toArray();

                int prev=(int)ar[0];
                for(int i=1; i<ar.length;i++){

                    int cur=(int)ar[i];
                    if(prev+1!=cur){
                        removed.add(prev+1);
                        return prev+1;
                    }

                    else{
                        prev=cur;
                    }

                }
                return 0;

            }
            

        }
        
    }
    
    public void addBack(int num) {
        removed.remove(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */