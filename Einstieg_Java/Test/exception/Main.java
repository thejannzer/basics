import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //exception = Ausnahme die den normalen Ablauf des Programms unterbricht

        System.out.println("Enter a whole number: ");
        try{
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        
        System.out.println("Enter a whole number to divide by: ");
        int y = scanner.nextInt();

        int z = x/y;
        System.out.println("result: " + z);
        }
        catch(ArithmeticException e){     //(Exception Typ, Name)  
            System.out.println("You can't divide by Zero");
        }
        catch(InputMismatchException e){  
            System.out.println("Please enter a Number");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}