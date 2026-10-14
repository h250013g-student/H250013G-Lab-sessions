enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
    final int value;
    Coin(int value) { this.value = value; }
}
public class Exercise5CoinChange {
    public static void main(String[] args) {
        int amount = 41;
        for (Coin coin : new Coin[]{Coin.QUARTER, Coin.DIME, Coin.NICKEL, Coin.PENNY}) {
            int count = amount / coin.value;
            if (count > 0) {
                System.out.println(coin + ": " + count);
                amount %= coin.value;
            }
        }
    }
}
