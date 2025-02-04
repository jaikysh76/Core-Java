
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
class student {
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
    student(String name, int rollNo) {
        this.name= name;
        this.rollNo = rollNo;
    }
    student(student s2) {
        this.name= s2.name;
        this.rollNo= s2.rollNo;
    }
    student() {

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

        student st = new student();

        student s2= new student(st);



        st.mobile =123;
        st.address= "Bihar";
        s2.studentDetails();
    }
}
