public class tizenegy {
    public static void main(String[] args) {
        if (args.length != 3) {
          System.out.println("Hibás mennyiségű szám");
          return;
        }
    
        try {
          int a = Integer.parseInt(args[0]);
          int d = Integer.parseInt(args[1]);
          int n = Integer.parseInt(args[2]);
          if (n <= 0) {
            System.out.println("n-nek pozitívnak kell lennie");
            return;
          }
    
          int[] sequence = new int[n];
          for (int i = 0; i < n; i++) {
            sequence[i] = a + i * d;
          }
    
          System.out.print("Az első " + n + " eleme a számtani sorozatnak: ");
          for (int num : sequence) {
            System.out.print(num + " ");
          }
        } catch (NumberFormatException e) {
          System.out.println("Hibás adat");
        }
      }
}
