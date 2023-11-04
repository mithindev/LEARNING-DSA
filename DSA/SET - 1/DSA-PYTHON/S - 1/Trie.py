# # # # # class TrieNode:
# # # # #   def __init__ (self, data = None):
# # # # #     self.data = data
# # # # #     self.childern = {}
# # # # #     self.isTerminal = False

# # # # # class Trie:
# # # # #   def __init__ (self):
# # # # #     self.root = TrieNode()
  
# # # # #   def insertWord(self, word):
# # # # #     node = self.root

# # # # #     for ch in word:
# # # # #       if ch not in node.children:
# # # # #         node.children[ch] = TrieNode() 
      
# # # # #       node = node.children[ch]
    
# # # # #     node.isTerminal = True 
  
# # # # #   def search(self, word):
# # # # #     node = self.root

# # # # #     for ch in word:
# # # # #       if ch not in node.children:
# # # # #         return False

# # # # #       node = node.children[ch]
    
# # # # #     return node.isTerminal

# # # # #   def startsWith(self, prefix):
# # # # #     node = self.root

# # # # #     for ch in prefix:
# # # # #       if ch not in node.children:
# # # # #         return False

# # # # #       node = node.children[ch]
    
# # # # #     return True


# # # # # class Solution:
# # # # #     def removeSubfolders(self, folder: List[str]) -> List[str]:
# # # # #         folder.sort(key=lambda f: len(f))
# # # # #         seen = set()
# # # # #         for f in folder:
# # # # #             for i in range(2, len(f)):
# # # # #                 if f[i] == '/' and f[: i] in seen:
# # # # #                     break
# # # # #             else:
# # # # #                 seen.add(f)
# # # # #         return list(seen)

# # # # import numpy as np
# # # # from typing import List


# # # # def splitList(self, arr, size, ans):
# # # #         i = 0
# # # #         while i < len(arr):
# # # #             ans.append(arr[i: i + size])
# # # #             i += size

# # # #     def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
# # # #         ans = []

# # # #         groups = list(set(groupSizes))

# # # #         dict = {k: [] for k in groups}

# # # #         for i in range(len(groupSizes)):
# # # #             dict[groupSizes[i]].append(i)

# # # #         for k, val in dict.items():
# # # #             self.splitList(val, k, ans)

# # # #         return ans


# # # # print(groupThePeople([3,3,3,3,3,1,3]))

# # # def lengthOfLongestSubstring(word: str) -> int:
# # #     ans = 0
# # #     s = 0
# # #     e = 0

# # #     while e < len(word) - 1:
# # #         substr = word[s:e + 1]
# # #         ch = word[e + 1]

# # #         if ch in substr:
# # #             ans = max(ans, len(substr))
# # #             s = e + 1
# # #             e = e + 1

# # #         e += 1

# # #     return ans

# # # print(lengthOfLongestSubstring("bbbbbbb"))


# # def decodeString(s: str) -> str:
# #      stack = []
# #       temp = []

# #        for ch in s:
# #             if ch != ']':
# #                 stack.append(ch)
# #             elif ch == ']':
# #                 p = stack.pop()
# #                 while p != '[':
# #                     temp.append(p)
# #                     p = stack.pop()
# #                 num = ""
# #                 while (stack.pop().isnumeric()):
# #                     n = stack.pop()
# #                     num += n
# #                 num = num[::-1]
# #                 tt = []
# #                 temp.reverse()
# #                 # string = int(num) * temp
# #                 for i in range(int(num)):
# #                     tt += temp

# #                 stack += tt
# #                 temp = []

# #         ans = ""
# #         for i in stack:
# #             ans += i

# #         return ans


# # print(decodeString("3[a2[c]]"))

# def decodeString(s: str) -> str:
#     stack = []
#     temp = []

#     for ch in s:
#         if ch != ']':
#             stack.append(ch)
#         elif ch == ']':
#             p = stack.pop()
#             while p != '[':
#                 temp.append(p)
#                 p = stack.pop()
#             num = ""
#             p = stack.pop()
#             while (stack and p.isnumeric()):
#                 num += p
#                 p = stack.pop()
#             stack.append(p)
#             num = num[::-1]
#             tt = []
#             temp.reverse()
#             # string = int(num) * temp
#             for i in range(int(num)):
#                 tt += temp

#             stack += tt
#             temp = []

#     ans = ""
#     for i in stack:
#         ans += i

#     return ans


# print(decodeString("3[a2[c]]"))


# class Solution:
#     def myCount (self, s, sub, l):
#         ans = 0
#         for i in range (len(s) - l + 1):
#             if s[i:i + l] == sub:
#                 ans += 1
        
#         return ans

#     def maxFreq(self, word: str, rep: int, minL: int, maxL: int) -> int:
#         s = 0
#         ct = 0

#         for i in range (len(word) - minL + 1):
#             substr = word[s: s + minL]

#             if len(set(substr)) <= rep:
                
#                 c = self.myCount(word, substr, minL)
#                 ct = max(c, ct)
        
#         return ct

# print(maxFreq("aabcabcab", 2, 2, 2))

class Solution:
    def myCount(self, s, sub, l):
        ans = 0
        for i in range(len(s) - l + 1):
            if s[i:i + l] == sub:
                ans += 1
        return ans

    def maxFreq(self, word: str, rep: int, minL: int, maxL: int) -> int:
        s = 0
        ct = 0

        for i in range(len(word) - minL + 1):
            substr = word[s + i: s + i +  minL]

            if len(set(substr)) <= rep:
                c = self.myCount(word, substr, minL)
                ct = max(c, ct)
            

        return ct


# Create an instance of the Solution class and then call the maxFreq method
solution = Solution()
result = solution.maxFreq("aabcabcab", 2, 2, 2)
print(result)
