from typing import List

# def longestCommonPrefix(strs: List[str]) -> str:
#         ans = ""

#         if len(strs) <= 1 or strs[0] == "":
#             return strs[0]

#         index = 0

#         while (index < len(strs[0])):
#             ch = strs[0][index]

#             for i in range (1, len(strs)):
#                 if index > len(strs[i]) or strs[i][index] != ch:
#                     return ans
            
#             ans += strs[0][index]
#             index += 1
#         return ans

# print(longestCommonPrefix(["ab", "a"]))

arr = ['ab', 'a']
arr.sort()
print(arr)

