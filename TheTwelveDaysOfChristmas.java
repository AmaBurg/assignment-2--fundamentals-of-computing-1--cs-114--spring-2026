public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    String suffix = "";
    for (int i = 1; i <= 12; i++) {
      switch(i) {
        case 1:
          suffix = "st";
          break;
        case 2:
          suffix = "nd";
          break;
        case 3:
          suffix = "rd";
          break;
        default:
          suffix = "th";
          break;
      }
      System.out.println("On the " + i + suffix + " day of Christmas my true love gave to me");
      switch (i) {
        case 12:
          System.out.println("Twelve drummers drumming,");
        case 11:
          System.out.println("Eleven pipers piping,");
        case 10:
          System.out.println("Ten lords a-leaping,");
        case 9:
          System.out.println("Nine ladies dancing,");
        case 8:
          System.out.println("Eight maids a-milking,");
        case 7:
          System.out.println("Seven swans a-swimming,");
        case 6:
          System.out.println("Six geese a-laying,");
        case 5:
          System.out.println("Five golden rings,");
        case 4:
          System.out.println("Four calling birds,");
        case 3:
          System.out.println("Three French hens,");
        case 2:
          System.out.println("Two turtle doves, and");
        case 1:
          System.out.println("A partridge in a pear tree.\n");
      }
    }
  }
}
