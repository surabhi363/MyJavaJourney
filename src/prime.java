import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
    
        Scanner s=new Scanner(System.in);
        System.out.println("enter a no");
        int n=s.nextInt();
        
         int count=0;
         
        if(n<=1)
        System.out.println("not prime");
    

        for(int i=2;i<=n/2;i++)
        {
            if (n%i==0)
            count++;
            
        }

        if (count<1)
        System.out.println("prime no"+ count);
        else 
        System.out.println("not prime");
    }
}
