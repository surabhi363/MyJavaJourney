 import java.util.Scanner;
 public class scannner_input {
public static void main(String args[]) {
    Scanner s= new Scanner(System.in);
    System.out.println("enter");
    int a = s.nextInt();
    System.out.println(" you enterd number" +a);
    String c = s.nextLine();
    System.out.println("You entered string " + c);

     float b = s.nextFloat();
    System.out.println("You entered float " + b);

} 

 }