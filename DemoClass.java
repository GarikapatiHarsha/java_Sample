public class DemoClass {
    int a;
    void display(){
        System.out.println("a ="+ a);
    }
    static void show()
    {
        System.out.println("Hi");
    }
    DemoClass(){
        System.out.println("***WELCOM***");
    }
    public static void main(String[] args) {
        DemoClass obj1=new DemoClass();
        System.out.println("a value is"+obj1.a);
        obj1.display();
        show();
    }
}
