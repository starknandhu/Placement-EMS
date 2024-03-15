import java.util.*;
public class Add {

     static void addition(int num){
          int res=0;
          int rem=0;
          while (true) {
               if(num==0){
                    break;
               }          
               else{
                    rem=num%10;
                    res=rem+res;
                    num=num/10;
               }     
          }
          System.out.println(res);
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num=sc.nextInt();
          addition(num);
          sc.close();
     }
}
