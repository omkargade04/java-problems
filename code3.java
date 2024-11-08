import java.util.Scanner;

public class code3{

    public static void printDuplicates(int[] arr, int n) {
        int[] array = new int[1000];
        for(int i=0;i<n;i++) {
            array[arr[i]]++;
        }
        int cnt = 0;
        for(int i=0;i<1000;i++) {
            if(array[i] > 1) {
                cnt++;
            }
        }
        int[] ansarray = new int[cnt];

        for(int i=0;i<1000;i++) {
            if(array[i] > 1) {
                ansarray[j] = i;
            }
        }
        for(int i=0;i<cnt;i++) {
            System.out.print(ansarray[i] + " ");
        }

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
        System.out.println("Duplicate elements: ");
        printDuplicates(arr, n);
    }
}