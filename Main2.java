class Animal{
    public void animalSound(){
        System.out.println("The animal make a sound ");
    }
}
class Dog extends Animal{
    public void animalSound(){
        super.animalSound();
        System.out.println("The dog says:bow wow");
    }
}
public class Main2 {
    public static void main(String[] args) {
        Animal myDog=new Dog();
        myDog.animalSound();
    }
}
