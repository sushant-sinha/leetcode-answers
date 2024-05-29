class Solution {
    public int[] queryResults(int limit, int[][] queries) {

        HashMap<Integer, ArrayList<Integer>> colorBall = new HashMap<>();

        HashMap<Integer, Integer> ballColor=new HashMap<>();

        int[] ans=new int[queries.length];

        for(int i=0;i<queries.length;i++){
            
            int ball=queries[i][0];
            int color=queries[i][1];

            if(ballColor.containsKey(ball)){

                ArrayList<Integer> temp=colorBall.get(ballColor.get(ball));

                temp.remove(new Integer(ball));

                if(temp.size()==0){
                    colorBall.remove(ballColor.get(ball));
                }

                else
                    colorBall.put(ballColor.get(ball), temp);

                
                ballColor.put(ball,color);

                if(colorBall.containsKey(color)){
                    temp=colorBall.get(color);
                    temp.add(ball);
                    colorBall.put(color, temp);
                }

                else{
                    temp=new ArrayList<Integer>();
                    temp.add(ball);
                    colorBall.put(color, temp);
                }
            }

            else{

                ArrayList<Integer> temp;

                ballColor.put(ball, color);

                if(colorBall.containsKey(color)){
                    temp=colorBall.get(color);
                    temp.add(ball);
                    colorBall.put(color, temp);
                }

                else{
                    temp=new ArrayList<Integer>();
                    temp.add(ball);
                    colorBall.put(color, temp);
                }

            }

            ans[i]=colorBall.size();

        }

        return ans;
        
    }
}