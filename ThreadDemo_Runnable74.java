class T2 implements Runnable{
    public void run(){
        System.out.println("This code is running in the thread");
    }
}
public class ThreadDemo_Runnable74 {
    public static void main(String[] args) {
        T2 obj = new T2();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread ");
    }
}
