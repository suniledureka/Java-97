interface Bank
{
   int n = 10; 

   void deposit(float amt);
   void withdraw(float amt);
   default void gstCalculation(){
	   System.out.println("gst calculation logic");
   }
   static void method(){
	   System.out.println("static method in interface");
   }
}