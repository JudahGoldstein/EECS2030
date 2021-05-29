public final class Fibonacci {
    public int compute(int n) {
        //initial conditions
        int result = 0;                 //f_0 = 0
        int carry = 1;                  //f_1 = 1
        //iterative approach
        for (int i = 0; i < n; ++i) {   //loop goes up to Nth term
            result += carry;            //f(x) = f(x-1) + f(x-2)
            carry = result - carry;     //f(x-1) = f(x) - f(x-2)
        }
        return result;                  //returns Nth term
    }
}
