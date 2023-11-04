# from typing import List

# def helper(ans, temp, digits, i, keyboard):
#   if i == len(digits):
#      ans.append(temp)
#      return
  
#   num = digits[i]
#   word = keyboard[num]

#   for i in range(len(word)):
#      temp + word[i]
#      helper(ans, temp, digits, i + 1, keyboard)
#      temp.pop()

# def letterCombinations(digits: str) -> List[str]:
#     keyboard = {"2": "abc", "3": "def", "4": "ghi", "5": "jkl", "6": "mno", "7": "pqrs", "8": "tuv", "9": "wxyz"}
#     ans = []
#     temp = ""
#     pointer = 0

#     if digits:
#         helper(ans, temp ,digits, pointer, keyboard)

#     return ans

# print(letterCombinations("2"))


from typing import List

def helper(ans, temp, digits, i, keyboard):
    if i == len(digits):
        ans.append(''.join(temp)) 
        return
  
    num = digits[i]
    word = keyboard[num]

    for j in range(len(word)):
        temp.append(word[j])
        helper(ans, temp, digits, i + 1, keyboard)
        temp.pop()  

def letterCombinations(digits: str) -> List[str]:
    keyboard = {"2": "abc", "3": "def", "4": "ghi", "5": "jkl", "6": "mno", "7": "pqrs", "8": "tuv", "9": "wxyz"}
    ans = []
    temp = []  
    pointer = 0

    if digits:
        helper(ans, temp, digits, pointer, keyboard)

    return ans

print(letterCombinations("2"))
