import java.util.Scanner;
public class exp2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num:");
        int a = sc.nextInt();
        System.out.println("Enter second num:");
        int b = sc.nextInt();

        System.out.println((int)a/b);
        System.out.println((double)a/b);
    }
}
