import java.io.File;

public class list {
    public static void main(String[] args) {
        File f=new File("c://Users//surab//Documents//test//");
        String[] names =f.list();
        for (String s: names) {
       System.out.println(s);
        }
    }
    
}
