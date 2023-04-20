import java.util.Scanner;
public class scn {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        for(int i=1; i<10; i--){
            System.out.println(i);
            if(i==-20){
                break;
            }
        }
        

    }
}
