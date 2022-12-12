
import java.util.Scanner;
public class pdrom {
    public static void main(String args[])
    {
        int num,rev=0,a,org;

        Scanner reader=new Scanner(System.in);
        System.out.println("enter a no");
          num=reader.nextInt();
        org=num;
        while(num != 0)
        {
            a=num%10;
            rev=rev*10+a;
            num= num/10;
        }
         if ( rev==org )
         System.out.println("palindrome");
         else
         System.out.println("ha ha not a palindrome");
    }

    
}
