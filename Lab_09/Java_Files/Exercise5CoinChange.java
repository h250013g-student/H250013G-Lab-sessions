public class Exercise5CoinChange {
    enum Coin { QUARTER(25), DIME(10), NICKEL(5), PENNY(1); final int value; Coin(int value){this.value=value;} }
    public static void main(String[] args) { int amount=41; for(Coin c:Coin.values()){int count=amount/c.value;if(count>0){System.out.println(c+": "+count);amount%=c.value;}} }
}
