import java.util.*;

public class Oddeven {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num=sc.nextInt();
          odd(num);
          System.out.println();
          even(num);
          sc.close();
     }

     static void odd(int num){
          int res=0;
          while(true){
               if(num==0){
                    break;
               }
               else{
                    res=num%10;
                    if(res%2!=0){
                         System.out.print(res+" ");
                    } 
               }
               num=num/10;
          }
          
     }
     
     static void even(int num){
          int res=0;
          while(true){
               if(num==0){
                    break;
               }
               else{
                    res=num%10;
                    if(res%2==0){
                         System.out.print(res+" ");
                    }
               }
               num=num/10;
          }
          
     }
}
