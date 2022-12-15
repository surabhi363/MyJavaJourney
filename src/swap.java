//Java Program to Swap Two Numbers
//URL https://www.geeksforgeeks.org/java-programming-examples/

import java.util.*;
class swap {
    public static void main(String args[]){
        int m=9,n=5;
        swap a=new swap();
       a.swap(m,n);
    }
    void swap(int m,int n) {

        int temp=m;
        m=n;
        n=temp;
        System.out.println("value of m "  +m+   " and value of n is " +n);
    
    }
}