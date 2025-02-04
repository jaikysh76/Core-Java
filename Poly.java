class Student1 {
    String name;
    int rollNo;
    String dept;
    String address;

    public void studentInfo(String name) {
        System.out.println(name);
    }
    public void studentInfo(int rollNo) {
        System.out.println(rollNo);
    }
    public void studentInfo(String name, int rollNo, String dept, String address) {
        System.out.println(name + " " + rollNo+ " " +dept+ " " +address);
    }
}
public class Poly {
    public static void main(String [] args) {
        Student1 st = new Student1();
        st.name= "Jaiky";
        st.rollNo = 1;
        st.address ="Bihar";
        st.dept ="CSE";

        st.studentInfo(st.name);
        st.studentInfo(st.rollNo);
        st.studentInfo(st.name, st.rollNo,st.address, st.dept);



    }
}
