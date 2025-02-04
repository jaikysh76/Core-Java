class Shape {
    public void area() {
        System.out.println("Area of Triangle ");
    }
}
class Traingle extends Shape{
    public void area(int a , int b) {
        System.out.println(.5*a*b);
    }
}
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

public class OverLoading {
    public static void main(String [] args) {
     Traingle t1= new Traingle();
     t1.area(4,7);
     Circle c1= new Circle();
     c1.area(4);





    }
}
