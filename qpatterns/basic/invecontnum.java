package qpatterns.basic;

import java.util.Scanner;

public class invecontnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int number= 1;

        //inverted pyramid for continues numbers

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
