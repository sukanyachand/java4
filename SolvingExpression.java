package sumnumber;

public class SolvingExpression {

    public static void main(String[] args) {
        // session 1 assignment 4
        int sum1 = 0,sum2 = 0,sum3 = 0,sum4 = 0;
        int x = 5, y = 10;
        sum1 = x + y * 2;
        System.out.println("Value of sum1:"+sum1);
        sum2 = x - y + 2;
        System.out.println("Value of sum2:"+sum2);
        sum3 = (x + y) * 2;
        System.out.println("Value of sum3:"+sum3);
        sum4 = y % x;
        System.out.println("Value of sum4:"+sum4);
    }
    
}
