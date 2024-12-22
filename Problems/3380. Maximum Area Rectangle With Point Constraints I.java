// SUSHANT SINHA

// bunch of edge cases which I missed on.
// had 20% accuracy

// 7ms ( 80.74% ) 45.36MB ( 24.37% )

class Solution {
    public int maxRectangleArea(int[][] points) {

        TreeMap<Integer, TreeSet<Integer>> sortedX=new TreeMap<>();

        TreeMap<Integer, TreeSet<Integer>> sortedY=new TreeMap<>();

        for(int i[]: points){

            TreeSet<Integer> temp=new TreeSet<>();

            if(sortedX.containsKey(i[0]))
                temp=sortedX.get(i[0]);

            temp.add(i[1]);

            sortedX.put(i[0], temp);

            temp=new TreeSet<>();

            if(sortedY.containsKey(i[1]))
                temp=sortedY.get(i[1]);

            temp.add(i[0]);

            sortedY.put(i[1], temp);

        }

        // iterate through all the points as if they are the bottom most point

        int area=-1;

        for(int i[]: points){

            // bottom left
            int x=i[0], y=i[1];
            // System.out.println("---------\np0 "+x+" "+y);
            // check if we have points above this, parallel to y-axis, top left
            TreeSet<Integer> lockedX=sortedX.get(x);

            int x1=x, y1=-1;

            if(lockedX.ceiling(y+1)!=null)
                y1=lockedX.ceiling(y+1);
            
            else
                continue;

            // System.out.println("p1 "+x1+" "+y1);
            // bottom right

            int y2=y, x2=-1;

            TreeSet<Integer> lockedY=sortedY.get(y2);
            // System.out.println("lockedY for y= "+y+" : "+lockedY+" ceiling= "+lockedY.ceiling(x+1));
            if(lockedY.ceiling(x+1)!=null)
                x2=lockedY.ceiling(x+1);
            
            else
                continue;
            // System.out.println("p2 x2="+x2+" "+y2);

            int topRightX=x2, topRightY=y1;

            // System.out.println("p3 to find= "+topRightX+ " "+topRightY);

            if(sortedX.containsKey(topRightX) && sortedX.get(topRightX).contains(topRightY)){
                // check if there is a point within this rectangle
            // System.out.println("p3 "+x2+" "+y1);

            boolean flag=false;
                // find an X coordinate which is >x but <x2
                for(Map.Entry<Integer, TreeSet<Integer>> e: sortedX.entrySet()){

                    if((e.getKey()>x && e.getKey()<x2) || e.getKey()==x || e.getKey()==x2){

                        List<Integer> min = new ArrayList<>();
                        min.addAll(e.getValue());

                        // System.out.println("found a point X= "+e.getKey());

                        for(int testY: min){
                            if((e.getKey()==x && testY==y) || (e.getKey()==x1 && testY==y1) || (e.getKey()==x2 && testY==y2) || (e.getKey()==x2 && testY==y1))
                                continue;

                            if((testY>y && testY<y1) || testY==y || testY==y1){
                            flag=true;
                            // System.out.println("found a point "+e.getKey()+" "+testY);
                            break;
                            }
                        }

                    }
                }

                if(flag)
                    continue;
                // System.out.println(x+" "+y);
                // System.out.println(x1+" "+y1);
                // System.out.println(x2+" "+y2);
                // System.out.println(topRightX+" "+topRightY);
                area=Math.max(area, (y1-y)*(x2-x1));

            }

        }

        return area;
        
    }
}

// fastest solution
// feel my solution looks good, atleast fomat and execution wise

class Solution {
    public int maxRectangleArea(int[][] points) {
        return sln1(points);
    }

    private int sln1(int[][] ps){
        int n = ps.length;
        int res = -1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(j==i) continue;
                if(ps[i][1] != ps[j][1]) continue;
                for(int k = 0;k<n;k++){
                    if(k==i || k==j) continue;
                    if(ps[i][0] != ps[k][0]) continue;
                    for(int l = k+1; l<n;l++){
                        if(l==i || l==j || l==k) continue;
                        if(ps[l][0] != ps[j][0] || ps[l][1] != ps[k][1]) continue;
                        int hl = Math.min(ps[i][0], ps[j][0]);
                        int hr = Math.max(ps[i][0], ps[j][0]);
                        int vt = Math.min(ps[i][1], ps[k][1]);
                        int vb = Math.max(ps[i][1], ps[k][1]);
                        boolean valid = true;
                        for(int a = 0;a<n;a++){
                            if(a==i || a==j || a==k || a==l) continue;
                            if(hl <= ps[a][0] && ps[a][0] <= hr && vt <= ps[a][1] && ps[a][1]<=vb){
                                valid = false;
                                break;
                            }
                        }
                        if(valid)  res = Math.max(res, (hr-hl)*(vb-vt));
                    }
                }
            }
        }
        return res;
    }
}