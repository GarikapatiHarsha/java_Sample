import javax.sql.rowset.spi.SyncResolver;

class MyException extends Exception{
    String str1;
    MyException(String str2){
        str1=str2;
    }
    public String toString(){
        return ("MyException Occurred: "+str1);
    }
}
public class MyExceptionDemo70 {
    public static void main(String[] args) {
        try{
            System.out.println("Starting of try block");
            throw new MyException("User defined msg");
        }
        catch(MyException e){
            System.out.println("Catch Block");
            System.out.println(e);
        }
    }
}
