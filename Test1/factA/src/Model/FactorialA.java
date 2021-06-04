package Model;

public class FactorialA {
    public long calculate(int x) throws Exception {
        if(x>=0) { //only positive whole numbers are allowed
            int result = 1;
            while (x > 0) { //will loop until no more numbers are left to be multiplied
                result *= x; //get next number
                x--; //x now becomes the number we'll be multiplying with next
            }
            return result;
        }
        throw new Exception("x must be greater than or equal to zero");
    }
}
