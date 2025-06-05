import java.util.Scanner;

public class simple {

    public static void main (String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int a= sc.nextInt();
        System.out.println("enter second number:");
        int b= sc.nextInt();
        int sum= a+b;
        int sub=a-b;
        System.out.println("addition of two numbers:"+sum);
        System.out.println("difference of two numbers:"+sub);
    }
}



