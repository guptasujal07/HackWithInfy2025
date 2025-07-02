
# HackWithInfy2025 – Greedy Problems

This repository contains solutions to greedy problems commonly asked in coding interviews and contests. Each problem includes a brief explanation, input/output format, and the Java solution.

---

## 📘 What is Greedy Approach?

**Greedy Algorithm** is an algorithmic paradigm that builds up a solution piece by piece, always choosing the option that offers the most immediate benefit (locally optimal choice) at each step with the hope that this leads to a globally optimal solution.

### 🧠 Key Characteristics:
- Makes a **greedy choice** at each step.
- Does **not revisit or revise** past decisions.
- Efficient and fast but doesn't always guarantee the best solution.
- Works best when the problem exhibits the **greedy-choice property** and **optimal substructure**.

---

## ✅ Problem 1: **Coin Change (Minimum Coins)**

**Description:**  
Given an amount and a set of coin denominations, find the **minimum number of coins** required to make that amount.

**Input Format:**
```
amount
denominations (space-separated)
```

**Sample Input:**
```
93  
1 2 5 10 20 50 100
```

**Output Format:**
```
Minimum number of coins
```

**Sample Output:**
```
5
```

**Approach Summary:**  
- Sort denominations in **descending order**  
- Pick the **largest coin** that fits the amount  
- Subtract it and repeat until amount becomes 0  
- Greedy works because Indian denominations are canonical

**Code File:** `Minimum_numberCoin.java`  
**Status:** ✅ Solved & Understood

---

## ✅ Problem 2: **Job Scheduling to Maximize Profit**

**Description:**  
Given `n` jobs with deadlines and profits, schedule jobs to **maximize profit**. Each job takes exactly 1 unit of time.

**Input Format:**
```
n  
job_id1 deadline1 profit1  
job_id2 deadline2 profit2  
...
```

**Sample Input:**
```
4  
a 4 20  
b 1 10  
c 1 40  
d 1 30
```

**Sample Output:**
```
60
```

**Approach Summary:**  
- Sort jobs by **profit descending**  
- Use a boolean slot array for time slots  
- Schedule each job in the **latest available slot** before its deadline  
- Greedy ensures max profit with available time

**Code File:** `Job_sequencing.java`  
**Status:** ✅ Solved & Understood

---

## ✅ Problem 3: **Activity Selection Problem**

**Description:**  
Given `n` activities with start and end times, select the **maximum number of activities** that don't overlap.

**Input Format:**
```
n  
start1 end1  
start2 end2  
...
```

**Sample Input:**
```
6  
1 2  
3 4  
0 6  
5 7  
8 9  
5 9
```

**Sample Output:**
```
4
```

**Approach Summary:**  
- Sort activities by **end time ascending**  
- Select first activity  
- For each next activity, check if its start ≥ last selected's end  
- Greedy works because choosing the earliest finishing activity leaves max room for others

**Code File:** `Activity_problem.java`  
**Status:** ✅ Solved & Understood

---

## 📌 Summary of Learnings

- Greedy algorithms work well when **local optimum leads to global optimum**
- Sorting is often the key first step in greedy problems
- Not all problems can be solved greedily — always validate

---

Made with 💻 by Sujal Gupta
