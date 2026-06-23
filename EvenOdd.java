import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        sc.close();
    }
    
}
//logic -> we will check that the number is divisible by two or not by using modulo(%) operator 
