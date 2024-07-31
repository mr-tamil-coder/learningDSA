# String Data Strucutres 
- We are going to solve 15 DSA Problems in String

## 1. Longest Common Prefix
  
  ### Description
  - Write a function to find the longest common prefix string amongst an array of strings.If there is no common prefix,return an empty string "".
  - Input: strs = ["flower","flow","flight"] 
```java
    public String longestCommonPrefix(String[] strs) {
        // 1. Strings is null or empty return ""[empty string]
        if (strs == null || strs.length == 0) {
            return "";
        }

        // 2. Assume the first string is the prefix. i.e prefix = strs[0]
        String prefix = strs[0];

        // 3 .Loop through the array and compare each string with the prefix
        for (int i = 1; i < strs.length; i++) {
            // 4. Make sure that the prefix is a substring of the current string.
            // [Tamil] Prefix voda word current string la irukanu check pananum.Mathi kodututa wont work.
            while (strs[i].indexOf(prefix) != 0) {
                //Remove the last character from the prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                //if prefix is empty, return empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
        
    }
```

## 2. Fizz Buzz

### Description
- Given an integer n, return a string array answer (1-indexed) where:
    - answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    - answer[i] == "Fizz" if i is divisible by 3.
    - answer[i] == "Buzz" if i is divisible by 5.
    - answer[i] == i (as a string) if none of the above conditions are true.

```java
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // if i is divisible by both 3 and 5
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                // if i is divisible by 3
                result.add("Fizz");
            } else if (i % 5 == 0) {
                // if i is divisible by 5
                result.add("Buzz");
            } else {
                //if none of the above, add the number as a string
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

```
## 3. Longest Repeating Character Replacement

### Description

