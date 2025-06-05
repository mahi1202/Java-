package qpatterns.basic;
import java.util.Scanner;
public class continumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Number=1;

        // continues number half pyramid printing pattern

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(Number+" ");
                Number++;
            }
            System.out.println();
        }
    }
}
