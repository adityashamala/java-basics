import java.util.Scanner;
public class switch_statement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next().charAt(0);
        switch(c){
            case '+'->System.out.println(a+b);
            case '-'->System.out.println(a-b);
            case '*'->System.out.println(a*b);
            case '/'->System.out.println(a/b);
        }
    }
}                                                                                                                              
