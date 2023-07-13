public class Account {

    protected int balance;
    public String name;

    protected int yearOfBirth;

    public void setBalance( int balanceVar)  {
        if (balanceVar > 0) {
            this.balance = balanceVar;
        } else {
           // throw new Exception("Balanced passed is below 0");
        }


    }



    public int getAge () {
        return 2023-yearOfBirth;
    }


    public Account(String name, int balance, int yearOfBirthVar) {
        this.balance = balance;
        this.name = name;
        this.yearOfBirth = yearOfBirthVar;
    }

    public Account( int balance) {
        this.balance = balance;
    }

    public Account(){

    }



    public int getBalance() {
        return balance;
    }

    public int withdraw(int amount) {
        balance = balance - amount;
        return amount;
    }
}
