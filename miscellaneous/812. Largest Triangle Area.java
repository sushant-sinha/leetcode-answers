// SUSHANT SINHA

// it skips the max value sometimes 

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