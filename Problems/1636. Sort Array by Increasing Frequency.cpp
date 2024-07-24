class Solution {
public:
    vector<int> frequencySort(vector<int>& nums) {
        
        int freq[201];

        for(int i: nums){
            freq[i+100]++;
        }

        vector<int> ans;

        while(ans.size() != nums.size()){

            int minFreq=101, smallestValue=0;

            for(int i=200; i>=0; i--){

                if(freq[i]!=0 && freq[i]<minFreq){
                    minFreq=freq[i];
                    smallestValue=i-100;
                }

                // cout<<"min freq="<<minFreq;
            }

            for(int i=0;i<minFreq;i++){
                ans.push_back(smallestValue);
                // cout << "pushing" << smallestValue;
            }

            freq[smallestValue+100]=0;

        }

        return ans;
    }
};