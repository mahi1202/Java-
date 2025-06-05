//java calculator by switch

import java.util.*;

public class calculator {
    public static void main(String[]args) {
        System.out.println("select 1 for addition");
        System.out.println("select 2 for Substraction");
        System.out.println("select 3 for multiplication");
        System.out.println("select 4 for division");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("addition");
                int x = sc.nextInt();
                int y = sc.nextInt();
                int sum = x + y;
                System.out.println("addition of two number is:" + sum);
                break;
            case 2:
                System.out.println("substraction");
                int o = sc.nextInt();
                int p = sc.nextInt();
                int sub = o - p;
                System.out.println("substraction of two number is:" + sub);
                break;
            case 3:
                System.out.println("multiplication");
                int s = sc.nextInt();
                int t = sc.nextInt();
                int mul = s * t;
                System.out.println("multiplication of two numbers is:" + mul);
                break;
            case 4:
                System.out.println("division");
                int u = sc.nextInt();
                int v = sc.nextInt();
                int div = u / v;
                System.out.println("division of two numbers is :" + div);
                break;
            case 5:
            default:
                System.out.println("invalid case");
        }
    }
}
