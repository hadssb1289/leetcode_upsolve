class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        return False if n < 1 or math.log(n, 4) % 1 != 0 else True
        