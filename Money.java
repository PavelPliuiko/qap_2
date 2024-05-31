public class Money {
    long dollars;
    long cents;

    Money(double amount) {
        dollars = (long) amount;
        cents = (long) (amount * 100 % 100);
    }

    Money(Money money) {
        this.dollars = money.dollars;
        this.cents = money.cents;
    }

    public Money add(Money money) {
        long totalCents = this.dollars * 100 + this.cents + money.dollars * 100 + money.cents;
        return new Money(totalCents / 100.0);
    }

    public Money subtract(Money money) {
        long totalCents = this.dollars * 100 + this.cents - (money.dollars * 100 + money.cents);
        return new Money(totalCents / 100.0);
    }

    public int compareTo(Money money) {
        if (this.dollars == money.dollars && this.cents == money.cents) {
            return 0;
        } else if (this.dollars < money.dollars || (this.dollars == money.dollars && this.cents < money.cents)) {
            return -1;
        } else {
            return 1;
        }
    }

    public boolean equals(Money money) {
        return dollars == money.dollars && cents == money.cents;
    }

    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }
}
