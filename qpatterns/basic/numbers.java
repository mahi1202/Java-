package qpatterns.basic;
import java.util.*;
public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        number(sc.nextInt());
    }
    static void number(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
