public class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = mul(slow);              
            fast = mul(mul(fast));
        } while (slow != fast);

        return slow == 1;
    }
    private int mul(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}
