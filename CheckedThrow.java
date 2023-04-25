

public class CheckedThrow {
    public static void main(String[] args) {
        FileInputStream fis = null;
        fis = new FileInputStream("d:/myfile.txt");
        int k;
        while((k = fis.read()) != -1){
            System.out.println((char)k);
        }
        fis.close();
    }
}
