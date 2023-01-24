import java.io.IOException;
import java.io.File;
public class file {
     
    public static void main(String args[])
    {
        File f= new File("c://Users//surab//Documents//test//test1.txt");
        try{
            boolean val =f.createNewFile();
            System.out.println(val);
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}

