class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        super(s);
    }
}
public class MyException71 {
    void productCheck(int weight) throws InvalidProductException
    {
        if(weight<100){
            throw new InvalidProductException("Product Invalid");
        }
    }
    public static void main(String[] args) {
        MyException71 obj = new MyException71();
        try{
            obj.productCheck(60);
        }
        catch(InvalidProductException e){
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        }
    }
}
