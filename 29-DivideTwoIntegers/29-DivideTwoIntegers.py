# Last updated: 7/9/2026, 3:14:31 PM
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == -2147483648 and divisor == -1:
            return 2147483647
        x=dividend//divisor
        if x<0 and dividend%divisor!=0:
            x+=1
        return x