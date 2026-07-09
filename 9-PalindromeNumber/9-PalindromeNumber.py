# Last updated: 7/9/2026, 3:14:57 PM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        s = str(x)
        return s == s[::-1]