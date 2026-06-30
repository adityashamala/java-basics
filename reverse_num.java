import java.util.Scanner;
public class reverse_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse =0;
        while(true){
            int digit = n%10;
            reverse = reverse*10 + digit;
            n=n/10;
            if(n==0){
                System.out.println(reverse);
                break;
            }
        }
    }
}                                                                                            
