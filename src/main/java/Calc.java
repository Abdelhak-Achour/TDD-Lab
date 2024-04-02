public class Calc {
    public static int sum(Object a, Object b) {
        try
        {
            if( (Integer) a < 0 || (Integer) b < 0)
            {
                throw new IllegalArgumentException("Error: Negative int entered, invalid.");
            }
            else
            {
                return (Integer) a + (Integer) b;
            }
        }
        catch (Exception e)
        {
            throw new IllegalArgumentException("Error: Arg has to of type int.");
        }
    }
}
