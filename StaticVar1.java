class Test{
    static int max=10;
    int min=5;
    static void display(){
        System.out.println("Static Method");
    }
}
public class StaticVar1 {
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println("min +1 = "+(obj.min+1));
        System.out.println("max + 1 = "+(Test.max + 1));
        System.out.println("calling static method:");
        Test.display();
    }
}
