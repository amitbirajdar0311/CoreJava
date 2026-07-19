# 📖 Module 09: Strings

## 🎯 Overview

Strings are sequences of characters. Learn string manipulation, comparison, and advanced string operations.

## 📚 Learning Objectives

By the end of this module, you will:

- ✅ Declare and initialize strings
- ✅ Use string methods
- ✅ Understand string immutability
- ✅ Use StringBuilder and StringBuffer
- ✅ Perform string comparisons

---

## 📋 Course Content

### 1. String Declaration & Initialization

```java
// String literal
String str1 = "Hello";

// Using new keyword
String str2 = new String("Hello");

// From character array
char[] chars = {'H', 'e', 'l', 'l', 'o'};
String str3 = new String(chars);

// Empty string
String str4 = "";
```

### 2. String Methods

| Method | Description | Example |
|--------|-------------|----------|
| `length()` | Get string length | `"hello".length()` → 5 |
| `charAt(i)` | Get character at index i | `"hello".charAt(0)` → 'h' |
| `substring(s,e)` | Get substring | `"hello".substring(0,3)` → "hel" |
| `indexOf(s)` | Find index of substring | `"hello".indexOf("ll")` → 2 |
| `contains(s)` | Check if contains | `"hello".contains("ll")` → true |
| `startsWith(s)` | Check prefix | `"hello".startsWith("hel")` → true |
| `endsWith(s)` | Check suffix | `"hello".endsWith("lo")` → true |
| `toUpperCase()` | Convert to uppercase | `"hello".toUpperCase()` → "HELLO" |
| `toLowerCase()` | Convert to lowercase | `"HELLO".toLowerCase()` → "hello" |
| `trim()` | Remove leading/trailing spaces | `"  hello  ".trim()` → "hello" |
| `replace(o,n)` | Replace characters | `"hello".replace('l','r')` → "herro" |
| `split(regex)` | Split string | `"a,b,c".split(",")` → ["a","b","c"] |

### 3. String Comparison

```java
String str1 = "hello";
String str2 = "hello";
String str3 = new String("hello");

// Using equals() - Compare content
str1.equals(str2);                    // true
str1.equals(str3);                    // true

// Using == - Compare reference
str1 == str2;                         // true (same reference)
str1 == str3;                         // false (different objects)

// Using equalsIgnoreCase()
"Hello".equalsIgnoreCase("hello");    // true

// Using compareTo()
str1.compareTo(str2);                 // 0 (equal)
"apple".compareTo("banana");          // -1 (apple < banana)
```

### 4. String Immutability

```java
String str = "hello";
// str = str + " world";  // Creates new String object
// Old string "hello" is still in memory (garbage collected later)

// Concatenation creates new objects
String result = str.concat(" world");
```

### 5. StringBuilder and StringBuffer

```java
// StringBuilder - Not thread-safe, faster
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("World");
String result = sb.toString();  // "Hello World"

// StringBuffer - Thread-safe, slower
StringBuffer sbf = new StringBuffer();
sbf.append("Hello");
sbf.append(" World");

// Operations
sb.insert(5, "!");      // Insert at index
sb.delete(5, 6);        // Delete range
sb.reverse();           // Reverse string
```

### 6. String to Array Conversion

```java
String str = "hello";

// String to char array
char[] chars = str.toCharArray();
// Result: {'h', 'e', 'l', 'l', 'o'}

// String array (split)
String[] words = "hello world java".split(" ");
// Result: {"hello", "world", "java"}
```

---

## 💻 Code Examples

### Example 1: Check Palindrome

```java
public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "racecar";
        
        String reversed = new StringBuilder(str)
                            .reverse()
                            .toString();
        
        if (str.equals(reversed)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }
    }
}
```

### Example 2: Count Vowels and Consonants

```java
public class VowelConsonant {
    public static void main(String[] args) {
        String str = "hello world";
        
        int vowels = 0, consonants = 0;
        
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Vowels: " + vowels);       // 3
        System.out.println("Consonants: " + consonants);  // 7
    }
}
```

### Example 3: Reverse String

```java
public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        
        // Method 1: Using StringBuilder
        String reversed1 = new StringBuilder(str)
                            .reverse()
                            .toString();
        System.out.println(reversed1);  // "olleh"
        
        // Method 2: Using loop
        String reversed2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed2 += str.charAt(i);
        }
        System.out.println(reversed2);  // "olleh"
    }
}
```

### Example 4: String Permutations

```java
public class StringFrequency {
    public static void main(String[] args) {
        String str = "hello";
        
        System.out.println("Character Frequencies:");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == c) {
                    count++;
                }
            }
            System.out.println(c + ": " + count);
        }
    }
}
```

---

## 🎯 Practice Exercises

1. Check if two strings are anagrams
2. Find longest common substring
3. Check if string is rotation of another
4. Remove duplicates from string
5. Count frequency of each character

---

## ✅ Checklist

- [ ] Master string methods
- [ ] Use StringBuilder effectively
- [ ] Compare strings correctly
- [ ] Convert between String and array
- [ ] Solve 20+ exercises

---

**Next → Module 10: Object-Oriented Programming (OOPS)**
