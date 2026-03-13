import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    int vowelA = 0;
    int vowelE = 0;
    int vowelI = 0;
    int vowelO = 0;
    int vowelU = 0;
    int consonant = 0;
    String sentence = "";
    char letter;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a string: ");
    sentence = input.nextLine();

    for (int i = 0; i < sentence.length(); i++) {
      letter = sentence.charAt(i);
      switch (letter) {
        case 'a':
          vowelA++;
          break;
        case 'e':
          vowelE++;
          break;
        case 'i':
          vowelI++;
          break;
        case 'o':
          vowelO++;
          break;
        case 'u':
          vowelU++;
          break;
        default:
          if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            break;
          } else {
            consonant++;
            break;
          }
      }
    }

    input.close();

    System.out.println("Times 'a' appears: " + vowelA);
    System.out.println("Times 'e' appears: " + vowelE);
    System.out.println("Times 'i' appears: " + vowelI);
    System.out.println("Times 'o' appears: " + vowelO);
    System.out.println("Times 'u' appears: " + vowelU);
    System.out.println("Consonants: " + consonant);
  }
}
