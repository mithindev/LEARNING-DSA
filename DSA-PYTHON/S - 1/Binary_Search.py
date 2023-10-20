# def search (arr, s, e, target) -> bool:
#   arr.sort()

#   mid = int(s + (e - s)) // 2

#   if (arr[mid] == target):
#     return True

#   elif (arr[mid] < target):
#     return search(arr, mid + 1, e, target)
#   else:
#     return search(arr, s, mid - 1, target)

# print(search([1, 2, 3, 4, 5], 0, 4, 1))

# def reverse(ans, word):
#   l = len(word)

#   if (l == 0):
#     return ans

#   return ans + word[l - 1] + reverse(ans, word[:l - 1])

# print(reverse("", 'abcd'))


# def sort(lst, e):

#   if (e <= 1):
#     return lst
  
#   for i in range(e):
#     if (i + 1 < e and lst[i] > lst[i + 1]):
#       lst[i], lst[i + 1] = lst[i + 1], lst[i]
  
#   return sort(lst, e - 1)

# print(sort([5, 4, 3, 2, 1], 5))

# from typing import List

# class Solution:
#     def sub_sets(self, arr, ans, i):
#         if i >= len(arr):
#             return [ans]  # Wrap ans in a list and return it

#         num = arr[i]

#         # Include the current element
#         included = self.sub_sets(arr, ans + [num], i + 1)

#         # Not include the current element
#         not_included = self.sub_sets(arr, ans, i + 1)

#         return included + not_included  # Combine the two lists

#     def subsets(self, arr: List[int]) -> List[List[int]]:
#         return self.sub_sets(arr, [], 0)

# # Usage
# solution = Solution()
# result = solution.subsets([1, 2, 3])
# print(result)


def isSubsequence(s: str, t: str) -> bool:
        while t:
            if s[0] == t[0]:
                s = s[1:]
                if s == "":
                  return True
            
            t = t[1:]
        return False

print(isSubsequence('abc', 'ahbgdc'))