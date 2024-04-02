public class Calc {
    public static int sum(int a, int b) throws NegativeArgException {
        if( a < 0 || b < 0)
        {
            throw new NegativeArgException("Error: Negative int entered, invalid.");
        }
        else
        {
            return a + b;
        }
    }
}
