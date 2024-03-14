import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberStart = scanner.nextInt();
        int numberEnd = scanner.nextInt();

        for (int k = numberStart; k <= numberEnd; k++) {
            //int count = 0;
            boolean isPrimeNumber = true;
            if (k < 2) {
                //count = 1;
                isPrimeNumber = false;
            } else {
                for (int i = 2; i * i <= k; i = i + 1) {
                    if (k % i == 0) {
                        //count = count + 1;
                        isPrimeNumber = false;
                        break;
                    }
                }
                if(isPrimeNumber)
                    System.out.print(k+ " ");

            }
        }

    }
}
