// SUSHANT SINHA

// 53ms ( 30.93% ) 106.54mb ( 6.95% )
// not fast, but fast enough😁

class Solution {
    public int[] queryResults(int limit, int[][] queries) {

        // mapping all the colors with the balls

        HashMap<Integer, ArrayList<Integer>> colorBall = new HashMap<>();

        // mapping all balls with their respective colors

        HashMap<Integer, Integer> ballColor=new HashMap<>();

        int[] ans=new int[queries.length];

        for(int i=0;i<queries.length;i++){
            
            int ball=queries[i][0];
            int color=queries[i][1];

            if(ballColor.containsKey(ball)){

                // get the arraylist of balls with the old color, and remove that ball from that color list
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