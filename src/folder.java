import java.io.*;
public class folder {
    public static void main(String[] args) {
        File f=new File("c://Users//surab//Documents//test//p1");
       boolean val= f.mkdir();
       System.out.println(val);
    }
}
