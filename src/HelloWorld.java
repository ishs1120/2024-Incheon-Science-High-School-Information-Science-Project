import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String[] strings = {"Hi", "Hello friends", "Hello friends professor"};

//        Arrays.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//
//        });

        for (String s : strings){
            System.out.println(s);
        }
    }
}
