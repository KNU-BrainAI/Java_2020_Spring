public class Final_Q7_MoneyTransaction {
  // Create ten accounts
  
	private Account[] accounts = new Account[10];

  public Final_Q7_MoneyTransaction() {
    for (int i = 0; i < accounts.length; i++) {
      accounts[i] = new Account();
      accounts[i].setId(i);
      accounts[i].setBalance(300);
    }

    continueATM:while (true) {
      System.out.print("Enter an ID: ");
      id = input.nextInt();
      if (id < 1 || id > 10) {
        System.out.println("Please enter a correct ID");
        continue;   
      }

      while (true) {
        int choice = getAChoice();

        switch (choice) {
        case 1:
        	System.out.println("selected ID : " + id);
        	break;
        case 2:
          System.out.println("The balance is " +
            accounts[id].getBalance());
          break;
        case 3:
          withdraw();
        	
          break;
        case 4:
          deposit();
          break;
        case 5:
        	delete();
        	accounts[id]=null;
        	System.out.println("ID " + id + " deleted");
        	
        	continue continueATM; 
       
        	
        case 6:
          // You can rewrite the code without using the continue. 
          // To do so, introduce a boolean variable to control one 
          // customer session
          continue continueATM; 
        }
      }
    }
  }

  private static java.util.Scanner input = new java.util.Scanner(System.in);

  int id;

  public static void main(String[] args) {
    new Final_Q7_MoneyTransaction();
  }

  public void withdraw() {
    System.out.print("Enter an amount to withdraw: ");
    int amount = input.nextInt();
    if (amount <= accounts[id].getBalance()) {
      accounts[id].withdraw(amount);
    }
    else {
      System.out.print("The amount is too large, ignored");
    }
  }

  public void deposit() {
    System.out.print("Enter an amount to deposit: ");
    int amount = input.nextInt();
    if (amount >= 0) {
      accounts[id].deposit(amount);
    }
    else {
      System.out.print("The amount is negative, ignored");
    }
  }
  
  public void delete() {
	    System.out.print("Enter to delete an ID: ");
	    int del = input.nextInt();
	    
	    
	  
}
  


  public int getAChoice() {
    int choice;

    while (true) {
      System.out.println("\nMain menu");
      System.out.println("1: display selected ID");
      System.out.println("2: check balance");
      System.out.println("3: withdraw");
      System.out.println("4: deposit");
      System.out.println("5: delete ID");
      System.out.println("6: return to ID selection");
      System.out.print("Enter a choice: ");
      choice = input.nextInt();
      if (choice < 1 || choice > 6) {
        System.out.println("Wrong choice, try again: ");
      }
      else {
        break;
      }
    }

    return choice;
  }
}
