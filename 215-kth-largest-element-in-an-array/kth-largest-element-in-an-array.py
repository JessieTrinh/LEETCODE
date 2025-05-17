import heapq 

class Solution(object):
    def findKthLargest(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        nums = [-x for x in nums]
        heapq.heapify(nums)
        max = 0
        for i in range(k):
            max = -heapq.heappop(nums)
        return max 

