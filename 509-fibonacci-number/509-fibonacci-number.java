class Solution {
    public int fib(int n) {
        int sum = 0;
        if (n == 0) {
            return 0;
        } else {
            int secondLast = 0;
            int last = 1;
            sum = secondLast + last;
            for (int i = 2; i <= n; i++) {
                sum = last + secondLast;
                secondLast = last;
                last = sum;
            }
        }
        return sum;
    }
}