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

# print(subsequence('abc'))


def subsequence_recursive(word, ans):
  if not word:
    return ans
  
  ch = word[0]

  temp = []

  for seb in ans:
    temp.append(seb + ch)
  temp.extend(ans)

  return subsequence_recursive(word[1:], temp)

print(subsequence_recursive('abc', [""]))




  


  
