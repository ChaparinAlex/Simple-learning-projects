package labs;

public class MyInitTest {
   static {
	  System.out.println("static initialization block 1\n"); 
   }
   static {
      System.out.println("static initialization block 2\n"); 
   }
   {
	   System.out.println("non-static initialization block 1\n");
   }
   {
	   System.out.println("non-static initialization block 2\n");
   }
   private MyInitTest(int a){	   
		   System.out.println("constructor 2\n");
   }
   public MyInitTest(){
	   this(0);
		   System.out.println("constructor 1\n");
   }
   
}
