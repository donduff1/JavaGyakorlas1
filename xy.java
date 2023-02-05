public class xy {
    public static void main(String[] args) {
        if (args.length != 2) {
          System.out.println("Hiba: 2 szám szükséges");
          return;
        }
    
        try {
          int x = Integer.parseInt(args[0]);
          int y = Integer.parseInt(args[1]);
          if (x > y) {
            System.out.println("Kevesebb vagy ugyanannyinak kell lennie");
            return;
          }
    
          for (int i = x; i <= y; i++) {
            System.out.println(i);
          }
        } catch (NumberFormatException e) {
          System.out.println("Hibás adat");
        }
      }
}
