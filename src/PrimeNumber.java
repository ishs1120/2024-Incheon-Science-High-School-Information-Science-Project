import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberStart = scanner.nextInt();
        int numberEnd = scanner.nextInt();

        if (numberStart>numberEnd){
            int temp = numberStart;
            numberStart = numberEnd;
            numberEnd = temp;
        }

        for (int k = numberStart; k <= numberEnd; k++) {
            if(isPrimeNumber(k)) System.out.print(k+ " ");
            //int count = 0;

        }

    }
    private  static boolean isPrimeNumber(int n){
        if (n < 2) {
            //count = 1;
            return false;
        } else {
            for (int i = 2; i * i <= n; i = i + 1) {
                if (n % i == 0) {
                    //count = count + 1;
                    return false;
                }
            }

        }
        return true;
    }
}
