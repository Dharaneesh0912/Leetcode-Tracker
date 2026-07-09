// Last updated: 7/9/2026, 3:09:34 PM
class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string> result;
        backtrack(result, "", 0, 0, n);
        return result;
    }

private:
    void backtrack(vector<string>& result, string current,
                   int open, int close, int n) {

        // Base case: all parentheses are used
        if (current.length() == 2 * n) {
            result.push_back(current);
            return;
        }

        // Add opening bracket if available
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }

        // Add closing bracket only if it is valid
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
};