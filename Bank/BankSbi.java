package Bank;

class Account {
   public String name;
   protected String email;
   private String password;  // we can  access using getter setter method

   public String getPassword() {
      return this.password ;
   }
   public void setPassword(String pass) {
      this.password = pass;
   }
}
public class BankSbi {
  public static void main(String [] args) {
     Account acc1= new Account();
     acc1.name ="cust1";
     acc1.email ="jaiky123@gmail.com";
     acc1.setPassword("tera Bap");
     System.out.println(acc1.getPassword());
  }

}
