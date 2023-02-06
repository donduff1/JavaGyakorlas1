public class Method1 {
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
  
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hiba: Legalább 1 szám szükséges");
            System.exit(1);
        } else {
            int[] arr = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
            System.out.println("Összeg: "+sumArray(arr));
        }
    }
    }
