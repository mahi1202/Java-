import java.util.*;

public class loop {
    public static void main(String[]args){

        //for loop

       /* for(int i = 0;i < 11;i++){
            System.out.println( i + " " );
        }

        //while loop

       int i=0;
        while(i<11){
            System.out.println(i);
            i++;
        }

        //do while loop

        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<11);*/

        //print table for any number by sing for loop

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter your number");
        for(int i=1;i<11;i++){
            System.out.println(n*i);
        }

        //print all even number till n

      /*  for(int i=1;i<=n;i++){
            System.out.println(i*2);
            }
            */

    }
}
