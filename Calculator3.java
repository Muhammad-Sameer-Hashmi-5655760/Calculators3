import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
           double n1 ;
           double n2;
           char A;
           while(true){
            try{
        System.out.println("Enter a number");
        n1 = sc.nextDouble();

        System.out.println("Enter a operators (+ ; - ; * ; /)");
        A = sc.next().charAt(0);

        System.out.println("Enter a number");
        n2 = sc.nextDouble();
            }catch(InputMismatchException e){
                System.out.println("INVALID VALUE" + e);
                sc.nextLine();
                continue;
            }

        double Result = 0;

        if(A == '+'){
            Result = n1 + n2;
        }
        else if( A == '-'){
            Result = n1 - n2;

        }
        else if(A == '*'){
            Result = n1 * n2;
        }
        else if(A == '/'){
           if( n2 != 0){
            Result = n1/ n2;
           }
           else {
            System.out.println("Cannot divide by zero");
            continue;
           }
        }
        else{
            System.out.println("wrong operators ");
            continue;
        }
        System.out.println("Result " + Result);


        System.out.println("Enter zero to exist , any other number to continue ");
        int choice = sc.nextInt();
        if (choice == 0){

        break;
        }



    }

    }
}