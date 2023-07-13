

public class SavingsAccount extends Account{


    SavingAndCurrentWithdrawal savingAndCurrentWithdrawal;

    public SavingsAccount(String name, int balance, int yearOfBirthVar) {
        super(name,balance,yearOfBirthVar);

    }

    @Override
    public int withdraw(int amount) {
        return savingAndCurrentWithdrawal.computeWithdraw(balance, amount);
    }

}
