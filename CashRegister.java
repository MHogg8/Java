/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double payment;
   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      double total = purchase + amount;
      purchase = total;
   }

   /**
      Enters the payment received from the customer.
      @param amount the amount of the payment
   */
   public void enterPayment(double amount)
   {
      payment = amount;
   }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {   
      double fifty = 0;
      double tens = 0; 
      double fives = 0;
      double ones = 0;
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      
         double pound = Math.floor(change/1);
         double number = change%1; 
            if(number > 0.50){
               fifty = 1; 
               tens = Math.floor((number -0.50)*10);
               
            } else {
                
                  tens = Math.floor(number *10);

            
            }




         System.out.println("£1 coins: " + Math.round(pound));
         System.out.println("50p coins: " + Math.round(fifty));
         System.out.println("10p coins: " + Math.round(tens));
         System.out.println("1p coins: " + Math.round(ones));
         System.out.println("Number " + number);
    
      return change;
   }


}
