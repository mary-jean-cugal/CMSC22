
public class TestAccount {
   public static void main(String[] args) {
      // Test constructor and toString()
      Account d1 = new Account(123, 60.00);
      System.out.println(d1);  // toString()

      Account d2 = new Account(456);
     System.out.println(d2);
      // Test Setters and Getters
      d1.setBalance(80.00);
      System.out.println(d1);  // run toString() to inspect the modified instance
      System.out.println("A/C is: " + d1.getAccountNumber());
      System.out.println("Balance is is: " + d1.getBalance());

      d2.setBalance(45.00);
      System.out.println(d2);  // run toString() to inspect the modified instance
      System.out.println("A/C is: " + d2.getAccountNumber());
      System.out.println("Balance is is: " + d2.getBalance());
 
      // Test setDate()
      d1.credit(100.00);
      d1.debit(30.00);
      System.out.println(d1);  // toString()
   }
}
