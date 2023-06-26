class Solution {
    public long totalCost(int[] costs, int k, int candidates) {

        long ans=0;

        final int len=costs.length;

        PriorityQueue<Integer> left=new PriorityQueue<>();
        PriorityQueue<Integer> right=new PriorityQueue<>();

        int l=-1, r=len;

        for(int i=0;i<candidates;i++){

            if(l+1<r){
                l++;
                left.offer(costs[l]);
            }

            if(r-1>l){
                r--;
                right.offer(costs[r]);
            }
        }

        for(int i=0;i<k;i++){

            if(left.size()>0){

                if(right.size()>0){
                    // if both left and right are non empty
                    if(left.peek()>right.peek()){
                        ans+=right.poll();
                        if(r-1>l){
                            r--;
                            right.offer(costs[r]);
                        }
                    }

                    else{
                        ans+=left.poll();

                        if(l+1<r){
                            l++;
                            left.offer(costs[l]);
                        }
                    }
                }
                // if left is non empty but right is empty
                else{
                    ans+=left.poll();

                    if(l+1<r){
                        l++;
                        left.offer(costs[l]);
                    }
                }
            }

            // if left is empty
            else if(right.size()>0){
                ans+=right.poll();
                if(r-1>l){
                    r--;
                    right.offer(costs[r]);
                }
            }


        }

        return ans;
        
    }
}