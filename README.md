Advanced Linked List — Documentation

Date: 15 September 2026
Topic: Advanced Linked List
Language: Java
Platform: LeetCode

1. Objective

The objective of this practice session is to solve advanced Linked List problems and improve understanding of pointer manipulation, linked-list reversal, HashMap usage, doubly linked lists, caching techniques, heaps, and sorting algorithms.

. Problems Practiced
Problem 1 — LeetCode 23: Merge k Sorted Lists

Difficulty: Hard

Concept: Priority Queue / Min Heap

Description:
Merge multiple sorted linked lists into one sorted linked list.

Approach:

Insert the first node of every non-empty list into a min heap.
Remove the smallest node.
Add it to the result list.
Insert its next node into the heap.
Continue until all nodes are processed.

Time Complexity: O(N log k)
Space Complexity: O(k)

Problem 2 — LeetCode 25: Reverse Nodes in k-Group

Difficulty: Hard

Concept: Linked List Reversal

Description:
Reverse nodes of a linked list in groups of size k.

Approach:

Check whether there are at least k nodes.
Reverse exactly k nodes.
Connect the reversed group to the previous group.
Continue with the next group.
Leave the remaining nodes unchanged if fewer than k nodes remain.

Time Complexity: O(n)
Space Complexity: O(1)

Problem 3 — LeetCode 460: LFU Cache

Difficulty: Hard

Concept: HashMap + Doubly Linked List

Description:
Design a cache that removes the least frequently used item when the capacity is reached.

Approach:

Store keys and nodes using a HashMap.
Maintain separate doubly linked lists for frequencies.
Increase a node's frequency whenever it is accessed.
Track the minimum frequency.
Remove the least recently used node among nodes having the minimum frequency.

Time Complexity: O(1) average
Space Complexity: O(capacity)

Problem 4 — LeetCode 432: All O(1) Data Structure

Difficulty: Hard

Concept: HashMap + Doubly Linked List

Description:
Design a data structure supporting increment, decrement, minimum-key and maximum-key operations in constant time.

Approach:

Store each key and its frequency bucket.
Maintain frequency buckets in a doubly linked list.
Move keys between buckets when their frequency changes.
The first bucket contains minimum-frequency keys.
The last bucket contains maximum-frequency keys.

Time Complexity: O(1) average
Space Complexity: O(n)

Problem 5 — LeetCode 146: LRU Cache

Difficulty: Medium

Concept: HashMap + Doubly Linked List

Description:
Implement a cache that removes the least recently used item when capacity is exceeded.

Approach:

Use a HashMap for constant-time lookup.
Use a doubly linked list to maintain usage order.
Move recently accessed nodes to the front.
Remove the node at the end when the cache becomes full.

Time Complexity: O(1)
Space Complexity: O(capacity)

Problem 6 — LeetCode 138: Copy List with Random Pointer

Difficulty: Medium

Concept: HashMap / Deep Copy

Description:
Create a completely independent copy of a linked list where each node contains both next and random pointers.

Approach:

Create a copy of every original node.
Store original-to-copy relationships in a HashMap.
Traverse the list again.
Assign next and random pointers using the HashMap.
Return the copied head.

Time Complexity: O(n)
Space Complexity: O(n)

Problem 7 — LeetCode 148: Sort List

Difficulty: Medium

Concept: Merge Sort

Description:
Sort a linked list in ascending order.

Approach:

Find the middle using slow and fast pointers.
Split the list into two halves.
Recursively sort both halves.
Merge the sorted halves.
Return the sorted list.

Time Complexity: O(n log. Important Concepts Learned
Fast and Slow Pointers

Used to find the middle of a linked list efficiently.

Dummy Node

Simplifies insertion, deletion, reversal, and boundary cases.

Linked List Reversal

Important for problems such as reversing groups and sorting.

HashMap

Provides approximately constant-time lookup and is useful for cache and deep-copy problems.

Doubly Linked List

Allows efficient insertion and deletion from both ends.

Priority Queue

Useful for efficiently merging multiple sorted linked lists.

Merge Sort

Suitable for sorting linked lists because linked lists can be split and merged efficiently.

4. Test Cases

The following cases were considered during testing:

Test Case	Purpose
Empty list	Validate null handling
Single node	Validate minimum input
Two nodes	Validate pointer operations
Odd-length list	Validate middle operations
Even-length list	Validate middle operations
Duplicate values	Validate repeated data
Multiple sorted lists	Test heap merging
k = 1	Test group reversal boundary
k > list length	Test incomplete group


5. Learning Outcomes

After completing these problems, the following skills were practiced:

Advanced pointer manipulation
Linked-list reversal
Fast and slow pointer technique
HashMap implementation
Doubly linked list implementation
LRU cache design
LFU cache design
Priority Queue usage
Merge Sort
Deep-copy techniques
Edge-case handling
Complexity analysis
6. GitHub Organization
LeetCode/
└── 2026-09-15-Hard-LinkedList/
    ├── 23-MergeKSortedLists.java
    ├── 25-ReverseNodesInKGroup.java
    ├── 460-LFUCache.java
    ├── 432-AllO1DataStructure.java
    ├── 146-LRUCache.java
    ├── 138-CopyListWithRandomPointer.java
    ├── 148-SortList.java
    └── README.md
7. Daily Progress

Problems Completed: 7/7

GitHub Commits: 56

Topic: Advanced Linked List

Status: Completed

Next Step: Continue with the next scheduled DSA topic and maintain the daily LeetCode and GitHub practice.

8. Conclusion

The Advanced Linked List practice session provided experience with both basic pointer manipulation and complex data-structure design. Problems involving LRU Cache, LFU Cache, All O(1) Data Structure, Merge k Sorted Lists, and Reverse Nodes in k-Group strengthened the understanding of efficient algorithms and data structures.

The session also emphasized writing optimized Java solutions, analyzing time and space complexity, testing edge cases, and maintaining organized GitHub documentation.
Cache capacity = 0	Test cache boundary
Cache capacity = 1	Test eviction
Null random pointer	Test deep copy
Unsorted list	Test merge sort n)
Space Complexity: O(log n) due to recursion.
