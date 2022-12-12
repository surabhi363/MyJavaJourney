 
 import java.util.Scanner;
 public class fibbo {

    public static void main(String args[]) 
     {   
        Scanner reader= new Scanner(System.in);
        System.out.print("Enter a number ? : ");
        int num=reader.nextInt();
        int first=0,second=1;
       for(int i=1;i<=num;++i)
       {
     System.out.print(first+" ");

     int next=first+second;
     first=second;
     second=next;
    }


    }

}
