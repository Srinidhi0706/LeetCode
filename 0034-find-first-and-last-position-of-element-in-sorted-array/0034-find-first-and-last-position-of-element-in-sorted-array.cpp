class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
    sort(nums.begin() , nums.end());
        int pos1=0,pos2=0;
        bool flag=false;
        for(int i=0,j=nums.size()-1;i<nums.size(),j>=0;i++,j--)
        {
            if(nums[i]==target)
            {
               pos1=i; 
                flag=true;
            }
            if(nums[j]==target)
            {
                pos2=j;
                flag=true;
            }
            
        }
        if(flag)
        return {pos2,pos1};
        else 
        return {-1,-1};
    }
};