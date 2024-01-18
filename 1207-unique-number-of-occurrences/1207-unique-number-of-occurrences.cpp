class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
      unordered_map <int, int> freq;
        for(auto x: arr)
        {
            freq[x]++;
        }
     unordered_set<int> settt;
        for(auto x:freq)
        {
            settt.insert(x.second);
        }
         
        return freq.size()==settt.size();
    }
};