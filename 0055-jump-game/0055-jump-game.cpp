class Solution {
public:
    bool canJump(vector<int>& nums) {
       int left = nums[0];
        for(int i=1;i<nums.size();i++)
        {
            left--;
            if(left < 0)
                return false;
            if(i == nums.size()-1)
                return true;
            if(left<nums[i])
                left=nums[i];
        }
        return true;
    }
};