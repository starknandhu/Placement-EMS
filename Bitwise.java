import java.util.*;

public class Bitwise {

     static int xSum(int n, int m) {
          int res = 0;
          int mul = 1;
          int val;
          while (true) {
               if (n == 0 && m == 0) {
                    break;
               }
               val = ((n % 10) + (m % 10));
               val %= 10;

               res = (val * mul) + res;

               n = n / 10;
               m = m / 10;

               mul *= 10;
          }
          return res;
     }

     public static void main(String[] args) {
          int n, m;
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the first number : ");
          n = sc.nextInt();

          System.out.print("Enter the Second number : ");
          m = sc.nextInt();

          System.out.println(xSum(n, m));
          sc.close();
     }
}
