class Solution:
    def closedIsland(self, grid: list[list[int]]) -> int:
        m, n = len(grid), len(grid[0])  # ← yeh line missing thi

        def dfs(i, j):
            if i < 0 or i == m or j < 0 or j == n:
                return
            if grid[i][j] == 1:
                return
            grid[i][j] = 1
            dfs(i+1, j)
            dfs(i-1, j)
            dfs(i, j+1)
            dfs(i, j-1)
# Pass 1: Border se connected saare land ko eliminate karo
        for i in range(m):
            for j in range(n):
                if (i == 0 or i == m-1 or j == 0 or j == n-1) and grid[i][j] == 0:
                    dfs(i, j)
 # Pass 2: Baaki bache islands count karo
        ans = 0
        for i in range(m):
            for j in range(n):
                if grid[i][j] == 0:
                    dfs(i, j)
                    ans += 1
        return ans   