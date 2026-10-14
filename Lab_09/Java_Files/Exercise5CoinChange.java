public class Exercise5CoinChange {
    enum Coin {
        QUARTER(25), DIME(10), NICKEL(5), PENNY(1);

        final int value;

        Coin(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        int amount = 41;
        // Use the largest available denomination before moving to smaller coins.
        for (Coin coin : Coin.values()) {
            int count = amount / coin.value;
            if (count > 0) {
                System.out.println(coin + ": " + count);
                amount %= coin.value;
            }
        }
    }
}
