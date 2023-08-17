import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int a=scan.nextInt();
        System.out.println("enter a number");
        int b=scan.nextInt();
 try{
            System.out.println(a/b);

        }
        catch(Exception e){
           System.out.println("you entered o please enter aother number");
            System.out.println("enter a number");
            int c=scan.nextInt();

             System.out.println(a/c);


        }
    }
    
}
