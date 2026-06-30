import java.util.Scanner;
public class sum_of_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while (n!=0){
            int digit = n%10;
            n = n/10;
            sum+=digit;
        }
        System.out.println(sum);
    }
}
