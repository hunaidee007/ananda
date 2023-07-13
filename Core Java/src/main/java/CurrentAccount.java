public class CurrentAccount extends Account {

    SavingAndCurrentWithdrawal savingAndCurrentWithdrawal;

    public CurrentAccount(String name, int balance, int yearOfBirthVar) throws Exception {
        if(balance<1000) {
            throw new Exception("Cannot create object of Current Account");
        } else {
            this.balance = balance;
            this.name = name;
            this.yearOfBirth = yearOfBirthVar;
        }


    }

    @Override
    public int withdraw(int amount) {
        return savingAndCurrentWithdrawal.computeWithdraw(balance, amount);
    }
}
