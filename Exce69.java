import java.io.IOException;

class ThrowsExample {
    void mymethod (int num) throws IOException, ClassNotFoundException{
        if(num == 1)
        throw new IOException("IOException Occcurred");
        else
        throw new ClassNotFoundException("ClassNotFoundException");
    }
}
public class Exce69{
    public static void main(String[] args) {
        try{
            ThrowsExample obj = new ThrowsExample();
            obj.mymethod(1);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
