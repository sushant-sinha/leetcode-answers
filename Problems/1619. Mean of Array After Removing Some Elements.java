// SUSHANT SINHA

// 2 ms(98.99 %)

class Solution {
    public double trimMean(int[] arr) {
        
        Arrays.sort(arr);
        
        int sum=0,len=0;
        
        for(int i=arr.length/20; i< arr.length-(arr.length/20); i++){
        
            len++;
            sum+=arr[i];
            
        }
        
        return (double)sum/len;
    }
}

// based on...it had extra arrays...

class Solution {
public double trimMean(int[] arr) {

	//sorting array
    Arrays.sort(arr);
	
	//dividing array's length by 20
	//since it's a given multiple of 20
    int tots = arr.length / 20;
	
	//creating a new array to store 
	//all values between tots 
    int [] something = new int[arr.length-(tots*2)];
    int j = 0;
	
	//transferring values from arr array to something array
    for(int i = tots; i < arr.length-tots;i++) {
        something[j] = arr[i];
        j++;
    }
	
	//creating another for loop to sum up the array
    int sum = 0;
    for(int i = 0; i < something.length;i++) {
        sum += something[i];
    }
    
	//typecasting the mean to create a double result
    double mean = (double)sum/(double)something.length;
    return mean;
}
}