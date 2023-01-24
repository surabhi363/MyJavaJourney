import java.io.IOException;
import java.io.File;  
public class file1 {
	  
	     
	    public static void main(String[] args)
	    {
	        File f= new File( "c://Users//surab//Documents//test//test1.txt");
	        try{
	        	boolean val =f.createNewFile();
	            boolean s =f.exists();
	             long d = f.length();
	           System.out.println(val + " "+ s +" "+ d);
	        }catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        }
	    }
	
