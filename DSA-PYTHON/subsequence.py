# def subsequence (word, i, ans):
#   if i == 0:
#     return ans

def subsequence(word):

  ans = [""]

  for i in range(1, len(word) + 1):
    j = 0
    while (j < len(word) and j+i <= len(word)):
      ans.append(word[j:j + i])
      j += 1
  
  return ans

print(subsequence('abc'))



  
