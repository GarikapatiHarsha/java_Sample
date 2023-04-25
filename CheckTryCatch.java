import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.SocketTimeoutException;

public class CheckTryCatch {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("D:java_pro/A.txt");
        }catch(FileNotFoundException fnfe){
            System.out.println("The specified file is not present at the given path");
        }
        int k;
        try{
            while((k = fis.read() ) != -1){
                System.out.println((char)k);
            }
            fis.close();
        }catch(Exception e){
            System.out.println("I/O error occurred"+e);
        }
    }
    
}
