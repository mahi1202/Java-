package qpatterns.basic;
import java.util.Scanner;
public class invhalfpyr {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=n;i>=1;i--){                     //littel bit changes in code
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
