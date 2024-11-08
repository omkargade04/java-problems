import java.util.Scanner;

public class code2{

    public static int sumOfOddNumbers(int n) {
        int num = 1;
        int sum = 0;
        int cnt = 0;
        while(cnt < n) {
            if(cnt % 2 == 0) {
                sum += num;
            }
            num += 2;
            cnt++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number: ");
        int n = sc.nextInt();

        int ans = sumOfOddNumbers(n);
        System.out.println("Sum of odd numbers: " + ans);
    }
}