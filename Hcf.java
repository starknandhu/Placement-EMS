import java.util.*;

public class Hcf {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the first number : ");
          int num1;
          num1 = sc.nextInt();
          System.out.println("Enter the Second number : ");
          int num2;
          num2 = sc.nextInt();
          for (int i=num2;i>0;i--){
               if(num1%i==0 && num2%i==0){
                    System.out.println("The HCF number for "+num1+" and "+num2+" is "+i);
                    break;
               }
          }
          sc.close();
     }
}
