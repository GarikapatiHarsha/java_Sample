public class StaticBlocks {
    static int a=20;
    static int b;
    static int c;
    static{
        System.out.println("First Static block.");
        b=a*4;
    }
    static{
        System.out.println("Second Static block.");
        c=35;
    }
    static void display(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
    public static void main(String[] args) {
        display();
    }
}
