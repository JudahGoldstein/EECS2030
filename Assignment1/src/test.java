public class test {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        for(int x = 0; x < 20; x++) {
            System.out.println(f.compute(x));
        }
    }
}