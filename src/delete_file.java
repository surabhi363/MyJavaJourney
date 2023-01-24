import java.io.IOException;
import java.io.File;  
public class delete_file
{
	  
	     
	    public static void main(String[] args)
	    {
	        File f= new File( "c://Users//surab//Documents//test//test1.txt");
	        try{
	        	boolean val =f.createNewFile();
	            boolean s =f.exists();
	             long d = f.length();
				 boolean de=f.delete();
	           System.out.println(val + " "+ s +" "+ d+ " "+de) ;
	        }catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        }
	    }
	
