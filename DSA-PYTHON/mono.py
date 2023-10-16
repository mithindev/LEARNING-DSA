from typing import List

def isMonotonic(arr: List[int]) -> bool:
        ans = True

        if (arr.sort() == arr):
            return True
        
        for i in range (1, len(arr)):
            if i < len(arr) and arr[i] <= arr[i - 1]:
                continue
            else:
                ans = False
        
        return ans

print(isMonotonic([1, 2, 2, 3]))