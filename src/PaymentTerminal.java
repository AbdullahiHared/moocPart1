public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000.00;
    }

    // Payment by card
    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.50) {
            this.money+=2.50;
            card.takeMoney(2.50);
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.30) {
            card.takeMoney(4.30);
            this.money += 4.30;
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    // Payment by cash
    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
            this.money += 2.50;
            this.affordableMeals++;
            return payment - 2.50;
        }
        return payment;  // return the same payment if not enough money
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30) {
            this.money += 4.30;
            this.heartyMeals++;
            return payment - 4.30;
        }
        return payment;  // return the same payment if not enough money
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
       card.addMoney(sum);
    }

    public String toString() {
        return "money: " + this.money + ", number of sold affordable meals: " + this.affordableMeals +
                ", number of sold hearty meals: " + this.heartyMeals;
    }
}
