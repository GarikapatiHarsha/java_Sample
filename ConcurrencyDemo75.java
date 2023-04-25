public class ConcurrencyDemo75 extends Thread {
    public static int amount = 0;
    public static void main(String[] args) {
        ConcurrencyDemo75 thread =new ConcurrencyDemo75();
        System.out.println(amount);
        thread.start();
        while(thread.isAlive()){
            System.out.println("Waiting....Thread finished");
        }
        System.out.println(amount);
        System.out.println(amount);
    }
    public void run(){
        amount++;
    }
    
}
