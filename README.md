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

Time Complexity: O(n log n)
Space Complexity: O(log n) due to recursion.
