class Solution {
    public boolean canAliceWin(int n) {
        int stonesToRemove = 10;
        boolean isAliceTurn = true;
        
        // Keep playing as long as there are enough stones for the current turn
        while (n >= stonesToRemove) {
            n -= stonesToRemove;           // Remove the stones from the pile
            stonesToRemove--;              // Next player must remove 1 fewer stone
            isAliceTurn = !isAliceTurn;    // Switch turns between Alice and Bob
        }
        
        // If the loop ends on Bob's turn, Bob couldn't move, so Alice wins!
        // If it ends on Alice's turn, Alice couldn't move, so she loses.
        return !isAliceTurn;
    }
}
