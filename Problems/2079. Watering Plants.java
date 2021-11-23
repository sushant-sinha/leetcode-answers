//test (solution from discuss tab... optimal solution)
// at https://leetcode.com/problems/watering-plants/discuss/1589176/Java-simple-or-O(n)-or-0-ms-faster-than-100.00-of-Java

class Solution {

    public int wateringPlants(int[] plants, int capacity) {

        int steps = 0;

        int can = capacity;

        for(int i=0;i<plants.length;i++){

            if(plants[i] <= can){

                can -= plants[i];

                plants[i] = 0;

            }else {

                steps+= i + i;

                can = capacity-plants[i];

            }

            steps++;

        }

        return steps;

    }

}

// another approach I found in the discuss section

class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int c=capacity;
        int steps=0;
        for(int i=0;i<plants.length;i++){
            if(plants[i]>c){
                steps+=(i * 2) + 1; 
                c=capacity-plants[i];
            }
            else 
            {
                steps+=1;
                c-=plants[i];
            }
        }
        return steps;
    }
}
