public class MandM {

    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);

        int p = 1000000;

        for (int i = 1; i <= n; i++) {
          int dp = - p / 2;
          p = p - dp;
          // int q = (1000000 - p);
        }
        System.out.println(1000000 - p);
        
    }
}