# Module 09: Strings - README

## 📚 Overview

Strings are sequences of characters. Learn string manipulation, comparison, and advanced string operations using String, StringBuilder, and StringBuffer.

## 🎯 Learning Objectives

- ✅ Declare and initialize strings
- ✅ Use string methods effectively
- ✅ Understand string immutability
- ✅ Use StringBuilder and StringBuffer
- ✅ Perform string comparisons

---

## 📋 Topics Covered

### String Basics
- **Declaration**: Different ways to create strings
- **Immutability**: Strings cannot be changed
- **String pool**: Memory optimization

### String Methods
- **length()**: Get string length
- **charAt()**: Get character at index
- **substring()**: Extract part of string
- **indexOf()**: Find substring position
- **contains()**: Check if contains
- **toUpperCase()/toLowerCase()**: Case conversion
- **trim()**: Remove spaces
- **split()**: Split into array
- **replace()**: Replace characters

### String Classes
- **String**: Immutable
- **StringBuilder**: Mutable, not thread-safe
- **StringBuffer**: Mutable, thread-safe

---

## 💻 Example Code

```java
// String declaration
String str1 = "Hello";
String str2 = new String("Hello");

// String methods
int len = str1.length();              // 5
char ch = str1.charAt(0);             // 'H'
String sub = str1.substring(0, 3);    // "Hel"
int pos = str1.indexOf("l");          // 2
boolean contains = str1.contains("ll"); // true

// String comparison
str1.equals(str2);                    // true
str1.equalsIgnoreCase("hello");       // true
str1.compareTo(str2);                 // 0

// StringBuilder
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("World");
String result = sb.toString();        // "Hello World"

// String array conversion
char[] chars = str1.toCharArray();
String[] words = "hello world".split(" ");
```

---

## 📝 Practice Problems

### Beginner
1. Check if string is palindrome
2. Count vowels in string
3. Reverse string
4. Check if string contains only digits

### Intermediate
1. Check if two strings are anagrams
2. Count frequency of each character
3. Remove duplicates from string
4. Check string rotation

### Advanced
1. Find longest common substring
2. Find all permutations of string
3. Implement pattern matching
4. Compress string

---

## 📊 String Methods Reference

| Method | Purpose |
|--------|----------|
| length() | Get length |
| charAt(i) | Get character |
| substring(s,e) | Extract substring |
| indexOf(s) | Find position |
| contains(s) | Check existence |
| toUpperCase() | Convert to uppercase |
| toLowerCase() | Convert to lowercase |
| trim() | Remove spaces |
| split(regex) | Split string |
| replace(o,n) | Replace text |
| startsWith(s) | Check prefix |
| endsWith(s) | Check suffix |

---

## ✅ Completion Checklist

- [ ] Master string methods
- [ ] Use StringBuilder effectively
- [ ] Compare strings correctly
- [ ] Convert between String and array
- [ ] Practice 25+ exercises

---

## 🔗 Related Resources

- [Main README](../../README.md)
- [Module 08: Arrays](../_08array/README.md)
- [Module 10: OOPS](../_10OOPS/README.md)
- [Documentation](../../docs/MODULE_09_STRINGS.md)

---

**Strings are everywhere in Java - master them!** 📝
