public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        System.out.println();
        return "The card has a balance of " + this.balance+ " euros";
    }

    public void eatAffordably() {
        this.balance -= 2.60;
    }

    public void eatHeartily() {
        if(this.balance >=4.60) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if(amount > 0) {
            this.balance+=amount;
        }
    }

}