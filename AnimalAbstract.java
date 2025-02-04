abstract class Animal{
    abstract void walk() ;
}
class Horse extends Animal {
    public void walk() {
        System.out.println("he walk on four legs ");
    }
}
class Dog extends Animal{
    public void walk (){
        System.out.println("dog");
    }
}
public class AnimalAbstract {
    public static void main(String [] args) {
        Horse h1= new Horse();
        h1.walk();
        Dog d1= new Dog();
        d1.walk();
    }
}
