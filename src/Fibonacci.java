// TODO: Read N
// TODO: Handle base cases (N=1 -> 0, N=2 -> 1)
// TODO: Calculate the Nth number for N > 2
// TODO: Print the result
import java.util.Scanner;
public class Fibonacci {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int a = 0;
                int b = 1;
                if(n == 1){
                        System.out.println(a);
                }
                else if(n == 2){
                        System.out.println(b);
                }
                else{
                        for(int i=3; i<=n;i++){
                                int c = a+b;
                                a = b;
                                b = c;
                        }
                        System.out.println(b);
                }
        }
        
    
}
