
class Pen {
    String color;
    String types;
    public void write(){

        System.out.println("Write Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.types);
    }

}
class Student {
    String name ;
    int rollNo;
    int mobile;
    String address;
    public void studentDetails(){
        System.out.println(this.name);
        System.out.println(this.rollNo);
        System.out.println(this.mobile);
        System.out.println(this.address);
    }
    Student(String name, int rollNo) {
        this.name= name;
        this.rollNo = rollNo;
    }
    Student (Student s2) {
        this.name= s2.name;
        this.rollNo= s2.rollNo;
    }
    Student () {

    }
}
public class OPPS {
    public static void main(String [] args) {
        Pen pen1= new Pen();
        pen1.color="red";
        pen1.types= "ball pen";
        pen1.write();
        pen1.printType();
        pen1.printColor();

        Pen pen2 =new Pen();
        pen2.color= "black";
        pen2.types="gel pen";
        pen2.printType();
        pen2.write();
        pen2.printColor();

        Student st = new Student();

        Student s2= new Student(st);



        st.mobile =123;
        st.address= "Bihar";
        s2.studentDetails();
    }
}
