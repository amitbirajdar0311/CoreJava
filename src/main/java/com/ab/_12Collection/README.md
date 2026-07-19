# Module 12: Collections - README

## 📚 Overview

Collections provide dynamic data structures for storing groups of objects. Learn List, Set, Map, and their implementations with proper iteration.

## 🎯 Learning Objectives

- ✅ Use List interface and implementations
- ✅ Use Set interface and implementations
- ✅ Use Map interface and implementations
- ✅ Iterate over collections
- ✅ Use Collections utility class

---

## 📋 Topics Covered

### Collection Interfaces
- **List**: Ordered, allows duplicates
- **Set**: Unique elements only
- **Map**: Key-value pairs

### Implementations
- **ArrayList/LinkedList**: List implementations
- **HashSet/TreeSet**: Set implementations
- **HashMap/TreeMap**: Map implementations

### Iteration Methods
- **Enhanced for loop**: for-each
- **Iterator**: Explicit iteration
- **Stream API**: Functional approach
- **Collections utility**: Sorting, searching, etc.

---

## 💻 Example Code

```java
// ArrayList
List<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Orange");
for (String fruit : list) {
    System.out.println(fruit);
}

// HashSet
Set<Integer> set = new HashSet<>();
set.add(10);
set.add(20);
set.add(10);  // Duplicate ignored
System.out.println(set.size());  // 2

// TreeSet - Sorted
Set<Integer> treeSet = new TreeSet<>();
treeSet.add(50);
treeSet.add(30);
treeSet.add(40);
// Output: 30, 40, 50

// HashMap
Map<String, Integer> map = new HashMap<>();
map.put("John", 25);
map.put("Jane", 30);
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}

// Collections utility
List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
Collections.sort(numbers);      // Sort
Collections.reverse(numbers);   // Reverse
int max = Collections.max(numbers);    // Max
int min = Collections.min(numbers);    // Min
```

---

## 📝 Practice Problems

### Beginner
1. Create list of numbers and find sum
2. Create set and remove duplicates
3. Create map and retrieve values
4. Sort list of strings

### Intermediate
1. Find common elements between lists
2. Count frequency of elements
3. Group elements by category
4. Implement custom sorting

### Advanced
1. Implement set operations (union, intersection)
2. Create nested collections
3. Use streams for filtering
4. Implement custom comparator

---

## 📊 Collections Comparison

| Collection | Ordered | Unique | Key-Value | Performance |
|-----------|---------|--------|-----------|-------------|
| ArrayList | ✅ | ❌ | ❌ | Fast access |
| LinkedList | ✅ | ❌ | ❌ | Fast insert/delete |
| HashSet | ❌ | ✅ | ❌ | Fastest |
| TreeSet | ✅ | ✅ | ❌ | Sorted |
| HashMap | ❌ | ✅ | ✅ | Fast access |
| TreeMap | ✅ | ✅ | ✅ | Sorted by key |

---

## ✅ Completion Checklist

- [ ] Use List (ArrayList, LinkedList)
- [ ] Use Set (HashSet, TreeSet)
- [ ] Use Map (HashMap, TreeMap)
- [ ] Iterate using Iterator and forEach
- [ ] Use Collections utility methods
- [ ] Practice 25+ exercises

---

## 🔗 Related Resources

- [Main README](../../README.md)
- [Module 11: Multithreading](../_11Multithreading/README.md)
- [Documentation](../../docs/MODULE_12_COLLECTIONS.md)

---

**Congratulations! You've completed all 12 Core Java modules!** 🎉

**Collections are essential for handling data - master them!** 📚
