public class MainClass {

    public static void main (String args [] ) throws Exception {

     /*Account account = new Account("M", 100,1985);
     Account account1 = new Account("A", 500,1990);

     System.out.println(account1.getAge());

     System.out.println(account.getAge());

     int a = 1;
     doSomething(a);

     System.out.println("value of a : " + a);

     System.out.println("value of Main account.getBalance() : " + account.getBalance());
     doSomethingWithAccount(account);
     System.out.println("value of Main account.getBalance() : " + account.getBalance());

        account.name= "a";*/
       // Account.balance = 1;
       // account.balance= 2;


    /* SavingsAccount savingsAccount =  new SavingsAccount("M", 900,1985);

     savingsAccount.withdraw(750)*/;

    CurrentAccount currentAccount = new CurrentAccount("M", 1100,1985);
        CurrentAccount currentAccount1 = new CurrentAccount("M", 1100,1985);

        CurrentAccount currentAccount2 = new CurrentAccount("M", 1100,1985);

        CurrentAccount currentAccount3 = new CurrentAccount("M", 1100,1985);

        doSomethingWithAccount(currentAccount);
    System.out.println("Heere");


    }

    public static void doSomething(int j) { // int j = a;
        System.out.println("value of j : " + j);
        j = j+1;
        System.out.println("value of j : " + j);
    }

    public static void doSomethingWithAccount(Account account) throws Exception { // Account account = currentAccount

        System.out.println("value of account.getBalance() : " + account.getBalance());
        account.setBalance(200);
        System.out.println("value of account.getBalance() : " + account.getBalance());

        CurrentAccount tempAccount = new CurrentAccount("M", 1100,1985);


    }
}
