class Solution {
public:
    int numMatchingSubseq(string s, vector<string>& words) {
        vector<vector<int>> mapping(26);
        for(int i = 0; i < s.size(); i++) mapping[s[i] - 'a'].push_back(i);
        int cnt = 0;
        for(auto &word : words){
            bool found = true;
            for(int i = 0, prev = -1; found && i < word.size(); i++){
                auto &v = mapping[word[i] - 'a'];
                auto it = upper_bound(v.begin(), v.end(), prev);
                if(it == v.end()) {
                    found = false;
                }
                else prev = *it;
            }
            if(found) cnt++;
        }
        return cnt;
    }
};