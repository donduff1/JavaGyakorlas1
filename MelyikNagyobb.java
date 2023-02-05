public class MelyikNagyobb {
    public static void main(String[] args) {
        if (args.length == 0) {
          System.out.println("Hiba: Legalább 2 szám szükséges");
          return;
        }
    
        int evenSum = 0;
        int oddCount = 0;
        for (int i = 0; i < args.length; i++) {
          int num = Integer.parseInt(args[i]);
          if (num % 2 == 0) {
            evenSum += num;
          } else {
            oddCount++;
          }
        }
        if (evenSum > oddCount) {
          System.out.println("Párosak nyertek");
        } else {
          System.out.println("Párosak vesztettek");
        }
      }
}
