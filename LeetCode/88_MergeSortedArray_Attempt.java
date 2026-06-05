class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int p = m + n - 1;

        // Attempt in progress: this nested-loop approach is not final yet.
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (num1[i] < num2[j]) {
                    num1[p] = num2[j];
                    p--;
                }
            }
        }
    }
}
