# DSA Progress Record

Started: 2026-06-04

## Rules
- First think and explain the approach.
- Do not ask for full code first.
- Get hints, then write code by yourself.
- Review syntax and logic mistakes after attempting.
- Full solution only when explicitly requested.

## Problems

### 1. Best Time to Buy and Sell Stock
- Date: 2026-06-04
- Status: In progress
- Core idea: Track the minimum price seen so far, calculate today's profit using `prices[i] - min`, and keep the maximum profit.
- Important learning: Do not sort the array because day order matters. Buy must happen before sell.
- Common mistakes noticed:
  - Use `prices.length`, not `prices`.
  - Keep `return max` outside the loop.
  - Calculate profit every iteration, not only when minimum changes.
  - Compare `profit > max`, then update `max`.
  - Use `System.out.println`, not `System.out.prinln`.
