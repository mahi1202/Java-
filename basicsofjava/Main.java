// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespac
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner sc=new Scanner(System.in);
        System.out.println("check the number is positive or negative");
        System.out.println("Enter your number:");
        double a= sc.nextDouble();
        if (a<0){
            System.out.println("given number is Negative");
        } else if (a==0) {
            System.out.println("given number is 0");
        }else {
            System.out.println("given number is positive");
        }
    }
}
