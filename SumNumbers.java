public class SumNumbers {
    public static void main(String[] args) {
        if (args.length < 2) {
          System.out.println("Hiba: Legalább 2 szám szükséges");
          return;
        }
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
          int num = Integer.parseInt(args[i]);
          sum += num;
        }
        System.out.println("A számok összege: " + sum);
      }
}
