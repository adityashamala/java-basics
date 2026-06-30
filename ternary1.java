import java.util.Scanner;
public class ternary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = sc.nextInt();
        String result = (a%2==0) ?"Even" :"Odd";
        System.out.println(result);
    }
}
