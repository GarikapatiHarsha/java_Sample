import java.nio.charset.MalformedInputException;

public class UncheckDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2=0;
        try{
            int res = num1/num2;
            System.out.println(res);
        }
        catch(ArithmeticException e){
            System.out.println("The given value is zero , so / by zero does not exist"+"Please correct the error.");
        }
    }
}
