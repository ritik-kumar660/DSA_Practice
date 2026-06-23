import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("Not a Prime Number");
        }
        else{
            int d=1;
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    d++;

                }


            }
            if(d==2){
                System.out.println("Prime number");
            }
            else{
                System.out.println("Not a prime number");
            }
        }
    }
}
//Logic -> we are  using a count var for number of divisors as we all know that prime number has only 2 divisors 1 and number itself 
