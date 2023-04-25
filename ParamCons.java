public class ParamCons {
    int id;
    String name;
    ParamCons(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        ParamCons s1=new
        ParamCons(111,"Karma");
        ParamCons s2 = new
        ParamCons(222,"Aryan");
        s1.display();
        s2.display();
    }
}
