// SUSHANT SINHA

// 61ms ( 66.53% ) 45.10mb ( 19.07% )

function countPairs(nums: number[], target: number): number {

    var ans=0;

    for(var i=0; i<nums.length-1; i++){
        for(var j=i+1; j<nums.length;j++){
            if(nums[i]+nums[j]<target)
                ans++;
        }
    }

    return ans;
};