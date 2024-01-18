class Solution {
public:
    bool halvesAreAlike(string s) {
        unordered_set<char> vowels = {'a','e','i','o','u','A','E','I','O','U'};
        int vowelcount =0;
        int mid=s.length()/2;
        for(int i=0;i<mid;i++)
        {
            char A = s[i];
            char B = s[mid+i];
            if(vowels.count(A)) vowelcount++;
            if(vowels.count(B)) vowelcount--;
        }
       return vowelcount==0;
    }
   // return vowelcount==0;
};