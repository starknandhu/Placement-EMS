// 2 number to be printed . 3 number of times to be printed.


import java.util.*;

public class General {
     

     public static void main(String[] args) {
          int a,b;
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number to be printed : ");
          a = sc.nextInt();
          System.out.print("Enter the number of times to be printed : ");
          b = sc.nextInt();
          for(int i=1;i<=b;i++){
               System.out.println(a);
          }
          sc.close();
     }
}
