package day20_ArraysContinue;
import java.util.Scanner;
public class days {
    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        int attempts = 1;
        while (num > 7 || num < 1) {
            System.out.println("Invalid Entry, please re enter the number");
            num = scan.nextInt();
            attempts++;

            if (attempts == 3 && num > 7 || (num < 1)) {
                System.exit(0);
            }
        }

        String result = days[num - 1];
            System.out.println(result);
    }
}
