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

### 2. Maximum Subarray
- Date: 2026-06-05
- Status: Concept understood
- Core idea: Use a running sum and keep the best sum seen so far.
- Important learning: If the running sum becomes negative, reset it to `0` before the next element because carrying a negative sum makes the next subarray worse.
- Kadane's idea: At each element, decide whether to continue the previous subarray or start fresh from the current element.
- Common mistakes noticed:
  - Reset on `start < 0`, not on `start == 0`.
  - Return `max`, not the current running sum.
  - Do not add the same element again after resetting.

### 3. Move Zeroes
- Date: 2026-06-05
- Status: Attempted
- Core idea: Move all non-zero values forward while keeping their order, then zeroes should end up at the back.
- Approach tried: Double loop to find the next non-zero after a zero and swap it forward.
- Important learning: Swap only when `nums[i] == 0 && nums[j] != 0`, and use `break` after the swap because the current zero position has been fixed.
- Common mistakes noticed:
  - Do not use `nums[j++]` as a statement; the loop already increments `j`.
  - `moveZeroes` is `void`, so call it first and print the array separately.
  - `System.out.println(nums)` prints the array reference; use `Arrays.toString(nums)` for local testing.
