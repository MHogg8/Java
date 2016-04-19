import java.util.Scanner;

/**
   A class to test the CashRegister class.
*/
public class CashRegisterTest
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();
      //register.recordPurchase(13.50);
      //register.recordPurchase(2.25);
      //register.enterPayment(20);

      Scanner in = new Scanner(System.in); // listens for a new screen for an input (conslole)
      System.out.println("Price for first item: ");
      double price1 = in.nextDouble(); // defines the variable

      System.out.println("Price for the second items: ");
      double price2 = in.nextDouble();

      System.out.println("Payment amount: ");
      double amount = in.nextDouble();

      register.recordPurchase(price1);
      register.recordPurchase(price2);
      register.enterPayment(amount);
    
      double change = register.giveChange();
      System.out.println(change);   

   }
}
