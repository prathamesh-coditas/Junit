public class Division {
    public int div(int a,int b){
        if(b==0)
            throw new ArithmeticException("B value should be non-zero Number==>"+b);
        return (a/b);
    }
}
