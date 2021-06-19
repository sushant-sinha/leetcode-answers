// SUSHANT SINHA

class Solution {
	public boolean checkPowersOfThree(int n) {

		while(n!=0){
            
			int x = n % 3;
			n /= 3;
			

			if (x + (3 * -1)==2 || x==2)
				return false;
            
            if (x < 0)
				n+= 1;

		}

		return true;

	}
}