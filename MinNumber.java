public class MinNumber {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Hiba: Legalább 2 szám szükséges");
      return;
    }
    int min = Integer.parseInt(args[0]);
    for (int i = 1; i < args.length; i++) {
      int num = Integer.parseInt(args[i]);
      if (num < min) {
        min = num;
      }
    }
    System.out.println("A legalacsonyabb szám: " + min);
  }
}
