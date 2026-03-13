public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    for (int i = 100; i > 97; i--) {
      System.out.println(i + " bottles of beer on the wall");
      System.out.println(i + " bottles of beer");
      System.out.println("If one of those bottles should happen to fall");
      System.out.println(i - 1 + " bottles of beer on the wall");
      System.err.println();
    }
  }
}
