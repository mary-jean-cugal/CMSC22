

public class ShapeTest {
   public static void main(String[] args) {
      // Test constructor and toString()
      Shape s = new Shape();
      System.out.println(s);  // toString()

     Shape s1 = new Shape("yellow", false);
      System.out.println(s1);
      // Test Setters and Getters
      s1.setColor("blue");
      System.out.println(s1);
      System.out.println(s1.getColor());

      s1.setFilled(true);
      System.out.println(s1);
      System.out.println(s1.isFilled());

   }
}