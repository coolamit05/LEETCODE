class Solution {
    public int minChanges(int n, int k) {
        if (n == k) 
        {
            return 0;
        }
        if ((n | k) != n) 
        {
            return -1;
        }
        
        int changes = 0;
        int xor = n ^ k;
        
        while (xor > 0) 
        {
            if ((xor & 1) == 1) 
            {
                changes++;
            }
            xor >>= 1;
        }
        
        return changes;
    }
}