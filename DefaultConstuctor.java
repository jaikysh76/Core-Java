public class DefaultConstuctor {
    int id;
    String name;
    void display(){
        System.out.println(id+ " " +name);}
    public static void main(String[] args) {
        DefaultConstuctor s1= new DefaultConstuctor();
        s1.display();
    }
}
