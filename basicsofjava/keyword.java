//calculator by if else
import java.util.*;

public class keyword{
    public static void main (String[]args){
        System.out.println("select 1 for addition");
        System.out.println("select 2 for substraction");
        System.out.println("select 3 for multiplication");
        System.out.println("select 4 for division");
        Scanner sc=new Scanner(System.in);
       int button=sc.nextInt();
       if(button==1){
           System.out.println("Enter number for addition");
           int a= sc.nextInt();
           int b= sc.nextInt();
           int sum=a+b;
           System.out.println("addition of two numbers is :"+sum);
       } else if (button==2) {
           System.out.println("Enter number for substraction");
           int o= sc.nextInt();
           int p= sc.nextInt();
           int sub=o-p;
           System.out.println("substraction of two numbers is :"+sub);
       } else if (button==3) {
           System.out.println("Enter number for multiplication");
           int x= sc.nextInt();
           int y= sc.nextInt();
           int mul=x*y;
           System.out.println("multiplication of two numbers:"+mul);
       } else if (button==4) {
           System.out.println("Enter number for division");
           int u= sc.nextInt();
           int v= sc.nextInt();
           int div=u/v;
           System.out.println("division of two numbers:"+div);
       }else {
           System.out.println("INVALID CONDITION");
       }
    }
}
