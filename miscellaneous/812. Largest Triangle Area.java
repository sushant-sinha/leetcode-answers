// SUSHANT SINHA

// it skips the max value sometimes 

/*

class Solution {
    public double largestTriangleArea(int[][] points) {
        
        if(points.length==3)return temparea(points[0],points[1],points[2]);
        
        double max=-1;
        
        for(int i=0;i<points.length-2;i++){
            for(int j=i+1;j<points.length-1;j++){
                for(int k=j+1;k<points.length;k++){
                    max = max > temparea(points[i],points[j],points[k]) ? max : temparea(points[i],points[j],points[k]);
                    
                }
                
            }
            
            System.out.println(max);
        }
        
        return max;
        
    }
    
    public double temparea(int a[],int b[],int c[]){
        
        double side1=Math.sqrt( Math.pow((a[0]-b[0]),2) + Math.pow((a[1]-b[1]),2) );
        double side2=Math.sqrt( Math.pow((a[0]-c[0]),2) + Math.pow((a[1]-c[1]),2) );
        double side3=Math.sqrt( Math.pow((c[0]-b[0]),2) + Math.pow((c[1]-b[1]),2) );
        double s=(side1+side2+side3)/2;
        
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        
    }
}

*/

// from discussion tab
// 15ms ( 8.64% ) 36.9mb ( 48.64% )

class Solution {
    public double largestTriangleArea(int[][] points) {
        double max=0;
        
        for(int x=0;x<points.length-2;x++)
        for(int j=0;j<points.length;j++){
        for(int i=0;i<points.length;i++){
            if(i==j)continue;
            if(Area(points[x],points[j],points[i])>max)
                max=Area(points[x],points[j],points[i]);
           // System.out.print(Area(points[x],points[j],points[i])+"  ");
        }
        }
       // (Area(points[0],points[1],points[2]));
        return max;
    }
    double Area(int p1[],int p2[],int []p3){
        double l1=Math.sqrt((p2[0]-p1[0])*(p2[0]-p1[0]) + (p2[1]-p1[1])*(p2[1]-p1[1]));
        double l2=Math.sqrt((p2[0]-p3[0])*(p2[0]-p3[0]) + (p2[1]-p3[1])*(p2[1]-p3[1]));
        double l3=Math.sqrt((p3[0]-p1[0])*(p3[0]-p1[0]) + (p3[1]-p1[1])*(p3[1]-p1[1]));
        
        double Halfofpremiter=(l1+l2+l3)/2;
        // calaculating Area of rectangle using Hero rule.
        return Math.sqrt(Halfofpremiter*(Halfofpremiter-l1)*(Halfofpremiter-l2)*(Halfofpremiter-l3));
    
        
    }
}