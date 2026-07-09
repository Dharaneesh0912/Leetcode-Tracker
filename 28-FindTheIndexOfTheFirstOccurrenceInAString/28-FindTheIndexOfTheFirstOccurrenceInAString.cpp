// Last updated: 7/9/2026, 3:09:25 PM
class Solution {
public:
    int strStr(string haystack, string needle) {

        int index = haystack.find(needle);

        if (index == string::npos)
            return -1;

        return index;
    }
};