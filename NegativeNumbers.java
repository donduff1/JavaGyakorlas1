public class NegativeNumbers {
    public static void main(String[] args) {
        if (args.length == 0) {
          System.out.println("Hiba: Legalább 2 szám szükséges");
          return;
        }
    
        int count = 0;
        for (int i = 0; i < args.length; i++) {
          int num = Integer.parseInt(args[i]);
          if (num < 0) {
            count++;
          }
        }
        System.out.println("Negatív számok: " + count);
      }
}
