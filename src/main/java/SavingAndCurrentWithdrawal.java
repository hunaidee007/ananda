public class SavingAndCurrentWithdrawal {

    public int computeWithdraw(int balance, int amount) {
        int tempBalance = balance - amount;
        if ( tempBalance < 100) {
            return -1;
        } else {
            balance = balance - amount;
        }
        return balance;
    }
}
