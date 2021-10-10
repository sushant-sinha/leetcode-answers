// referenced
// this problem has 8268 testcases

// 4ms ( 100% ) 38.5mb ( 52.54% )
// most common answer

class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int count =0;
        while(m!=n){
            m>>=1;
            n>>=1;
            count+=1;
        }
        return m<<=count;
    }
}

/*

public int rangeBitwiseAnd(int left, int right) {
	var rangeAnd = 0;
	for (var i = 30; i >= 0; i--) {
		var leftHighestSet = left & (1 << i);
		if (leftHighestSet != (right & (1 << i)))
			break;
		rangeAnd |= leftHighestSet;
	}
	return rangeAnd;
}

*/