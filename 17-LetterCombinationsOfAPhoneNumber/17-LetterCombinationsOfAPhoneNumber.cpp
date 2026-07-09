// Last updated: 7/9/2026, 3:09:41 PM
class Solution {
public:
    vector<string> letterCombinations(string digits) {
        vector<string> result;

        if (digits.empty())
            return result;

        vector<string> mapping = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, "", result, mapping);

        return result;
    }

private:
    void backtrack(string& digits, int index, string current,
                   vector<string>& result,
                   vector<string>& mapping) {

        // Base case: all digits processed
        if (index == digits.length()) {
            result.push_back(current);
            return;
        }

        string letters = mapping[digits[index] - '0'];

        for (char ch : letters) {
            current.push_back(ch);

            // Move to next digit
            backtrack(digits, index + 1, current, result, mapping);

            // Backtrack
            current.pop_back();
        }
    }
};