


public class reverse {
    public static void main(String args[]){
        String input="string";
        char ch[]=input.toCharArray();
        String rev="";
        for ( int i=ch.length-1;i>=0;i--){
            rev=rev+ch[i];
        }
            System.out.println(  rev);
        
    }
    
}
