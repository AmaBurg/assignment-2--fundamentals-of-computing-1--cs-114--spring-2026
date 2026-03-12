public class CountFlips {
  public static void main(String[] args) {
    int Heads = 0;
    int Tails = 0;
    Coin coinFlips = new Coin();

    for (int i = 0; i < 100; i++) {
      coinFlips.flip();
      if (coinFlips.isHeads()) {
        Heads++;
      } else {
        Tails++;
      }
    }

    System.out.println("Heads: " + Heads);
    System.out.println("Tails: " + Tails);
  }
}
