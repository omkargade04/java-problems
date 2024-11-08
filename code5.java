// Part A

class NewNumbers{
    public int num1;
    public int num2;

    NewNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

public class code5 {
    public static void swap(NewNumbers pair) {
        int temp = pair.num1;
        pair.num1 = pair.num2;
        pair.num2 = temp;

    }

    public static void main(String[] args) {
        NewNumbers pair = new NewNumbers(3, 5);
        System.out.println("Before swapping: num1 = " + pair.num1 + ", num2 = " + pair.num2);
        swap(pair);
        System.out.println("After swapping: num1 = " + pair.num1 + ", num2 = " + pair.num2);
    }
}


// Part B

import java.util.Scanner;

public class code5 {

    public static double averageOfOddNumbers(int[] arr) {
        int sum = 0;
        int count = 0;

        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num; 
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No odd numbers found.");
            return 0;
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) {
            int e = sc.nextInt();
            arr[i] = e;
        }

        double average = averageOfOddNumbers(arr);
        System.out.println("Average of odd numbers: " + average);
    }
}
