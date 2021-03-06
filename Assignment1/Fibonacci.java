public class Fibonacci {
    public int compute(int n) {
        int result = 0;
        int carry = 1;

        for(int i = 0; i < n; ++i) {
            result += carry;
            carry = result - carry;
        }
        return result;
    }
}
