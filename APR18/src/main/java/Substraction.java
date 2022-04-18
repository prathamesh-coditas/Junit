public class Substraction {
    public int sub(int a, int b)  {
        if (a < b)
            throw new ArithmeticException("a should be greater than b==>"+b);
        return (a-b);
    }
}