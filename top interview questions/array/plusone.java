// SUSHANT SINHA
class Solution{
	public int[] plusOne(int[] digits) {
		if(digits.length==1 && digits[digits.length-1]==9){int ans[]={1,0};return ans;}
        else if(digits.length==1){digits[digits.length-1]++;return digits;}
        int carry = 1;
		
		for (int i = digits.length - 1; i >= 0 && carry > 0; --i) {
			int sum = carry + digits[i];
			digits[i] = sum % 10;
			carry = sum / 10;
		}

		if (carry == 0) return digits;
		
		int[] ans = new int[digits.length+1];
		// from carry
        ans[0] = 1;
		for (int i = 1; i < ans.length; i++) {
			ans[i] = digits[i - 1];
		}

		return ans;
	}
}