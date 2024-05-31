public class CreditCard {
    Money balance = new Money(0.0);
    Money creditLimit;
    Person owner;

    CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = creditLimit;
    }

    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        balance = balance.add(amount);
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }
}
