public class nullexception {
    public static void main(String[] args) {
        String text= null;
        int length = text.length();
        
        try{
            System.out.println("length of text"+length);

        }
        catch(Exception e){
            System.out.println("an exception occured");
    }
}}
