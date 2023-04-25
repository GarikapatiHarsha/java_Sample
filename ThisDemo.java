public class ThisDemo {
    int x;
    public ThisDemo(int x){
        this.x = x;
    }
    public static void main(String[] args) {
        ThisDemo myObj= new ThisDemo(5);
        System.out.println("Value of x = "+myObj.x);
    }
}
