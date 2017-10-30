import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();
        System.out.println(fun1(v1)/(fun1(v2)*fun1(v1-v2)));
    }

    public static int fun1(int a) {
        int sum = 1;
        for (int i = a; i > 1; i--) {
            sum =sum * i;
        }

        return sum;
    }
}
