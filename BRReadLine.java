import java.io.*;
 class BRReadLine {
    public static void main(String[] args) throws IOException {
        String c;
        BufferedReader br = new
        BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter 'stop' to quit.");
                // read characters
        do {
            c =  br.readLine();
            System.out.println(c);
        } while (!c.equals("stop"));
    }
}
