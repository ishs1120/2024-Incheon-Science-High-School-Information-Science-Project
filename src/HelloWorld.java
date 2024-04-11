import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello "+name+"!");
        System.out.println("How can I help you?");
        String question = scanner.next();
        System.out.println("I can't understand "+question+"!");
        System.out.println("I think you are idiot "+name+"!");
    }
}
