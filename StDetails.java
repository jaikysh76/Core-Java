class StDetails {
    int id;
    String name;
    //creating a parameterized constructor
    StDetails(int i, String n){
        id = i;
        name = n;
    }
    //method to display the values
    void display(){System.out.println(id+" "+name);}
    public static void main(String args[]){
//creating objects and passing values
        StDetails s1 = new StDetails(64,"Dharmesh");
        StDetails s2 = new StDetails(65,"Kumar");
//calling method to display the values of object
        s1.display();
        s2.display();
    }
}