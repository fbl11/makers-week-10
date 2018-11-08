# Algorithmic Complexity

Makers apprenticeship course week 10.

## Learning objectives

By the end of this week, the goal is to be able to answer "yes" to these questions:

* **Can you mention efficiency as one of the dimension of a good piece of code**
* **Can you join a conversation about algorithms and their complexity?**

### Timing code

Using Java, created code to test execution time for methods (among others):
* `last` (builtin)
* `reverse` (builtin)
* `shuffle` (builtin)
* `sort` (builtin)

### Build your own algorithms

Here are a few algorithms you should try to implement and optimise:

#### Shuffling
Implement your own algorithm for shuffling (you cannot use `.shuffle`).
Graphs:
![DIY Shuffle optimised](/graphs/DIYShuffleOptimised.png)
![Shuffle BuiltIn vs Shuffle DIY optimised](/graphs/ShuffleBuiltInVsDIYOptimised.png)
![Shuffle BuiltIn vs Shuffle DIY not optimised](/graphs/ShuffleBuiltInVsDIYNotOptimised.png)
![DIY Shuffle optimised vs Shuffle DIY not optimised](/graphs/ShuffleDIYVsDIYoptimised.png)
[My Code](https://github.com/fbl11/makers-week-10/blob/master/src/main/java/com/makers/week10/weeklyChallenge/algorithms/exercises/ShuffleList.java)

#### Sorting into groups
Given a list of names, randomly sort those into groups of equal size (no more than one person difference)
Graph:
![Sort into groups](/graphs/SortIntoGroupsDIY.png)
[My Code](https://github.com/fbl11/makers-week-10/blob/master/src/main/java/com/makers/week10/weeklyChallenge/algorithms/exercises/SortIntoGroups.java)

#### Sorting 0s and 1s
Given an array containing only 0s and 1s, sort it.
![Sort Zeros and Ones](/graphs/SortZerosAndOnes.png)
[My Code](https://github.com/fbl11/makers-week-10/blob/master/src/main/java/com/makers/week10/weeklyChallenge/algorithms/exercises/SortZerosAndOnes.java)

#### MergeSort DIY
Implements a merge sort algorithm - looks very inefficient, need to look at implementation again.
![MergeSort DIY](/graphs/MergeSortDIY.png)
![MergeSort DIY vs BuiltIn Sort](/graphs/DIYMergeSortVsBuiltInSort.png)
[My Code](https://github.com/fbl11/makers-week-10/blob/master/src/main/java/com/makers/week10/weeklyChallenge/algorithms/exercises/MergeSortDIY.java)

#### Reversing
Implement your own algorithm for reversing an array (you cannot use `.reverse`).

#### Mechacoach Pairing
Given a list of students names, create all possible pairings.

#### Find Duplicates
Given a list of words, find all words that appear more than once.

#### Most frequent words
Given a text, find which are the ten most common words.

#### Sorting
Implement your own algorithm for sorting an array (you cannot use `.sort`).

#### Sub-sequence sum
Given an array of integers and a target number, find if there exist a sequence of numbers that sum up to the target.

For example:

| array | target | expected return |
|-------|--------|--------------|
|`[10,3,1,7]`|`8`| should return `true` (because 1+7 = 8) |
|`[10,3,1,7]`|`10`| should return `true` (because 10 is in the array) |
|`[10,3,1,7]`|`21`| should return `true` (because the sum of the whole array return 21) |
|`[10,3,1,7]`|`22`| should return `false` (because you can't reach 22 by summing all numbers) |
|`[10,3,1,7]`|`17`| should return `false` (because 10 and 7 are not next to each other) |

#### 1. Know your data structures.

Common operations might be more expensive than you think. By checking how different structures (arrays, hashtables…)  work in memory, you’ll be able to save on simple operations.

**Resources**:
* [Here’s a table that shows the cost of operations on different data structures](https://en.wikipedia.org/wiki/Dynamic_array#Performance)
* [More on hashtables](https://www.interviewcake.com/concept/java/hash-map)
* [Arrays](https://www.interviewcake.com/concept/python/array?) and [Dynamic Arrays](https://www.interviewcake.com/concept/python/dynamic-array)
* [Introduction to ruby hashes (an example of hash tables)](https://launchschool.com/blog/how-the-hash-works-in-ruby
)

#### Additional resources

* [A video introducing algorithmic efficiency](https://www.youtube.com/watch?v=u2iHB2vv3iE)
* [A guide to big O notation and complexity](https://www.interviewcake.com/article/python/big-o-notation-time-and-space-complexity?)

Author of these solutions: [fbl11](https://github.com/fbl11/makers-week-10)